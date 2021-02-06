package recapConstructor;

import javafx.scene.Scene;

import java.io.InputStream;
import java.util.Scanner;

public class SelfPractice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pleas enter number between 1 to 7");
        int num = scan.nextInt();
        String days = "";

        if (num <= 0 && num >= 8 ) {
            System.out.println("Pleas enter a number between 1-7");
            num = scan.nextInt();
        }

             if (num > 0 && num <= 7){
                 switch (num){
                     case 1:
                      days = "Monday";
                         break;
                     case 2:
                         days = "Tuesday";
                         break;
                     case 3:
                         days = "Wednesday";
                         break;
                     case 4:
                         days = "Thursday";
                         break;
                     case 5:
                         days = "Friday";
                         break;
                     case 6:
                         days = "Saturday";
                         break;
                     case 7:
                         days = "Sunday";
                         break;

                 }

        }
        System.out.println(days);

    }
}
