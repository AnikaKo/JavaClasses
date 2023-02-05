package class19;

public class ThisKeyWord {
    int a,b;


    ThisKeyWord(int a, int b){   //constructor
        this.a=a;
        this.b=b;
    }
public void sum(int a,int b){  // method   when it says void it means no return
    System.out.println("Sum of local variables is "+(a+b));
    System.out.println("Sum of instance variables is "+(this.a+this.b));
}
    public static void main(String[] args) {
        ThisKeyWord obj1=new ThisKeyWord(10,20);
        System.out.println(obj1.a);

        obj1.sum(100,200);
    }
}
