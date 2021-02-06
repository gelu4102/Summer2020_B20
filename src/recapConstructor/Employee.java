package recapConstructor;

public class Employee {


    String name;
    String job_title;
    int age;
    char gender;

    static boolean isEmployed;
    static String companyName;

    static{
        isEmployed = true;
        companyName = "CybertekSchool";
    }

    public Employee(){ }

    public Employee(String name, String job_title, int age, char gender){
        this.name = name;
        this.job_title = job_title;
        this.age = age;
        this.gender = gender;
    }

    public String toString(){
        return "Name "+name+"\n"+"Job Title "+job_title+"\n"+"Age "
                +age+"\n"+"gender "+gender +"\n"+"Employed "+isEmployed+"\n"
                +"Company Name "+companyName;
    }


    private int ID;
    private  double salary;
    private String address;

    public void setID(int ID){
        this.ID = ID;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public int getID(){
        return ID;
    }

    public double getSalary(){
        return salary;
    }

    public String getAddress(){
        return address;
    }

    public static void accessModifier(){
       Employee.specifiers();
       Employee employee = new Employee();
       employee.specifiersNoStatic();
    }

    // inside a package and in sub classes
    protected int accessModi(int a, int b){

        return a+b;
    }
    // only visible inside same package
    void defaultAccess(){ }

    private void privateAccess(){ }
  //access modifier/ specifier/ return type/ name()
    //
    public static void specifiers(){
        // static only accepts static variable or static methods
    }
    // to access instance method or variables inside a static method first
    // we need to create an object of the class.
    public void specifiersNoStatic(){
        // void means no return
        int c = 2;
        int d = 3;
        System.out.println(d - c);

    }

    public int sumNum(int a, int b){
        return a + b;
    }

    public boolean hasHired(){
        return true;
    }


    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.name = "Gelila";
        employee.age = 34;
        employee.job_title = "SDET";
        employee.gender = 'F';
        System.out.println(employee);

        Employee employee1 = new Employee("Gelila", "SDET", 35, 'F');

        int r = employee.sumNum(2, 5);
        employee.specifiersNoStatic();

        r = r -5;
        System.out.println(r);
        boolean b1 = employee.hasHired();
        b1 = false;
        System.out.println(b1);
    }






}
