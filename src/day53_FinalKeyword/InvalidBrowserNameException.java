package day53_FinalKeyword;

public class InvalidBrowserNameException extends RuntimeException {

    public InvalidBrowserNameException(){
        super("Invalid Browser Name");
    }
    public InvalidBrowserNameException(String str){
        super(str);
        System.err.println("Are you kidding");
    }



}

class Test2{
    public static void main(String[] args) {

        String name = "bacth20";

        switch (name.toLowerCase()){
            case "chrome":
                System.out.println("Chrome is selected");
                break;
            case "firefoc":
                System.out.println("Fire fox is selected");
                break;
            case "safari":
                System.out.println("Safari is selected");
                break;
            default:
                throw new InvalidBrowserNameException("please enter a valid browser name");
               // throw new RuntimeException();
        }
        //throw new InvalidBrowserNameException();

    }
}

