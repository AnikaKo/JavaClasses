package class17;

public class Task3 {
 /*  3) Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
  Method should be available inside the class only where it was declared and executed by calling it is name. */

     /*return type---> String
    name ---> getOnlyVowels
    parameter--->  String inputStr */

//  String getOnlyVowels(String inputStr){
private static String getOnlyVowels(String inputStr){
    return inputStr.replaceAll("[^AEIOUYaeiouy]","");
}

    public static void main(String[] args) {
        System.out.println(getOnlyVowels("Java"));


    }
}
