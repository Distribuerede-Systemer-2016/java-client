import controller.Controller;

public class BookStore {

  private Controller controller;

  public BookStore() {
    this.controller = new Controller();
  }

  public static void main(String[] args) {
    new BookStore().run();
  }

  public void run() {

    while (true) {
      this.controller.showMainMenu();
    }

  }

}
