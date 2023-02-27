package Class29;

import java.util.HashMap;

public class MapDemo {
    public static  void main(String[] args) {
        HashMap<String,Integer> groceries=new HashMap<>();
        groceries.put("eggs",10);
        groceries.put("milk",5);
        groceries.put("bread",30);
        groceries.put("rice",5);
        groceries.put("meat",6);
        groceries.put("fish",5);
        System.out.println(groceries.get("rice"));
        System.out.println(groceries);

        System.out.println(groceries.isEmpty());
        System.out.println(groceries.size());


    }

}
