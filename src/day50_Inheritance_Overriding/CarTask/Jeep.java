package day50_Inheritance_Overriding.CarTask;
/*
Jeep:
    start(): Call Mechanic
             Oil Change
             jump start

 */
public class Jeep extends Car {

    public void start(){
        System.out.println("Call Mechanic");
        System.out.println("Oil change");
        System.out.println("jump start");
    }



}
