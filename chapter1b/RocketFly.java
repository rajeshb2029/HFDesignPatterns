package chapter1b;

public class RocketFly implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I am flying with rocket engine");
    }

}