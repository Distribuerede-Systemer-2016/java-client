package sdk.models;

import java.util.Date;

/**
 * Created by jesperbruun on 11/11/2016.
 */
public class Author extends BaseModel {

  private String firstName;
  private String lastName;

  public Author(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}
