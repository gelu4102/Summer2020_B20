package day47_Encapsulation;

public class Encapsulation {
//Encapsulation is hide the data by giving private access modifier
    private long ssn = 123456789;

    public long getSsn(){//to read only the data
        return ssn;
        //getter(read only) public instance method
        //          return_type must mach with the private data type,data,no parametter
    }

    public void setSsn(long ssn){
       this.ssn = ssn;

       //setter(Modify only): public instance method
        //return type is void
        //passes one parametter .must mach with private data ,data type
        //argument must be assign to private data
        //for one private Data only
    }











}
