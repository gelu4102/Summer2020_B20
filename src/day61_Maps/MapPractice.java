package day61_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {

        Map<String, Double> employees = new LinkedHashMap<>();
        employees.put("Elvira",150000.0);
        employees.put("Ziiadin",120000.0);
        employees.put("Roman",130000.0);
        employees.put("Cihan",140000.0);
        employees.put("Nurbiye",120000.0);

        System.out.println(employees);
        System.out.println(employees.size());// returns how many pairs of data

        System.out.println("Salary of Ziiadin: "+employees.get("Ziiadin"));
        employees.remove("Ziiadin");

        System.out.println(employees);
        System.out.println(employees.size());

        boolean r1 = employees.containsKey("Roman");

        System.out.println(r1);
        System.out.println(employees.size());

        boolean r2 = employees.containsValue(120000.5);
        System.out.println(r2);

        boolean r3 = employees.containsValue(150000.0);
        System.out.println(r3);

        employees.clear();
        System.out.println(employees);




    }
}
