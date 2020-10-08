package day59_OOPReview;

 interface X{

    public abstract void method1();
    void method2();

    int a = 100;//public static final
    //static int b ;//we have to assigne

}
 abstract class Y{

    int a;
  static int b;
    public abstract void method1();
    Y(){
        //we can have block
    }

}

 public class Abstraction {
    public static void main(String[] args) {
       // Y obj = new Y();
      //  X obj2 = new X();
    }
}
