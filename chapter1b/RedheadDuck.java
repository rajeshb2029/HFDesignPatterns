package chapter1b;

public class RedheadDuck extends Duck{

    public RedheadDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a RedheadDuck");
    }

}