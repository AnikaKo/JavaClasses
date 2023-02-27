package Class29;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //Dog d1=new Dog("Jacky", "Persian",15);

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Jacky", "Persian", 15));
        dogs.add(new Dog("Jacmi", "German", 11));
        dogs.add(new Dog("Jimi", "Terrier", 14));
        dogs.add(new Dog("Jhony", "Pit BUll", 12));

        for (Dog d:dogs) {
            d.printDogName();

        }


    }
}