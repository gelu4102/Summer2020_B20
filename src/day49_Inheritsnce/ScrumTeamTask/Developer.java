package day49_Inheritsnce.ScrumTeamTask;

public class Developer extends Employee {

    public Developer(String name, int age,char gender,double salary,int ID, String jobTitle){
        setInfo(name, age, gender, salary, ID, jobTitle);
    }

    public void coding(){
        System.out.println(name+" is developing code,while hitting his head to the wall");
    }

    public void fixBug(){
        System.out.println(name+" is fixing a Bug while cursing the Tester");
    }
}
