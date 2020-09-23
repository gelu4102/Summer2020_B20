package day55_Abstraction.ShapeTask;

public final class Circle extends Shape {
   public double radius;
   /*
   6 variables: 2 statics : name, hasVolume
                4 instance: radius, area, perimeter, volume
    */
   public Circle(double radius){
       this.radius = radius;
       area = calculateArea();
       perimeter = calculatePerimeter();
       volume = calculateVolume();
   }
    @Override
    public double calculateArea() {
        return Math.pow(radius,2) * Math.PI;
    }

    @Override
    public double calculatePerimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }

    static {
        name = "circle";
        hasVolume = false;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}
