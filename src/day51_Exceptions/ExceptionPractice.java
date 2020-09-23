package day51_Exceptions;

import Library.Util;

public class ExceptionPractice {

    public static void main(String[] args) {

        System.out.println("Hello");
      /* try {
           Thread.sleep(5000);
       }catch (InterruptedException e){

       }

       */
        sleep(3);
        System.out.println("World");
       /*try {
           Thread.sleep(3000);
       }catch (InterruptedException e ){

       }

        */
        sleep(5);
        System.out.println("How are you");

        Util.sleep(10);
        System.out.println("Good bye");
    }
    public static void sleep(double seconds){
       try {
           Thread.sleep((long)seconds * 1000);
       }catch (InterruptedException e){

       }
    }
}
