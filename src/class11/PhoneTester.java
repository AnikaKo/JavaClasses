package class11;

public class PhoneTester {
    public static void main(String[] args) {
        Phone iphone=new Phone();
        iphone.brand="Apple";
        iphone.color="Black";
        iphone.system="Ios";
        iphone.call();

        Phone pixel=new Phone();
        pixel.brand="Google";
        pixel.color="White";
        pixel.system="Microsoft";
        pixel.text();

        Phone samsung=new Phone();
        samsung.brand="Samsung";
        samsung.color="Grey";
    samsung.system="Android";
    samsung.video();
    }
}
