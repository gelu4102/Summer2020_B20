package day62_Maps;

import java.time.LocalDate;
import java.util.*;

public class ListOfMaps2 {

    public static void main(String[] args) {
        String[]friends = {"Beza","Bamlak","Melat","Timmy"};
        LocalDate[]DOBFriends = {LocalDate.of(1987,8,20),
                LocalDate.of(1986,4,16),
                LocalDate.of(1988,7,20),
                LocalDate.of(1988,6,23)};

        String[] classMates = {"Violite","Ramazane","Roman","Musa","Ahmet"};
        LocalDate[]DOBClassMates = {LocalDate.of(1985,7,16),
                LocalDate.of(1983,3,9),
                LocalDate.of(1984,11,26),
                LocalDate.of(1982,5,19),
                LocalDate.of(1980,8,14)};

        String[]family = {"Saba","Betty","Marta","Yonas","Mular"};
        LocalDate[]DOBFamily = {LocalDate.of(1984,2,23),
                LocalDate.of(1978,6,15),
                LocalDate.of(1979,5,14),
                LocalDate.of(1984,2,16),
                LocalDate.of(1983,3,19)};

       List<Map<String, LocalDate>> list = new ArrayList<>();
       list.addAll(Arrays.asList(
               new LinkedHashMap<>(),
               new LinkedHashMap<>(),
               new LinkedHashMap<>()
       ));

       for (int i = 0;i < friends.length;i++){
           list.get(0).put(friends[i],DOBFriends[i]);
       }

        for (int i = 0;i < classMates.length;i++){
            list.get(1).put(classMates[i],DOBClassMates[i]);
        }

        for (int i = 0;i < family.length;i++){
            list.get(2).put(family[i],DOBFamily[i]);
        }
        System.out.println(list);
    }
}
