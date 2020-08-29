package day47_Encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {
        CapitalOneEmployees employee1 = new CapitalOneEmployees("Daniel",34,"SDET");

        employee1.setID(123);
        employee1.setAddress("Verginia");
        employee1.setSalary(100000);

        System.out.println(employee1.employeeName);
        System.out.println(employee1.age);
        System.out.println(employee1.jobTitle);
        System.out.println(employee1.companyName);

        System.out.println(employee1.getID());
        System.out.println(employee1.getAddress());
        System.out.println(employee1.getSalary());

        System.out.println(employee1);


    }
}
