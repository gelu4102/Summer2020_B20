package day56_Abstraction.AnimalTask;

public class Turtle extends Animal implements Swimable {
    @Override
    public void eat() {
        System.out.println("Turtle is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Turtle is sleeping");
    }

    @Override
    public void swim() {
        System.out.println("Turtle is swimming");
    }
}
