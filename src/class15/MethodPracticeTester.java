package class15;

public class MethodPracticeTester {
    public static void main(String[] args) {
        MethodPractice rd = new MethodPractice();
        boolean result = rd.isEven(15);

        System.out.println(result);

        //call this number for number 100 and 12 20

        System.out.println("**************");
        boolean result1 = rd.isEven(100);

        System.out.println(result1);
        System.out.println("**************");
        boolean result2 = rd.isEven(12);

        System.out.println(result2);
        System.out.println("**************");
        boolean result3 = rd.isEven(20);//we can use only sout

        System.out.println(result3);

    }
}
