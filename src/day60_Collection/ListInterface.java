package day60_Collection;

import java.util.*;

public class ListInterface {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();//add, remove, set,removeAll,contains,size...
             list1.addAll(Arrays.asList(1,2,3,4,5));
             list1.addAll(Arrays.asList(1,2,3,4,5));
           //retrieving data is faster(get())
        list1.add(6);
              System.out.println("Array"+list1);
              System.out.println(list1.get(2));//fastest


        List<Integer> list2 = new LinkedList<>();//add, remove, set,removeAll,contains,size...
             list2.addAll(Arrays.asList(1,2,3,4,5));
             list2.addAll(Arrays.asList(1,2,3,4,5));
             //add/remove are faster(doublly linked)
             list2.add(6);
               System.out.println("Linked"+list2);
               System.out.println(list2.get(2));

        List<Integer> list3 = new Vector<>();//add, remove, set,removeAll,contains,size...
             list3.addAll(Arrays.asList(1,2,3,4,5));
             list3.addAll(Arrays.asList(1,2,3,4,5));

             list3.add(6);
                System.out.println("Vector"+list3);
                System.out.println(list3.get(2));

        List<Integer> list4 = new Stack<>();//add, remove, set,removeAll,contains,size...
             list4.addAll(Arrays.asList(1,2,3,4,5));
             list4.addAll(Arrays.asList(1,2,3,4,5));

             list4.add(6);
                System.out.println("Stack"+list4);
                System.out.println(list4.get(2));

        ( (Stack)list4).pop();
        System.out.println(list4);
        System.out.println("====================================");

        Stack<Integer>list5 = new Stack<>();
        list5.addAll(Arrays.asList(1,2,3,4,5,6,7));

        System.out.println(list5);

        int lastObject = list5.pop();

        System.out.println(list5);

        int lastObject2 = list5.pop();
        System.out.println(list5);

        list5.removeAll(Arrays.asList(1,4,5));
        System.out.println(list5);
        int lastObject3 = list5.pop();

        System.out.println("==========================================");

        int[] arr1 = {1,2,3,4};
        int[][] arr2 = {{1,2,3,4},{5,6,7,8,9}};//multidimensional

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("A");

        ArrayList<ArrayList<Integer>> l2 = new ArrayList<>();//list of lists
        //l2.add("M");//should be the object of Array lis
        //l2.add(5);
        l2.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4)) );
        l2.add(new ArrayList<>( ));

        l2.get(1).addAll(Arrays.asList(5,6,7,8,9));

        l2.get(0).removeAll(Arrays.asList(1,3));

        System.out.println(l2);
        System.out.println("Size of first arrayList: "+l2.get(0).size());
        System.out.println("Size of second arrayList: "+l2.get(1).size());

        List<String> group1 = new ArrayList<>();
        List<String> group2 = new ArrayList<>();
        List<String> group3 = new ArrayList<>();
        List<String> group4 = new ArrayList<>();
        List<String> group5 = new ArrayList<>();

        List<List<String>> groups = new ArrayList<>();
        //groups.addAll(Arrays.asList(group1,group2,group3,group4,group5));
        groups.addAll(Arrays.asList(
                new ArrayList<>(Arrays.asList()),
                new ArrayList<>(Arrays.asList()),
                new ArrayList<>(Arrays.asList()),
                new ArrayList<>(Arrays.asList()),
                new ArrayList<>(Arrays.asList())
                ));
        groups.get(0).addAll(Arrays.asList("Gelila","Yonas","Ramazan","Violeta"));
        groups.get(1).addAll(Arrays.asList("Saied","Beyza","Ahimat","Zulffiya"));
        groups.get(2).addAll(Arrays.asList("Saba","Martha","Betty","Mular"));
        groups.get(3).addAll(Arrays.asList("Dawit","Josse","Kibret","Woldie"));
        groups.get(4).addAll(Arrays.asList("Nadir","Muhtar","Sami","Gurham"));

        for (List<String> eachGroup : groups){
            for (String eachStudents : eachGroup){
                System.out.println(eachStudents+" ");
            }
        }
        
       // System.out.println(groups);
    }

    public void method1(){

    }

    public synchronized void method2(){

    }

}
