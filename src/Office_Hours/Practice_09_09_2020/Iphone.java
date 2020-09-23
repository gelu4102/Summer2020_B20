package Office_Hours.Practice_09_09_2020;

public class Iphone extends Phone {
    /*
    variables: 4
    methods: 3
     */
    public Iphone(String model,double price){
        super(model, price);//set the model and price
    }
    static {
        brand = "iphone";
        madeIn = "USA";
    }
    @Override
    public void call(long phoneNumber){
        System.out.println("iphone "+model+" is calling: "+phoneNumber);
    }
    @Override
    public void text(long phoneNumber){
        System.out.println("iphone "+model+" is texting: "+phoneNumber);
    }
}
