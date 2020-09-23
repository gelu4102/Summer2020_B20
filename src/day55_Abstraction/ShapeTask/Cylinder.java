package day55_Abstraction.ShapeTask;

import java.text.DecimalFormat;

public final class Cylinder extends Shape {

    public double radius;
    public double height;

    public Cylinder(double radius, double height){
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
    }


    @Override
    public double calculateArea() {
        return radius*height*Math.PI;
    }

    @Override
    public double calculatePerimeter() {
        return (2*Math.PI*height)+(4*Math.PI*Math.pow(radius,2));
    }

    @Override
    public double calculateVolume() {
        return Math.pow(radius,2)*height*Math.PI;
    }

    static {
        name = "Cylinder";
        hasVolume = true;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Cylinder{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}
