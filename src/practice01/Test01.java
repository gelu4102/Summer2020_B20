package practice01;


public class Test01 {


    public static String FrequencyOfChars(String str) {

        String nonDup = "";

        for (int i = 0; i < str.length(); i++) {

            if (!nonDup.contains("" + str.charAt(i)))

                nonDup += "" + str.charAt(i);

        }
        String expectedResult = "";

        for (int j = 0; j < nonDup.length(); j++) {

            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == nonDup.charAt(j))

                    count++;

            }

            expectedResult += nonDup.charAt(j) + "" + count;

        }

        return expectedResult;

    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void stringTest(){

    }

    public static void main(String[] args) {

        String str = "gelilakibretwoldie";
        //System.out.println(FrequencyOfChars(str));
        //Test01 test = new Test01();
        //System.out.println(removeDuplicates(new int[]{1,1,1,2,3,3,4,4,4,2,2,3}));

        System.out.println("\"gelila\".length() = " + "gelila".length());
        String name = new String();
        name = "gelila";
        System.out.println("name.toUpperCase() = " + name.toUpperCase());
    }
}




