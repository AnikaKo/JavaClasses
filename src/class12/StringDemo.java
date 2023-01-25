package class12;

public class StringDemo {
    public static void main(String[] args) {
        //Creating an object of the String class
        String strObj=new String ( "Java");
        //another way of crating an object of String class a shoter way
        // mostly this is how we crate the objects of String class
        String strObj2="Java";
        System.out.println(strObj2.length());
        String str="Banana ";
        int len=str.length();
        System.out.println(len);
        String name=" Rafik poya ";
        if(name.length()>10){
            System.out.println("Name can't be more than 10 letters");
        }
    }
}
