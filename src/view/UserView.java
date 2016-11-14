package view;

import controller.Controller;
import sdk.connection.ResponseCallback;
import sdk.models.AccessToken;
import sdk.models.User;
import sdk.services.UserService;

import java.util.ArrayList;
import java.util.Scanner;

public class UserView {

  private Controller controller;
  private UserService userService;
  private Scanner inputReader;

  public UserView(Controller controller) {
    this.controller = controller;
    this.userService = new UserService();
  }

  public void presentMenu(){
    System.out.println("====== User menu ======");
    System.out.println();
    System.out.println("(1) - Show all users");
    System.out.println("(2) - Login");
    System.out.println("(3) - Show user by ID");
    System.out.println("(4) - Create new user");
    System.out.println();
    System.out.println("(5) - Back to main menu");
    System.out.println();

    int choice = new Scanner(System.in).nextInt();

    switch (choice){
      case 1:
        showAll();
        presentMenu();
        break;

      case 2:
        loginMenu();
        presentMenu();
        break;

      case 3:
        showUserById();
        presentMenu();
        break;

      case 4:

        System.out.println("Create new Book:");
        presentMenu();
        break;

      case 5:
        this.controller.showMainMenu();
        break;

      default:
        System.out.println("You stupid!");
        presentMenu();
        break;
    }
  }

  private void showAll(){

    this.userService.getAll(new ResponseCallback<ArrayList<User>>() {
      public void success(ArrayList<User> users) {

        for(User user: users){
          System.out.println(user.getFirstName() + " " + user.getLastName());
        }

      }

      public void error(int status) {

      }
    });

  }

  private void showUserById(){
    System.out.println("Enter User ID:");
    String userID = new Scanner(System.in).nextLine();

    this.userService.findById(userID, new ResponseCallback<User>() {
      public void success(User user) {
        System.out.println("Found a user!");
        System.out.println();
        System.out.println("Name: " + user.getFirstName() + " " + user.getLastName());
        System.out.println("Username: " + user.getUsername());
        System.out.println("Email: " + user.getEmail());
      }

      public void error(int status) {
        System.out.println("Sorry, an error occurred, code: " + status);
      }
    });

  }

  private void loginMenu(){

    System.out.println("Please login in:");
    System.out.println("Username: ");
    String username = new Scanner(System.in).nextLine();

    System.out.println("Password: ");
    String password = new Scanner(System.in).nextLine();

    this.userService.login(username, password, new ResponseCallback<AccessToken>() {
      public void success(AccessToken data) {
        System.out.println("Hi, " + data.getUser().getFirstName() + " you have been successfully logged in!");
      }

      public void error(int status) {
        System.out.println("Darn it, something went wrong, error: " + status);
      }
    });

  }


}
