package day54_Abstraction.EmployeeTask;

import java.time.LocalDate;

public final class Developer extends Employee {

    public Developer(String name, char gender, LocalDate DOfB, String jobTitle, double salary){
        super(name, gender, DOfB, jobTitle, salary);
    }

}

//class BA extends Developer{ }//Final class can never be a super class
