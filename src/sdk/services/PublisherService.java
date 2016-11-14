package sdk.services;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import sdk.connection.Connection;
import sdk.connection.ResponseCallback;
import sdk.connection.ResponseParser;
import sdk.models.Publisher;

import java.util.ArrayList;

public class PublisherService {

  private Gson gson;
  private Connection connection;

  public PublisherService() {
    this.gson = new Gson();
    this.connection = new Connection();
  }


  public void getAll(final ResponseCallback<ArrayList<Publisher>> methods) {
    HttpGet getRequest = new HttpGet(Connection.serverURL + "/publishers");

    this.connection.execute(getRequest, new ResponseParser() {

      public void payload(String json) {

        ArrayList<Publisher> publishers = gson.fromJson(json, new TypeToken<ArrayList<Publisher>>() {
        }.getType());

        methods.success(publishers);

      }

      public void error(int status) {
        methods.error(status);
      }
    });
  }

  public void create(){
    HttpPost postRequest = new HttpPost(Connection.serverURL + "/publishers");
    this.connection.execute(postRequest, new ResponseParser() {

      public void payload(String json) {

        int i = 1;

      }

      public void error(int status) {

        int i = 1;

      }
    });
  }

}
