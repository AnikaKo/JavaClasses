package class4;

public class ifElseIfConditions4 {
    public static void main(String[] args) {
        int number1=10;
        int number2=20;

        if(number1==number2){
            System.out.println("Numbers are equal");
        }
        if(number1>number2){
            System.out.println("Number1 is greater than number2");
        }
        if(number2>number1){
            System.out.println("Number2 is greater than number1");
        } //tako sam ja uradila a treba ovako
        if(number1==number2){
            System.out.println("Numbers are equal");
        }
        else if(number1>number2){
            System.out.println("Number1 is greater than number2");
        }
        else if (number2>number1){
            System.out.println("Number2 is greater than number1");
        }
    }
}
