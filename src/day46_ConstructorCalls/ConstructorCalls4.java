package day46_ConstructorCalls;

public class ConstructorCalls4 {

    public ConstructorCalls4(){
        //this();
        //this(3.5);
    }
    public ConstructorCalls4(int a){
           this(2.5);//contains constructor with double arg
    }
    public ConstructorCalls4(double a){
            //this(10);
        this();//contains default constructor
    }
}
