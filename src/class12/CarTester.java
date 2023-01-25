package class12;

public class CarTester {
    public static void main(String[] args) {
        //Create the object of the class

        Car bmw=new Car();
        bmw.make="BMW";
        bmw.model="17";
        bmw.year=2023;
        bmw.color="Grey";
        bmw.moveForward();
        bmw.applyBrakes();
        // create two classes of you choice and call
        //the methods from those class

        Car audi = new Car();

        audi.model = "a car";
        audi.name = "It's a car";
        audi.price = 50000;
        audi.year=2022;
        audi.make="Audi";
        audi.color="Black";
        audi.goesFast();


    }
}
