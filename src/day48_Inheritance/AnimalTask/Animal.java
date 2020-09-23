package day48_Inheritance.AnimalTask;

public class Animal {
    public String name;
    public String size;
    public int age;
    public char gender;
    public String breed;
    public double lb;


    public void setInfo(String name, String size, int age, char gender, String breed, double lb){
        this.name=name;
        this.size=size;
        this.age=age;
        this.gender=gender;
        this.breed = breed;
        this.lb = lb;
    }


    public void eat(){
        System.out.println(name+" is eating");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }
    public String toString(){
        return "Name: "+name+", Age: "+age+", Size: "+size
                +", Gender: "+gender+", Breed: "+breed+", Weight: "+lb+" lb";
    }

}

