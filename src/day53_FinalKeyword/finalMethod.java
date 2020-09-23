package day53_FinalKeyword;

class A{

    public A(){

    }

    public final void method1(){
        System.out.println("Enter username and password");
    }

    private final void method1(int a){

    }
    private final void method2(int b){

    }
}

public class finalMethod extends A {
    /*
    @Override
    public void method1(){
        System.out.println("Enter something else");
    }
     */

    public final static void main(String[] args) {
        System.out.println("Hello");

    }
}
