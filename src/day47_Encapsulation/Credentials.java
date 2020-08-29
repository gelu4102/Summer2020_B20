package day47_Encapsulation;
/*
instance variables:
public name
public age
private username
private password

getter & setter
add a constructor to set name & age
 */
public class Credentials {
    public String name;
    public int age;


    public static String companyName;

    private String username;
    private String password;

    static {
        companyName = "Face Book";
    }
    public Credentials(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }

}
