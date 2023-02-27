package class25Interface;

public interface MovAble {
    void move();
}
interface OwnAble{
    void own();
}
class Car implements MovAble, OwnAble{
    @Override
    public void move() {
        System.out.println("I can move");

    }

    @Override
    public void own() {
        System.out.println("you van own me");

    }
}

class Dog implements MovAble, OwnAble{
    @Override
    public void move() {
        System.out.println(" I can move you ");

    }

    @Override
    public void own() {
        System.out.println("you can own me ");
    }
}