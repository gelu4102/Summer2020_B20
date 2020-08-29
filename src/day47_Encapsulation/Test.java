package day47_Encapsulation;

public class Test {
    public static void main(String[] args) {
        System.out.println( AccessModifiers.publicVariable );
        AccessModifiers.publicMethod();

        System.out.println(AccessModifiers.defaultVariable);
        AccessModifiers.defaultMethod();

        //System.out.println(AccessModifiers.privateVariable);//private is not visible outside its class
        //AccessModifiers.privateMethod();

        Encapsulation obj1 = new Encapsulation();
       // System.out.println(obj1.ssn);


        System.out.println(obj1.getSsn());

        obj1.setSsn(987654321);//7654321
        System.out.println(obj1.getSsn());



    }





}
