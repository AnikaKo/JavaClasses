package class13;

public class Task2 {
    public static void main(String[] args) {
        //  2) Create a String and print it in reverse order (Sunday → yadnuS).
        String day="Sunday";

        for(int i=day.length()-1; i>=0; i--) {
            System.out.print(day.charAt(i));
        }

// drugi nacin
        for(int i=0; i<day.length(); i++) {
            System.out.print(day.charAt(day.length()-1-i));
        }
    }
}
