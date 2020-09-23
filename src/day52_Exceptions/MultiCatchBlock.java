package day52_Exceptions;

public class MultiCatchBlock {
    public static void main(String[] args) {
        int[] arr = {10,20};
        try{
            System.out.println(arr[20]);//ArrayIndexOutOfBound
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception is handled");
        }catch (ClassCastException e){
            System.out.println("Class Cast Exception");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception ");
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of Bound Exception");
        }catch (RuntimeException e){
            System.out.println("Run time Exception");
        }
        //Catch(NoSuchElementException e){}

        System.out.println("=========================================");

        String str = "Cybertek";
        try {
            System.out.println(str.charAt((200)));
        }catch (RuntimeException e){//RunTimeException can handle any unchecked exception
            System.out.println(e.getMessage());
        }

        System.out.println("========================================");
       try {
           Thread.sleep(1000);
       }catch (Exception e){

       }

        System.out.println("==============================================");

       try{
           System.out.println(8/0);
           System.out.println("Try Block");
       }catch (ArithmeticException e){
           System.out.println("Catch Block");
       }finally {
           System.out.println("Finally Block");
       }
        System.out.println("completed");

    }
}
