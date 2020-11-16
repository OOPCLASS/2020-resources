package ro.utcluj.model;

public interface CustomComparable {

  String getFieldToCompare();

  int compareTo(CustomComparable comparable);
}
