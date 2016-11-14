package view;

import controller.Controller;
import org.apache.http.client.methods.HttpGet;
import sdk.connection.Connection;
import sdk.connection.ResponseCallback;
import sdk.models.Author;
import sdk.models.Book;
import sdk.services.BookService;

import java.util.ArrayList;
import java.util.Scanner;

public class BookView {

  private Controller controller;
  private BookService bookService;
  private Scanner inputReader;

  public BookView(Controller controller) {
    this.controller = controller;
    this.bookService = new BookService();
  }

  public void presentMenu() {
    System.out.println("====== Books menu ======");
    System.out.println();
    System.out.println("(1) - Show all books");
    System.out.println("(2) - Show book by ID");
    System.out.println("(3) - Create new book");
    System.out.println();
    System.out.println("(4) - Back to main menu");
    System.out.println();

    int choice = new Scanner(System.in).nextInt();

    switch (choice) {
      case 1:
        showAllBooks();
        presentMenu();
        break;

      case 2:
        System.out.println("Input Book ID:");
        String id = new Scanner(System.in).nextLine();
        showBookById(id);
        presentMenu();
        break;

      case 3:
        System.out.println("Create new Book:");
        presentMenu();
        break;

      case 4:
        this.controller.showMainMenu();
        break;

      default:
        System.out.println("You stupid!");
        presentMenu();
        break;
    }

  }

  public void showBookById(String id) {
    this.bookService.findById(id, new ResponseCallback<Book>() {
      public void success(Book data) {
        System.out.println("Found book!");
        System.out.println();
        System.out.println("Title: " + data.getTitle());
      }

      public void error(int status) {

      }
    });
  }

  public void createBook(Book book) {

  }

  public void showAllBooks() {

    System.out.println("====== Showing all Books ======");

    this.bookService.getAll(new ResponseCallback<ArrayList<Book>>() {
      public void success(ArrayList<Book> books) {
        for (Book book : books) {
          System.out.println("Title: " + book.getTitle());
          System.out.println("Subtitle: " + book.getSubtitle());
          System.out.println("Price: " + book.getPrice());
          System.out.println("Authors:");

          for (Author author : book.getAuthors()) {
            System.out.println("\tName: " + author.getFirstName() + " " + author.getLastName());
          }
        }
      }

      public void error(int status) {
        System.out.println("Error: " + status);
      }
    });
  }


}
