package ro.utcluj;

import java.util.Arrays;
import ro.utcluj.model.Apple;
import ro.utcluj.model.CustomComparable;
import ro.utcluj.model.Discountable;
import ro.utcluj.model.Doll;
import ro.utcluj.model.Laptop;
import ro.utcluj.model.Product;

public class Main {

  public static void main(String[] args) {
    Product[] products = new Product[100];
    products[0] = new Laptop();
    products[0].setName("laptop");
    products[0].printDetails();
//    Discountable discountable = new Doll();


    Doll[] dolls = new Doll[3];
    dolls[0] = new Doll("white");
    dolls[1] = new Doll("gray");
    dolls[2] = new Doll("blue");
    print(dolls);
    Arrays.sort(dolls);
    print(dolls);

    Apple[] apples = new Apple[10];
    apples[0] = new Apple("b");
    apples[1] = new Apple("d");
    apples[2] = new Apple("a");
    customSort(apples);
  }

  private static void print(Doll[] dolls) {
    for (Doll doll : dolls) {
      System.out.println(doll.getColor());
    }
  }

  private static void customSort(CustomComparable[] objects) {
    // implemenaatati un cevea blabla
  }
}
