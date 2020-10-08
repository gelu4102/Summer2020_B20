package day61_Maps;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,1,2,3,4,5,6));

        System.out.println(list);

       LinkedHashSet<Integer> set =  new LinkedHashSet<>(list);//contains the unique ones
        System.out.println(set);

        list.clear();
        list.addAll(set);

        System.out.println(list);
    }
}
