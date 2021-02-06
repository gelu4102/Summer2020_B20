package recapConstructor;

public class practice2 {

    String name;
    String age;
    char gender;
    int salary;

    static boolean hasSalary;
    static String companyName;

    static {
        hasSalary = true;
        companyName = "EBC";
    }

    public practice2(){

    }

    public practice2(String name, String age, char gender, int salary){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "practice2{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }
    // any method without static is instance method
    public void instance(){

    }
    public static int age(int a, int c){
        return a + c;
    }
    public static void name(){
        System.out.println("Gelila is Stupid");
    }

    public static void main(String[] args) {
        System.out.println("age(20 + 30) = " + age(20, 30));
        practice2 practice2 = new practice2("yonas","57",'M',10000);
        practice2.instance();



    }
}
