package day61_Maps;

import java.time.LocalDate;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class IteratingKeysValues {
    public static void main(String[] args) {

        Map<String, LocalDate> student = new TreeMap<>();
        student.put("Hasan",LocalDate.of(1985,4,4));
        student.put("Jesus",LocalDate.of (1979,1,31));
        student.put("Muhtar",LocalDate.of(1985,5,19));
        student.put("Jesus",LocalDate.of(1979,2,28));
        student.put("Muhtar",LocalDate.of(1985,5,19));
        student.put("John",LocalDate.of(1999,3,4));

        System.out.println(student);

        Set<String> keys = student.keySet();

        //Applying Loops to the keys
        for (String each:student.keySet()){
            System.out.println(each);
        }
        System.out.println("==================================================");
        //Applying Loops to the value
        for (LocalDate each : student.values()){
            System.out.println(each);
        }

    }

}
