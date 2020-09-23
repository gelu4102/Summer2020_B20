package day55_Abstraction.ShapeTask;

public abstract class Shape {//can not create object,can not be final

    public static String name;
    public double area;
    public double perimeter;
    public static boolean hasVolume;
    public double volume;

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public abstract double calculateVolume();




    }
