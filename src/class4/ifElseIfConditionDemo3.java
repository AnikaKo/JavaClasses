package class4;

import java.sql.SQLOutput;

public class ifElseIfConditionDemo3 {
    public static void main(String[] args) {
        int day = 2;
        if (day == 1) {
            System.out.println("Monday"); //if block
        } else if (day==2){
            System.out.println("Tuesday"); // else block
        }
        else if (day==3){
            System.out.println("Wednesday");
        }
        else if (day==4){
            System.out.println("Thursday");
        } else if (day==5){
            System.out.println("Friday");
        } else if(day==6){
            System.out.println("Saturday");
        } else {System.out.println("wrong day number");}//else ako hocemo d odstampa nesto na kraju
        // i mora da se stavi na kraju kao poslednja opcija
    }
}
