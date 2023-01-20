package class9;

public class ArraysDemo {
    public static void main(String[] args) {
        String name = "Slava";
        String name2 = "Safi";
        String name3 = "Jason";
        String name4 = "Nabi";
        String name5 = "Anees";

        String[] names = {"Slava", "Safi", "Jason", "Nabi", "Anees"};
System.out.println(names[4]);
       // ili ---> System.out.println(names.length);
//write a loop to print all the names from array
        for(int i=0; i<5; i++){
            System.out.println(names[i]);}

/*for(int i=0; i<names.length; i++){
            System.out.println(names[i]);}*/
    }
}