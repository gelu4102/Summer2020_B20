package day58_polymorphism;

import day57_Polymorphism.PhoneTask.*;

import java.util.ArrayList;
import java.util.Arrays;

public class PhoneShop {
    public static void main(String[] args) {
        Phone[] phone = {
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100)
        };


        ArrayList<Phone> phoneShop = new ArrayList<>(Arrays.asList(phone));
        int countIphone = 0;
        int countSamSung = 0;
        int countHuaWei = 0;

        /*
        for(int i = 0; i <= phoneShop.size()-1; i++){
            Phone each = phoneShop.get(i);  // get each objects from array
            if( each instanceof Iphone  ){ // checks if the objects is Iphone
                countIphone++;
            }else if(each instanceof Samsung){ // checks if the object is samsung
                countSamSung++;
            }else {
                countHuaWei++;
            }
        }
        */

        for (Phone each : phoneShop) {
            if (each instanceof Iphone) {
                countIphone++;
            } else if (each instanceof Samsung) {
                countSamSung++;
            } else {
                countHuaWei++;
            }
        }

        System.out.println("Iphone: " + countIphone);
        System.out.println("Samsung: " + countSamSung);
        System.out.println("Huawei: " + countHuaWei);


    }

}
