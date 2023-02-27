package class28LinkedList;
import java.util.ArrayList;
public class ArrayListVsLinkedlist {
    public static void main(String[] args) {

        // linkedLis => 160 ms  420
        // ArrayList => 67285
        long startTime=System.currentTimeMillis();
        ArrayList<String> numbers=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(0,"Test");
        }

        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);
        System.out.println(numbers);

    }
}
