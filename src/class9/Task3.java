package class9;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //3) Write a program that reads a range of integers (start and end point),
        // provided by a user and then from that range prints the sum of the even and odd integers.
        Scanner input=new Scanner(System.in);
        int evenSum=0;
        int oddSum=0;
        System.out.println("Please enter two numbers");
        int start= input.nextInt();
        int end= input.nextInt();
        for(int i=start; i<=end; i++){
            if(i%2==0){
               evenSum+=i;}  //can also be written like this
            else{oddSum=oddSum+i;}  // can also be written like this
        }

        System.out.println(evenSum+oddSum);






    }
}
