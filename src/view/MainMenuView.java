package view;

import controller.Controller;

import java.util.Scanner;

public class MainMenuView {

  private Controller controller;

  public MainMenuView(Controller controller){
    this.controller = controller;
  }

  public void presentMenu() {

    System.out.println("======= Welcome to the BookStore ========");
    System.out.println();
    System.out.println("Main menu");
    System.out.println("(1) - Books");
    System.out.println("(2) - Authors");
    System.out.println("(3) - Publishers");
    System.out.println("(4) - Users");
    System.out.println();
    System.out.println("(5) - Shut down store");

    Scanner inputReader = new Scanner(System.in);
    int choice = inputReader.nextInt();

    switch (choice) {

      case 1:
        this.controller.getBookView().presentMenu();
        break;

      case 2:
      case 3:
        System.out.println("Sorry, noy implemented");
        presentMenu();
        break;

      case 4:
        this.controller.getUserView().presentMenu();
        break;

      case 5:


      default:
        System.out.println("U stupid!");
        presentMenu();
        break;
    }
  }


}
