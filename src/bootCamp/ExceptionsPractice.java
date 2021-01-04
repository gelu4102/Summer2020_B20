package bootCamp;

import java.io.IOException;
import java.util.NoSuchElementException;

public class ExceptionsPractice {
    public static void main(String[] args) {
        try {
            throw new NoSuchElementException();
        }catch (RuntimeException e){
            System.out.println("Catch Block");
            //System.exit(0);
        }finally {
            System.out.println("Finally Block");
        }

        System.out.println("Hello Batch 20");
       // throw new ArithmeticException();
      // method1();
        method2();
    }
    public static void method1()throws IOException{
        throw new IOException();
    }
    public static void method2(){
       try {
           throw new IOException();
       }catch (IOException e){

       }
    }

}
