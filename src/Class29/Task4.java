package Class29;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
      //  4)Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Fanta");
        drinks.add("Coke");
        drinks.add("Pepsi");
        drinks.add("Soda");
        drinks.add("Tea");

        for (int i = 0; i < drinks.size(); i++) {
            String drink=drinks.get(i);
            if(drink.contains("a")||drink.contains("e")){
                drinks.set(i,"water"); //replacing
            }
        }
        System.out.println(drinks);
    }
}
