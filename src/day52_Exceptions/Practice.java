package day52_Exceptions;

public class Main {
    public static void main(String[] args) {
       try {
           System.out.println(9 / 0);
       }catch (ArithmeticException e){
           System.out.println(e.getMessage());
       }
        System.out.println("test completed");
    }
}
