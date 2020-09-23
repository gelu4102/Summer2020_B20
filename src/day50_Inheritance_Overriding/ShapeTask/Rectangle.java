package day50_Inheritance_Overriding.ShapeTask;

public class Rectangle extends Shape {

    public double width;
    public double length;

    public Rectangle(double width,double length){
        this.width = width;
        this.length = length;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    public double calculateArea(){
        return  width * length  ;
    }

    public double calculatePerimeter(){
        return (width + length) * 2 ;
    }






}
