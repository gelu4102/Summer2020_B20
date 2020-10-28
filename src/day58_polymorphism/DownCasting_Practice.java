package day58_polymorphism;

import day57_Polymorphism.PhoneTask.Huawei;
import day57_Polymorphism.PhoneTask.Iphone;
import day57_Polymorphism.PhoneTask.Phone;
import day57_Polymorphism.PhoneTask.Samsung;

public class DownCasting_Practice {
    public static void main(String[] args) {

        Phone phone1 = new Iphone("11", "6", 1000);
        Iphone iphone = (Iphone) phone1;


        System.out.println(phone1);
        System.out.println(iphone);

        // phone1.faceTiming(123456);
        iphone.faceTiming(123456);

        // second way
        ((Iphone) phone1).faceTiming(123455678);


        System.out.println("================================");
        Phone phone2 = new Samsung("S20", "7", 1000);

        ((Samsung) phone2).freezing();

        //   ( (Iphone)phone2 ).faceTiming(123456);  // iphone & samsung are not inheriting each other


        System.out.println("========================================");

        Phone phone3 = new Huawei("spy", "7", 10);

        ((Huawei) phone3).stealInfo();

        //    ( (Iphone)phone3 ).faceTiming(1233111);


}
}
