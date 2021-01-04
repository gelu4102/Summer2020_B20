package bootCamp;

public class LoopPractice {
    public static void main(String[] args) {
        /** Loops - 3 types
         * for -- > index numbers
         *      for each:no worries about initialization,condition, iterator
         *              : not possible to change the condition
         * while
         *     Condition only
         * do-while --> even if the condition is false it execute  one time
         *
         */
        //initialization,condition, iterator (false)
        for(int i = 25; i > 20; i--){
            System.out.println("Slack is down!!");
        }
        System.out.println("====================================================================");

        int j = 25;//initialize first
        while (j > 20){
            System.out.println("Slack is down!!");
            j--;
        }
        System.out.println("====================================================================");
      /**
      3 data structures:
      Array
      Collection
      Map
       */
      int[] numbers = {10, 20, 30, 40};
      //variable , data structure
        //each represent all the elements
      for (int each : numbers){
          System.out.println(each);
      }
      for (int i = 0; i < numbers.length; i++){
          System.out.println(i);
      }
    }
}
