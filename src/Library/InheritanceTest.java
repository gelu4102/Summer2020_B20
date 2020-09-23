package Library;

import day50_Inheritance_Overriding.AccessModifiers;

public class InheritanceTest extends AccessModifiers {


    public static void main(String[] args) {

        System.out.println(InheritanceTest.publicData);//public is visible out side its package
        System.out.println(InheritanceTest.protectedData);//protected is visible to any child class
        //System.out.println(InheritanceTest.defaultData);//is not visible out side its package





    }

}
