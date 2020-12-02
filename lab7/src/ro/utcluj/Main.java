package ro.utcluj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    List<String> list = new LinkedList<>();
    list.add("test");
    list.remove("test");

    Set<String> set = new HashSet<>();
    set.add("my-element");
    set.remove("my-element");

    Map<String, Integer> map = new HashMap<>();
    map.put("alex", 25);
    map.put("alex", 27);
    map.put("ion", 22);

    Map<String, List<Student>> studentsBySchoolName = new HashMap<>();

    // adaugati cate 2 studenti la cel putin 3 scoli
    // afisati numele studentilor de la toate scolile
    // stergeti un student de la o anumita scoala
    // adaugati un alt student la o anumita scoala

    Map<String, List<Person>> personsByCity = new HashMap<>();
  }
}
