package Class29;

import java.util.ArrayList;

public class Task1Homework {
    public static void main(String[] args) {


    /*1) Create an ArrayList that will store 5 names into it.
    Find out whether the given ArrayList is empty or not?
    Check whether the specific name is present in an ArrayList or not?
    Find the size of your arrayList and print all values from that*/

        ArrayList<String> names = new ArrayList<>();
        names.add("Anika");
        names.add("Mimi");
        names.add("Ljix");
        names.add("Cecana");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Anika"));
        System.out.println(names.size());
        System.out.println(names);
    }
}
