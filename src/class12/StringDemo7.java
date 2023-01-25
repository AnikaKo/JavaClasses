package class12;

public class StringDemo7 {
    public static void main(String[] args) {
        String str="I love java";
        boolean startsWith=str.startsWith("I love");
        System.out.println(startsWith);

        String str1="I love Java";
        System.out.println(str1.endsWith("Java"));

        //Method chaining is when multiple mwthods are called on the same line
        //only those methods can be chained which returns a String
        System.out.println(str.toLowerCase().startsWith("i"));
        //System.out.println(str.length().startsWith("i"));

        System.out.println(str.contains("java"));
    }
}
