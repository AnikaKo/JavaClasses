package class21Overloading;

public class  Task2 {
    //Create 1 class with a static method that has 3 overloaded
    // forms. Then call each overloaded method with specific arguments and observe result.
    static void method(String str1) {
        System.out.println("Method with one String");
    }

    static void method(String str1, String str2) {
        System.out.println("Method with two Strings");
    }

    static void method(String str1, String str2, String str3) {
        System.out.println("Method with three Strings");
    }

    public static void main(String[] args) {

        Task2.method("One");
        Task2.method("One", "Two");
        Task2.method("One", "Two", "Three");
    }
}
