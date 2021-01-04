package bootCamp;

public class StringPractice {
    public static void main(String[] args) {
        //At String Pool
        String str = new String("Batch 20");//in the hip
        String str2 = "Batch 20";//in the Loop
        str2.concat("is the best");
        System.out.println(str2);

        StringBuilder sBuilder = new StringBuilder("Batch 20");
        sBuilder.append(" is the best");
        System.out.println(sBuilder);

        // StringBuilder = mutable,faster
        //StringBuffer = mutable , thread-Safe(synchronized)
       StringBuffer sBuffer = new StringBuffer("Batch 20");
       sBuffer.append(" is the best");


    }
}
