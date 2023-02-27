package Class29;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {
        ArrayList<Double> numbers=new ArrayList<>();
        numbers.add(10.0);
        numbers.add(15.2);
        numbers.add(20.0);
        numbers.add(30.5);
        numbers.add(40.5);
        numbers.add(10.3);

    /*   for(Double number:numbers){
            if(number>11){
                numbers.remove(number);
            }
        }*/
//ne mogu da se rade dve operacije da se prolazi kroz elemente i brise. to ne moze u enhenced i reg loop
        //numbers.removeIf(number->number >11); java 8
       // System.out.println(numbers);

     Iterator<Double> iterator=numbers.iterator();
     /*   System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(numbers);
*/

        while(iterator.hasNext()){
            double number= iterator.next();
            if(number>11){
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
