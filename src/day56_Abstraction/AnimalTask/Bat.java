package day56_Abstraction.AnimalTask;

public class Bat extends Animal implements Flyable {
    @Override
    public void eat() {
        System.out.println("Bate is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Bate is Sleeping");
    }

    @Override
    public void fly() {
        System.out.println("Bate is flying");
    }
}
