package day51_Exceptions;
class A{
    protected void method(){

    }
}
  public class MethodOverriding extends A {
   /* @Override
    public int method() {//
        return 10;
    }

    */
      @Override
      public void method(){

      }
    @Override
    public String toString(){
        return "Example";
    }

/*
method overloading: same method name, different parameter
                    access modifier does not matter
                    return-type does not matter
                    any method can be overload


method overriding: same method name, same parameter,same return-type(must)
                   MUST happen in sub class
                   @Override MUST be applicable (for checking)
                   Access modifier  must be same or mor visible
                   only instance method can be override (cannot be final or private)


      visibility:
      public > protected > default > private

 */


}
