package Class29;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        //)Create an arraylist of cars and retrieve all the values using 3 different ways.
        ArrayList<String> cars=new ArrayList<>();
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Tesla");

        for(String car: cars){
            System.out.println(car);
        }



        for (int i = 0; i < cars.size(); i++) {
            String car = cars.get(i);
            System.out.println(car);
        }
    }
}
