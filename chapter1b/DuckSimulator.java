package chapter1b;

public class DuckSimulator{

    private void launchSimulation1(){
        MallardDuck duck1 = new MallardDuck();
        RedheadDuck duck2 = new RedheadDuck();
        RubberDuck duck3 = new RubberDuck();
        WoodenDuck duck4 = new WoodenDuck();

        System.out.println("Duck simualtion");
        duck1.display();
        duck1.performQuack();
        duck1.performFly();
        duck1.swim();

        System.out.println();
        duck2.display();
        duck2.performQuack();
        duck2.performFly();
        duck2.swim();

        System.out.println();
        duck3.display();
        duck3.performQuack();
        duck3.performFly();
        duck3.swim();

        System.out.println();
        duck4.display();
        duck4.performQuack();
        duck4.performFly();
        duck4.swim();
    }

    public static void main(String[] args){
        DuckSimulator simulator = new DuckSimulator();

        simulator.launchSimulation1();;
    }
}