package chapter1;

public class DuckSimulator{

    private void launchSimulation1(){
        MallardDuck duck1 = new MallardDuck();
        RedheadDuck duck2 = new RedheadDuck();

        duck1.display();
        duck1.quack();
        duck1.swim();

        System.out.println();
        duck2.display();
        duck2.quack();
        duck2.swim();
    }

    public static void main(String[] args){
        DuckSimulator simulator = new DuckSimulator();

        simulator.launchSimulation1();;
    }
}