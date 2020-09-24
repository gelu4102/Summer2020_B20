package day57_Polymorphism;
/*
4. create an abstract class named Phone
            instance variables: brand, model, price, size
            abstract methods: texting(), calling()
      add constructor that can initialize the fields
            if the price is set to negative or 0 the system should throw an exception with a message of:
                    Invalid Price, cannot be negative
 */
public abstract class Phone {

    public String brand,model,size;
    public double price;

    public Phone(String brand, String model, String size, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;

        if(price <= 0){
            throw new RuntimeException("price of the phone can not be negative or zero");
        }
        this.price = price;
    }

    public abstract void texting(long phoneNumber);
    public abstract void calling(long phoneNumber);


}
