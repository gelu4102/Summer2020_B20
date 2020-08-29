package day47_Encapsulation;

import java.time.LocalDate;

/*
3. Person:
            instance variables
                    name
                    age
                    gender
                    date of birth
                    priavte ssn
                    private ID
                    private address

 */
public class Person {
    public String name;
    public int age;
    public char gender;
    public LocalDate DOB;

    public Person(String name, int age,char gender,LocalDate DOB){
        this.name= name;
        this.age = age;
        this.gender = gender;
        this.DOB = DOB;
    }

    private int ID;
    private long ssn;
    private String address;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString(){
        return "Name: "+name+", Age: "+age+", Gender: "+gender+",DOB: "+DOB;
    }
}
