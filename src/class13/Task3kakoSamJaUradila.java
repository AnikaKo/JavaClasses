package class13;

import java.util.Scanner;

public class Task3kakoSamJaUradila {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first name");
        String mama = input.nextLine();
        System.out.println("Enter your first name");
        String dad = input.nextLine();
        System.out.println("Boy or a girl");
        String child=input.nextLine();

        if(!mama.equals(mama.isBlank()) && !dad.equals(dad.isBlank()) ){
            if(child.equals("boy")){
                System.out.println("Danry");}
        }else {
            System.out.println("Maiel");}
    }
}
