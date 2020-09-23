package day51_Exceptions;

public class ExceptionsIntro {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        System.out.println("Test started");

       // System.out.println(arr[100]);//unchecked exceptions(unexpected event)

        //Thread.sleep(3000);//checked exception(unwanted event)

       String str = "Cybertek";

        System.out.println(str.charAt(-1));//unchecked

        System.out.println("Step 2");



    }
}
