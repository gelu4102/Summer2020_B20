package Quize;

public class Test19 {
static int a = 50;
    public static void main(String[] args) {
        a = 100;
        try{
            a = 100;
        }catch (Exception e){
            a = 300;
        }finally {
            a = 400;
        }
        System.out.println(a);

    }
    static {
        a = 500;
    }
}
