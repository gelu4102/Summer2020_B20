package day54_Abstraction.CarTask;

public abstract class Car {//can not be final
     public Car(){

     }

     public abstract void start();

}


final class A{//can be final

}

class B{
    public static void main(String[] args) {
        A obj1 = new A();
      //  Car obj2 = new Car();
    }
}
