package chapter1a;

public class DuckSimulator{

    private void launchSimulation1(){
        MallardDuck duck1 = new MallardDuck();
        RedheadDuck duck2 = new RedheadDuck();

        System.out.println("Duck simualtion");
        duck1.display();
        duck1.quack();
        duck1.swim();

        System.out.println();
        duck2.display();
        duck2.quack();
        duck2.swim();
    }

    public static void main(String[] args){
        DuckSimulator simulator = new chapter1a.DuckSimulator();

        simulator.launchSimulation1();;
    }
}