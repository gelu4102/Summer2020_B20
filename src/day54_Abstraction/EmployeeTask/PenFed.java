package day54_Abstraction.EmployeeTask;

import java.time.LocalDate;

/*
 4. create a class called PenFed
            create 3 objects of Tester and Developers
            try to make change to the gender & DOfB of the employees

 */
public class PenFed {

    public static void main(String[] args) {
        Tester tester1=new Tester("Polat Alemdar",'M', LocalDate.of(1973,11,20),"KABADAYI",1500000);
        // tester1.gender = 'F'; // Can only read it, cannot modify it
        //  tester1.DOfB = LocalDate.of(2000, 11, 20); // Can only read it, cannot modify it

        System.out.println(tester1.gender);
        System.out.println(tester1.DOfB);

        Developer developer1 =  new Developer("Virginia", 'F', LocalDate.of(1990,11,20), "SDET", 120000);
        // developer1.gender = 'M';
        //  developer1.DOfB = LocalDate.of(1993, 11, 25);

        System.out.println(developer1);


    }
}
