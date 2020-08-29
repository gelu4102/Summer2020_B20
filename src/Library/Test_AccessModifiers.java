package Library;

import day47_Encapsulation.AccessModifiers;

public class Test_AccessModifiers {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicVariable);
        AccessModifiers.publicMethod();

       // System.out.println(AccessModifiers.defaultVariable);//default is not accessible outside its package.
       // AccessModifiers.defaultMethod();

       // System.out.println(AccessModifiers.privateVariable);//private is not outside its class
        //AccessModifiers.privateMethod();


    }

}
