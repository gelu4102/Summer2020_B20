package practice01;

import java.util.ArrayList;
import java.util.Arrays;

public class WordApperance {

    public static void main(String[] args) {
        System.out.println(appearsTwice("Hello","Hello java world hello"));
        System.out.println(appearTwice2("Hello", "Hello java world hello"));

        String[] arr = {"apple", "pear"};

        System.out.println(Arrays.toString(reverse(arr)));
    }

    public static boolean appearsTwice(String target, String sentence) {
        //write your codes here:
        int count = 0;
        int tarLength = target.length(); // 5
        for(int i = 0; i <= sentence.length()-tarLength; i++) {
            if (sentence.substring(i, i + tarLength).equalsIgnoreCase(target)) {
                count++;
            }
        }

        if(count == 2) {
            return true;
        }

        return false;
    }

    public static boolean appearTwice2(String target, String sentence){

        int count = 0;
        for(int i = 0; i <= sentence.length()-target.length(); i++){
          if(sentence.substring(i, i+target.length()).equalsIgnoreCase(target)){
              count++;
          }
        }
        if(count == 2){
            return true;
        }

        return false;
    }

    public static String[] reverse(String[] arr) {
        String[] arr1 = new String[arr.length];

        for(int i = 0; i < arr.length-1; i++){
            if (arr.length > 1) {
                arr1[i] = arr[i + i+1];
                arr1[i + i+1] = arr[i];
            }else{
                arr1[i] = arr[i];
            }
        }

        return arr1;
    }

    public static String[] reverseArr(String[] arr) {
        String[] reverse = new String[arr.length];

        int index = reverse.length-1; //1

        for (int i = 0; i <= arr.length-1; i++) {
            reverse[index] = arr[i];
            index--;
        }
        return reverse;
    }
}
