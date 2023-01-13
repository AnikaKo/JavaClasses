package class4;

public class vezbanjeRetel {
    public static void main(String[] args) {
        int myNumber=5;
        int originalNumber=(int)myNumber;
        int stepOne=originalNumber*originalNumber;
        int stepTwo=stepOne+originalNumber;
        int stepThree=stepTwo/originalNumber;
        int stepFour=stepThree+17;
        int stepFive=stepFour-originalNumber;
        int stepSix=stepFive/6;
        System.out.println("The magic number is "+stepSix);
    }
}
