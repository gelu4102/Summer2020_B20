package day57_Polymorphism.PhoneTask;

public class Huawei extends Phone implements AndroidApp,Downloadable {

    public Huawei( String model, String size, double price) {
        super("Huawei", model, size, price);

        if (price > 200){
            throw new RuntimeException("No way Huawei worth more than 200");
        }
    }

    @Override
    public void download() {
        System.out.println("Huawei is downloading from "+AndroidApp.AppStoreName+AppleApp.AppStoreName);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Huawei is texting to "+phoneNumber);

    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Huawei is calling "+phoneNumber);

    }
    public void stealInfo(){
        System.out.println("Huawei is stealing your Info");
    }

    @Override
    public String toString() {
        return "Huawei{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                '}';
    }
}
