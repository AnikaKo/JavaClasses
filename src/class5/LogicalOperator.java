package class5;

public class LogicalOperator {
    public static void main(String[] args) {
        if (10 > 5 || 4 > 6) {
            System.out.println("1");
        } else {
            System.out.println("2");
        }

        String name = "Adam";
        int age = 32;

        if (name.equals("Adam") && age == 30) {
            System.out.println("you are Adam from batch 13");
        } else {
            System.out.println("i dont know you");
        }

        boolean cond = false;
        boolean condition = !cond;
        System.out.println(condition);

        if (condition) {
            System.out.println("you got it");
        } else {
            System.out.println("Need more practice");
        }
    }
}
