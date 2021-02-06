package day24_Arrays;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        int[] arr = {1,2,3};

        System.out.println(arr);//hash code
//we have to convert it to string
        System.out.println(  Arrays.toString(arr)  );

        String s1 = Arrays.toString(arr);
        System.out.println(s1);


        String[]  names = {"Muhtar", "Saim", "Nadir", "Asiya", "Kuzzat"};

        System.out.println(names);  // in order to print array variable we MUST convert it to string

        System.out.println( Arrays.toString(names) );

        System.out.println("================================================");

        int[] nums = {5,4,6, 5, 10, 3, 4};

        System.out.println( Arrays.toString(nums) );

        Arrays.sort(nums);  //[3, 4, 4, 5, 5, 6, 10]

        System.out.println( Arrays.toString(nums) );

        System.out.println("Maximum number: " + nums[nums.length-1] );
        System.out.println("Minimum number: "+ nums[0] ) ;

        String students[] = {"Mehdi", "Elkem", "Meee", "Trump"};

        Arrays.sort(students);

        System.out.println( Arrays.toString(students)  );

        //["Elkem",  "Meee",  "Mehdi", "Trump"]

        // A ~Z

        System.out.println("===================================");
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};

        boolean r1 = Arrays.equals(arr1, arr2);

        System.out.println(r1);

        int[] arr3 = { 2, 1, 3 };

        Arrays.sort(arr2); // arr2:  1, 2, 3
        Arrays.sort(arr3); // arr3:  1, 2, 3

        boolean r2 = Arrays.equals(arr2, arr3);
        System.out.println(r2);

        int[] arr4 = {1,1,2,3};
        int[] arr5 = {1,2,3};

        boolean r3 = Arrays.equals(arr4, arr5);
        System.out.println(r3);



    }

}
