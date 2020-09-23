package day50_Inheritance_Overriding.ShapeTask;

import sun.plugin.dom.css.Rect;

public class ShapeObjects {

    public static void main(String[] args) {
        Circle circle = new Circle(3);


        System.out.println(circle.calculateArea());
        System.out.println("=======================================");
        System.out.println(circle.calculatePerimeter());
        System.out.println("====================================");

        Rectangle rectangle = new Rectangle(3,4);

        System.out.println(rectangle.calculateArea());
        System.out.println("=====================================");
        System.out.println(rectangle.calculatePerimeter());

    }

}
