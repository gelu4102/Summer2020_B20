package practice01;

public class Dup  {
    public static  String  removeDup( String  str) {

        String result = "";

        for (int i = 0; i < str.length(); i++)

            if (!result.contains("" + str.charAt(i)))

                result += "" + str.charAt(i);



        return result;

    }

    public static void main(String[] args) {
        String str = "gelila";
        System.out.println(removeDup(str));
    }

    }

