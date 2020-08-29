package day47_Encapsulation;

import java.time.LocalDate;

public class PersonObject {
    public static void main(String[] args) {
      Person person1 = new Person("Gelila",34,'F', LocalDate.of(1986,8,27));

      System.out.println(person1);

      person1.setSsn(987654);
      person1.setID(98);
      person1.setAddress("California");

        System.out.println("SSN: "+person1.getSsn());
        System.out.println("ID: "+person1.getID());
        System.out.println("Address: "+person1.getAddress());












    }
}
