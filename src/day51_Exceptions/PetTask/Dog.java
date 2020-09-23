package day51_Exceptions.PetTask;

public class Dog extends Pet {
    public Dog(String name, String breed, char gender, String color,int age) {
        super(name, breed, gender, color,age);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}