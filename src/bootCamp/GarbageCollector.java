package bootCamp;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollector {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list = new ArrayList<>(Arrays.asList(6,7,8));

        list = null;//2 objects are collected by garbage collector

        //driver = null;
        String str = "Cybertek";
        System.out.println("School");
        str = null;
        System.out.println(str);
    }
}
