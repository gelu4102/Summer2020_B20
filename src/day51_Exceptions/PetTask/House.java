package day51_Exceptions.PetTask;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class House {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Winton", "Scotty Terrier", 'M', "Black", 4);
        System.out.println(dog1.name);
        System.out.println(dog1);

        Cat cat1 = new Cat("Welat", "British Short hair", 'M', "white", 1);
        System.out.println(cat1);

        Tiger tiger1 = new Tiger("Zara","Caspian",'M',"Brown",12);
        System.out.println(tiger1);

        tiger1.eat();
        tiger1.drink();
    }
}