package day49_Inheritsnce.ScrumTeamTask;
/*
attributes: name, age, gender
methods: eat, walk,sleep, setPersonInfo
 */
public class Person {

    public String name;
    public int age;
    public char gender;

    private long ssn;

    public long getSsn(){
        return ssn;
    }//read ssn only

    public void setSsn(long ssn){
        this.ssn = ssn;
    }//set ssn only

    private void eat(){//we don't want this to be inherited to the sub classes
        System.out.println(name+ " is eating");
    }

    private void walk(){//we don't want this to be inherited to the sub classes
        System.out.println(name + " is walking");
    }

    private void sleep(){//we don't want this to be inherited to the sub classes
        System.out.println(name + " is sleeping");
    }

    public void setInfo(String name, int age, char gender) {//only sets name, Age, Gender
        this.name = name;
        this.age = age;
        this.gender = gender;
    }



}
