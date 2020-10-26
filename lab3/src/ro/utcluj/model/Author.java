package ro.utcluj.model;

public class Author {

  private String name;
  private Integer numberOfPublications;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getNumberOfPublications() {
    return numberOfPublications;
  }

  public void setNumberOfPublications(Integer numberOfPublications) {
    this.numberOfPublications = numberOfPublications;
  }
}
