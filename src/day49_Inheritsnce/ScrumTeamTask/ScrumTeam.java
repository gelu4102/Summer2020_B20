package day49_Inheritsnce.ScrumTeamTask;

import com.sun.xml.internal.bind.v2.model.core.ID;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public ArrayList<Tester> testers = new ArrayList<>();
    public ArrayList<Developer> developers = new ArrayList<>();

    public ScrumTeam(Tester[] testers,Developer[]developers){
        addTesters(testers);//add the
        addDevelopers(developers);
    }

    public void addTester(Tester tester){
        testers.add(tester);
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void addTesters(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }

    public void addDevelopers(Developer[] developers){
        this.developers.addAll(Arrays.asList(developers));
    }

    public void removeTester(int ID){
        testers.removeIf(p -> p.ID == ID);
    }

    public void removeDeveloper(int ID){
        developers.removeIf(p -> p.ID == ID);
    }

    public void removeTesterDeveloper(int testerID, int developerID){
        removeTester(testerID);//remove the tester from the list
        removeDeveloper(developerID);//removes the developer from the list
    }

    public String toString(){
        return "================================"+
                "\nDevelopers #"+developers.size()+
                "\nTesters #"+testers.size()+
                "\nCapacity: "+((developers.size()+testers.size())*8)+ " point (Dev.Team * 8 Days)"+
                "\nVelocity: "+((developers.size()+testers.size())*8)+ " point for current Sprint (No days Off)"+
                 "\n================================";
    }




}
