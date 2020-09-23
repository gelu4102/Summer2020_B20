package day51_Exceptions;

class X{
    public X(){
        System.out.println("X");
    }
}
class Y extends X{
    public Y (){
        //super();//x
        System.out.println("Y");
    }
}

class Z extends Y{
   public Z(){
       //super();//XY
       System.out.println("Z");
   }
}

public class Practice {
    public static void main(String[] args) {
        new Z();
    }
}
