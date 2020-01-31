package chapter1b;

public class WoodenDuck extends Duck{

    public WoodenDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I am a WoodenDuck");
    }

}