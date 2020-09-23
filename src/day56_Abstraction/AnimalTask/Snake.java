package day56_Abstraction.AnimalTask;

public class Snake extends Animal implements Swimable {
    @Override
    public void eat() {
        System.out.println("Snake is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Snake is playing");
    }

    @Override
    public void swim() {
        System.out.println("Snake is swimming");
    }
}
