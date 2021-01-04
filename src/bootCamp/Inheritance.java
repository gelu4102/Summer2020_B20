package bootCamp;

  class Shape{
    public String name;
    protected double area(){
        return 0;
    }
}
 final class Rectangle extends Shape{
      public double length, width;

      @Override//annotation
      public double area(){
          return length * width;
      }

 }
  final class Circle extends Shape{
      public double r ;

      @Override
      protected double area(){
         return r * r * Math.PI;
      }
  }

  final class Cube extends Shape{
      @Override
      protected double area(){
          return 0;
      }

  }
public class Inheritance {
    public static void main(String[] args) {

        Circle c1 = new Circle();//has relation
    }

}
