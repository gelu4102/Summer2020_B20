package day62_Maps;

public class String_VS_Builder_VS_Buffer {

    public static void main(String[] args) {
        String str1 = "Cybertek";

        str1.contains("School");

        System.out.println(str1);

        String str2 = new String("Cybertek");
        StringBuilder sb1 = new StringBuilder("Cybertek");
        sb1.append(" School");
        System.out.println(sb1);
        sb1.reverse();
        System.out.println(sb1);

        System.out.println("==========================================");

        String name = "Level";
        String reversedName = new StringBuilder(name).reverse().toString();
        System.out.println(name.equalsIgnoreCase(reversedName));
        System.out.println("===============================================");
        //converting String in to StringBuilder:

        String s1 = "Friday";
        StringBuilder s2 = new StringBuilder(s1);

        //convert StringBuilder to String

        String s3 = s2.toString();
        System.out.println("=====================================================");


    }
}
