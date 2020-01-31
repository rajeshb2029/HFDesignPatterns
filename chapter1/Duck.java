package chapter1;

public abstract class Duck {
    public void quack() {
        System.out.println("I am quacking");
    }

    public void swim() {
        System.out.println("I am swimming");
    }

    public abstract void display();
}