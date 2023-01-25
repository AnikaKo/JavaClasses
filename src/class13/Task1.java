package class13;

public class Task1 {
    public static void main(String[] args) {
        // Create a String and if the String is not empty perform the following:
        //if the String has an odd number of characters and has 3 or more
        // characters, print the character in the middle of the String.
        //For Example String str=hello =>l
        String string = "hello";
        if (!string.isEmpty()) {

            if (string.length() % 2 != 0 && string.length() > 3) {//checks if number of character is odd
                int mid = string.length() / 2;
                System.out.println(string.charAt(mid));
            }
        }
    }
}