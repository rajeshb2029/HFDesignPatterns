package chapter1b;

public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I cannot fly");
    }
    
}