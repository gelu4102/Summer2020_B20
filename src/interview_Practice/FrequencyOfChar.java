package interview_Practice;

public class FrequencyOfChar {
    public static void main(String[] args) {
        System.out.println("freChars(\"Gelila\") = " + freChars("Gelila"));
        System.out.println("charCount(\"\") = " + charCount("mussie"));
    }


    public static String freChars(String str){
        String nonDup = "";

//          "gelia"
        for (int i = 0; i < str.length(); i++) {
            if (!nonDup.contains(""+str.charAt(i))){
              nonDup += str.charAt(i);
            }

        }
        String expected = "";
        for (int j = 0; j < nonDup.length(); j++) {
                   int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == nonDup.charAt(j)){
                     count ++;
                }

            }
            expected += nonDup.charAt(j) + "" + count;
            // g1,e1,l2,i1,a1
        }
        return expected;
    }

    public static String charCount(String str2){
        String nonDup = "";

        for (int i = 0; i < str2.length(); i++) {
            if (!nonDup.contains(str2.charAt(i)+"")){
                nonDup += str2.charAt(i);
            }
        }
        String expectedResult = "";
        for (int j = 0; j < nonDup.length();j++){
            int count = 0;
            for (int i = 0; i < str2.length(); i++) {
                if (str2.charAt(i) == nonDup.charAt(j) ){
                    count ++;
                }
            }
            expectedResult += nonDup.charAt(j) + "" + count;
        }
        return expectedResult;
    }





}
