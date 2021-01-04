package Office_Hours.practice_10_28_2020;

import java.util.ArrayList;

public class LargestPalindrome {
/* Create a method that will accept a String ArrayList and return the largest   Palindrome String from it
    => Assume there is no Strings with the same length and there will be at least one  element
    * -> "dad","abcba","racecar","cat"

 */
    public static String largestPalindrome(ArrayList<String>words){
        String largestStr = "";//racecar
        for (String word : words){
         if (word.length() > largestStr.length()){
             if (isPalindrome(word)){
                largestStr = word;
             }

         }
        }
        return largestStr;
    }
    private static boolean isPalindrome(String str){
        for (int i = 0; i < str.length()/2; i++){
            if (str.charAt(i)  !=  str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

}
