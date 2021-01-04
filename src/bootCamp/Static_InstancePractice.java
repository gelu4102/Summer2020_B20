package bootCamp;

class Person{

    /*
    instance: name,age, gender
    static: common future
          isHuman,numberOfEyes
     */
    public String name;
    public int age;
    public char gender;
    //instanceBlock no arguments but constructor that is default{}


    //must be the same as the class name //creating object//constructor to
    public Person(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static boolean isHuman = true;
    public static int numberOfEyes = 2;
    static {
        isHuman = true;
        numberOfEyes = 2;
    }
}
public class Static_InstancePractice {
    public static void main(String[] args) {
        Person person1 = new Person("Musa",28,'M');
        //person1.name= "Musa";

        Person person2 = new Person("Mike",28, 'M');
        //person2.name = "Mike";

        System.out.println(person1.name);
        System.out.println(person2.name);

        System.out.println(person1.numberOfEyes);
        System.out.println(person2.numberOfEyes);

        System.out.println(Person.numberOfEyes);


    }


}
