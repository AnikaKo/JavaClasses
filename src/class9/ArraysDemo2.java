package class9;

public class ArraysDemo2 {
    public static void main(String[] args) {
        // 10 20 30 45 50

        int a =10;
        int b=20;
        int c=24;
        int d=30;

        int [] numbers={10,20,24,30};
        System.out.println(numbers.length);
int sum=0;
        for(int i=0; i< numbers.length; i++){
            System.out.println(numbers[i]);}
        System.out.println("*************");

        for(int i=0; i< numbers.length; i++){
            sum=sum+numbers[i];
        }
        System.out.println(sum);
    }
}
