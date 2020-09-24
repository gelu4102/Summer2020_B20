package day57_Polymorphism.EmployeeTask;

import day35_ArrayList.ArrayList_Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class Apple {
    public static void main(String[] args) {
        Employee tester1 = new Tester("Andrii",516875,"QA",120000,'M');
        Employee tester2 = new Tester("Musa Moylam", 123456, "SDET", 130000, 'M');

        Employee developer1 = new Developer("Hajar", 12098, "Team lead", 12000, 'F');
        Employee developer2 = new Developer("Abdul",123456789,"QA",110000,'M');

        Employee scrumMaster1 = new ScrumMaster("Kamil",78945,"Scrum Master",120000,'M');

        //scrumTeam

        ArrayList<Employee>scrumTeam = new ArrayList<>();
        scrumTeam.addAll(Arrays.asList(tester1,tester2,developer1,developer2,scrumMaster1));

        for (Employee each : scrumTeam){
            System.out.println(each);
        }

    }
}
