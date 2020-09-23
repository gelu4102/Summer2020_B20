package day51_Exceptions.PetTask;

public class Tiger extends Pet {
    public Tiger(String name, String breed, char gender, String color, int age) {
        super(name, breed, gender, color, age);
    }


    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
