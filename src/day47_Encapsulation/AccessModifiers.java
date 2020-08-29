package day47_Encapsulation;

public class AccessModifiers {

    //Public:open to the world.accessible at everywhere
    public static int publicVariable = 100;

    public static void publicMethod() {
        System.out.println("public method");

    }

    //default:visible with in the same package only
     static int defaultVariable = 200;
    static void defaultMethod(){
        System.out.println("default method");
    }

    //private:only visible with in the same class
    private static int privateVariable = 300;
    private static void PrivateMethod(){
        System.out.println("private method");
    }

    public static void main(String[] args) {
        System.out.println(publicVariable);
        System.out.println(defaultVariable);
        System.out.println(privateVariable);

        publicMethod();
        defaultMethod();
        PrivateMethod();
    }
}
