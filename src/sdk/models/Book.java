package sdk.models;

import java.util.ArrayList;

public class Book extends BaseModel {

  private String title;
  private String subtitle;
  private int pageCount;
  private int edition;
  private int isbn;
  private int price;
  private ArrayList<Author> authors;
  private Publisher publisher;
  private String publisherId;
  private String[] authorIds;

  public Book(String title, String subtitle, int pageCount, int edition, int isbn, int price, ArrayList<Author> authors, Publisher publisher) {
    this.title = title;
    this.subtitle = subtitle;
    this.pageCount = pageCount;
    this.edition = edition;
    this.isbn = isbn;
    this.price = price;
    this.authors = authors;
    this.publisher = publisher;
  }

  public Book(){

  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getSubtitle() {
    return subtitle;
  }

  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }

  public int getPageCount() {
    return pageCount;
  }

  public void setPageCount(int pageCount) {
    this.pageCount = pageCount;
  }

  public int getEdition() {
    return edition;
  }

  public void setEdition(int edition) {
    this.edition = edition;
  }

  public int getIsbn() {
    return isbn;
  }

  public void setIsbn(int isbn) {
    this.isbn = isbn;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public ArrayList<Author> getAuthors() {
    return authors;
  }

  public void setAuthors(ArrayList<Author> authors) {
    this.authors = authors;
  }

  public Publisher getPublisher() {
    return publisher;
  }

  public void setPublisher(Publisher publisher) {
    this.publisher = publisher;
  }

  public String getPublisherId() {
    return publisherId;
  }

  public void setPublisherId(String publisherId) {
    this.publisherId = publisherId;
  }

  public String[] getAuthorIds() {
    return authorIds;
  }

  public void setAuthorIds(String[] authorIds) {
    this.authorIds = authorIds;
  }
}
