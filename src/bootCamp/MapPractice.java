package bootCamp;



import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<String, LocalDate>employee = new LinkedHashMap<>();
        employee.put("John", LocalDate.of(2019,5,25));
        employee.put(null, LocalDate.of(2018,5,25));
        employee.put("Daniel", LocalDate.of(2017,5,25));

        System.out.println(employee);

        System.out.println(employee.get("Daniel"));
        System.out.println("==================================================================");
        for (String eachKey : employee.keySet()){
            System.out.println(eachKey);
        }
        System.out.println("====================================================================");
        for (LocalDate eachValue : employee.values()){
            System.out.println(eachValue);
        }
        System.out.println("=========================================================================");
        for (Map.Entry<String, LocalDate>each:employee.entrySet()){
            System.out.println(each.getKey());
            System.out.println(employee.get("Daniel"));
        }
    }

}
