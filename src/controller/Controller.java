package controller;

import view.BookView;
import view.MainMenuView;
import view.UserView;


public class Controller {

  private MainMenuView mainMenuView;
  private BookView bookView;
  private UserView userView;

  public Controller(){
    this.mainMenuView = new MainMenuView(this);
    this.bookView = new BookView(this);
    this.userView = new UserView(this);
  }

  public void showMainMenu(){
    this.mainMenuView.presentMenu();
  }

  public MainMenuView getMainMenuView() {
    return mainMenuView;
  }

  public BookView getBookView() {
    return bookView;
  }

  public UserView getUserView() {
    return userView;
  }
}
