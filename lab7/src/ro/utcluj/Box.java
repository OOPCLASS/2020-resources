package ro.utcluj;

public class Box<T, U> {

  private String label;
  private T content;
  private U value;

  public T getContent() {
    return content;
  }

  public void setContent(T content) {
    this.content = content;
  }

  public U doSomething(T content) {
    System.out.println("aaa");
    return value;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Integer add(T value) {
    return 10 + (Integer) value;
  }
}
