package chapter1b;

public class RubberDuck extends Duck{

    public RubberDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I am a RubberDuck");
    }

}