package day56_Abstraction.AnimalTask;

public class Penguin extends Animal implements Swimable,Playable {
    @Override
    public void eat() {
        System.out.println("Penguin is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Penguin is sleeping");
    }

    @Override
    public void swim() {
        System.out.println("Penguin is swimming");
    }

    @Override
    public void play() {
        System.out.println("Penguin is playing");
    }
}
