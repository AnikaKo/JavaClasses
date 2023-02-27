package class27WrapperClassArrL;
import java.util.ArrayList;
public class Demo7 {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Fizzy");
        names.add("Savo");
        names.add("Sam");
        names.add("Urwa");
        names.add("Tarik");
        names.add("Abeera");

        System.out.println(names.contains("Daria"));
        System.out.println(names);
        names.remove("Sam");
        System.out.println(names);
        names.set(3,"Sam");
        System.out.println(names);
        System.out.println(names.indexOf("Savo"));
        System.out.println("***************");
        names.add(3,"Amika");
        System.out.println(names);
        System.out.println(names.get(5));
        System.out.println(names.size());


        // break till 1:52



    }
}
