package class17;

public class Task2 {
    /*2) Create a method that will take a String as a parameter and returns reversed String. Method should be available
    to all classes within your project and accessible by class name.*/



    public static String reverseStr(String input){
        return new StringBuilder(input).reverse().toString();

    }

    public static void main(String[] args) {
        reverseStr("Monday");//if we are in the same class we
        // dont need the class name as well if the method is static
    }
    /* public static void main(String[] args) {
       Task2 task2=new Task2();
        task2.reverseStr("Monday");* */

  //ako stavimo static onda ne moramo da ovo iznad vec samo da call the method






    }





