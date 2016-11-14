package sdk.models;

public class Publisher extends BaseModel {

  private String name;

  public Publisher(String name) {
    this.name = name;
  }
  public Publisher(){}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
