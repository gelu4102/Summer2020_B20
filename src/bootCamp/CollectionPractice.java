package bootCamp;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6));
        /* for (int i = 0; i < list.size(); i++){
            if (list.get(i) < 5){
                list.remove(i);
            }
        }

        */
        list.removeIf(p -> p < 5);
        System.out.println(list);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6));
        Iterator<Integer>it = numbers.iterator();
        while (it.hasNext()){
            if (it.next() < 5){
                it.remove();
            }
        }


    }
}
