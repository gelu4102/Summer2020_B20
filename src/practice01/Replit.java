package practice01;

import java.util.ArrayList;
import java.util.Arrays;

public class Replit {
    public static String extractNum(String s) {
        String result = "";
        //int num;
        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                result += ch;
            }
            //int num = Integer.parseInt(result);
        }
        return result;


    }

    public static int[] mergR(int[] a,int[] b) {
        int[]c = new int[a.length + b.length];
        for(int i = 0; i < c.length;i++){

            if(i < a.length){
                c[i] = a[i];
            }else{
                c[i] = b[i-a.length];
            }

        }
        return c;

    }
    public static String combineRs(String[] r1,String[] r2)
    {
        ArrayList<String> str = new ArrayList<>();
        str.addAll(Arrays.asList(r1));
        str.addAll(Arrays.asList(r2));
        String newStr = "";
        for(String each:str){
           newStr += each;
         }

        return newStr;
    }


    public static void main(String[] args) {


        System.out.println(combineRs(new String[]{"1","2","3"}, new String[]{" 4"}));
    }

}

