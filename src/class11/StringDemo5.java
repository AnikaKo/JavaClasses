package class11;

public class StringDemo5 {
    public static void main(String[] args) {
        String str = "Java";
        String str2 = "Java";
        boolean areEqual = str.equals(str2);
        System.out.println(areEqual);

        String str3 = "Java";
        String str4 = "JAVA";// CASE SENSETIVE    boolean areEqual1=str3.equalsIgnoreCase(str4);
        boolean areEqual1 = str3.equals(str4);
        System.out.println(areEqual1);
    }
}
