package class9;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*2) Create a program that will be asking user
         to apply for a credit card 10 times. As soon you get an “yes” from a user program should stop asking.
         */
        Scanner input=new Scanner(System.in);
        for(int i=0; i<10; i++){
            System.out.println("Do you need a credit card");
            String response=input.next();
            if(response.equalsIgnoreCase("yes")){
                break;
            }
        }



    }
}
