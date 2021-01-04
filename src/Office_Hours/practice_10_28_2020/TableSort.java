package Office_Hours.practice_10_28_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class TableSort {
    /*
    Let's say there is a table on a web page and you sorted it.
    This table was given to you as a Set of Strings.
    Verify if the the table was sorted appropriately
     */
    public static void main(String[] args) {
        String s = "java";
        String s2 = "zpple";
        System.out.println(s.compareTo(s2));

        Set<String>set = new LinkedHashSet<>(Arrays.asList("abc", "java", "zebrea"));
        System.out.println(isSorted(set));

    }
    public static boolean isSorted(Set<String> set){

        ArrayList<String>list = new ArrayList<>(set);
        for (int i = 0; i < list.size(); i++){
            //first -> second
            String first = list.get(i);
            String second = list.get(i+1);

            if (first.compareTo(second) < 0){
                return false;
            }
        }
        return true;


    }
    /*
    compareTo
    ex: s.compareTo(s2)
    o -> String are equal
    positive num -> s comes after s2 lexicographically
    negative num -> s comes before s2 lexicographically

    is s1 = "java"
    s2 = "apple"
    s.compareTo(s2)
     */
}
