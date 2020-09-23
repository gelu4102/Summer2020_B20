package day51_Exceptions.PetTask;
/*
 Animal Task:
            1. create a class called Pet
                    attributes:
                            name, age, gender, breed, color
                    create a constructor that can initialize the instances
                   instance methods (with protected access modifiers):
                            eat(): by default assume all Pets eat  chocolate
                            drink(): by default assume all Pets drink milk
                            sleep(): by default assume all Pet sleep on the floor
                            toString():

 */
public class Pet {

    public String name;
    public String breed;
    public char gender;
    public String color;
    public int age;

    public Pet(String name,String breed,char gender,String color,int age){
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.color = color;
        this.age = age;
    }

    protected void eat(){
        System.out.println(name +" is eating chocolate");
    }

    protected void drink(){
        System.out.println(name +" is drinking milk");
    }

    protected void sleep(){
        System.out.println(name+" is sleeping on the floor");
    }

    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", color='" + color + '\'' +
                ", age = "+age+'\'' +
                '}';
    }
}
