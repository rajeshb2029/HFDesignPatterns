package chapter1b;

public class DuckSimulator{

    private void launchSimulation1(){
        MallardDuck mallardDuck = new MallardDuck();
        RedheadDuck readheadDuck = new RedheadDuck();
        RubberDuck rubberDuck = new RubberDuck();
        WoodenDuck woodenDuck = new WoodenDuck();

        System.out.println("Duck simualtion");
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();
        mallardDuck.swim();

        System.out.println();
        readheadDuck.display();
        readheadDuck.performQuack();
        readheadDuck.performFly();
        readheadDuck.swim();

        System.out.println();
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performFly();
        rubberDuck.swim();

        System.out.println();
        woodenDuck.display();
        woodenDuck.performQuack();
        woodenDuck.performFly();
        woodenDuck.swim();
        woodenDuck.setFlyBehavior(new RocketFly());
        woodenDuck.performFly();
    }

    public static void main(String[] args){
        DuckSimulator simulator = new DuckSimulator();

        simulator.launchSimulation1();;
    }
}