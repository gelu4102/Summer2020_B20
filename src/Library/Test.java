package Library;

public class Test {

    public static void main(String[] args) {
        String str = "ABABABAC";

        String nonDup = "";

        for(int i = 0; i <= str.length()-1; i++){
            String s ="" +str.charAt(i);

            if(!nonDup.contains(s)){
                nonDup += s;
            }
        }
        String result = "";
       for(int i = 0; i<= nonDup.length()-1;i++){
           char ch = nonDup.charAt(i);
           int count = 0;

           for(int j = 0; j <= str.length()-1; j++){
               char each = str.charAt(j);
               if(each == ch){
                   count++;
               }
           }
           result += ""+ch+count;
       }
        System.out.println(result);
    }
}
