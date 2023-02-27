package class21Overloading;

public class TaskArea {
    int a;
    int b;

    int calculateArea(int a, int b){
        return ((2*a)+(2*b));
    }



    int calculateArea(int a){
        return 4*a;
    }

    public static void main(String[] args) {

        TaskArea area = new TaskArea();
        area.calculateArea(10);
        area.calculateArea(10, 20);
    }
}