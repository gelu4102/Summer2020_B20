package day55_Abstraction.ShapeTask;

public class ShapeObjects {
    public static void main(String[] args) {

        Circle circle = new Circle(2.5);

        System.out.println(circle);
        System.out.println("Circle Has Volume"+Circle.hasVolume);

        Circle circle12 = new Circle(5.5);
        System.out.println(circle12);

        System.out.println("=============================================");

        Rectangle rectangle = new Rectangle(10,5);
        System.out.println(rectangle);
        System.out.println(new Rectangle(20,30));

        System.out.println("==========================================================");

        Cylinder cylinder = new Cylinder(5,10);
        System.out.println(cylinder);





    }
}
