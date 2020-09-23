package day51_Exceptions;

import java.util.ArrayList;

public class ExceptionHandling {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();//empty(run time exception)
        String exceptionMessage = "";

        try {
            System.out.println(list.get(1));

        }catch (IndexOutOfBoundsException e) {
            exceptionMessage = e.getMessage();

        }

        System.out.println("Next step");
        System.out.println(exceptionMessage);





    }
}
