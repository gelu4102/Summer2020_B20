package day51_Exceptions.PetTask;

public class Cat extends Pet {
    public Cat(String name, String breed, char gender, String color, int age) {
        super(name, breed, gender, color, age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
