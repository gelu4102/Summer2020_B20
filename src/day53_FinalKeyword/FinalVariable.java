package day53_FinalKeyword;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.time.LocalDate;

public class FinalVariable {

    final static String eyeColor = "Brown";
    final String bloodType = "A";

    final int x;//final instance variables need to be initialized right away
    final static int y;//final instance variables need to be initialized right away

    static {
        y = 300;
    }

    public FinalVariable(){
        x = 700;
    }

    public static void main(String[] args) {

        final LocalDate dateOfBirth = LocalDate.of(2000, 5, 7);
        //dateOfBirth = LocalDate.of(1990,6,5);
        System.out.println(dateOfBirth);

        final long ssn = 123467;
        //ssn = 987654

        System.out.println(ssn);

        final double PI = 3.14;
                //PI = 2.14;

        final char gender = 'M';
        //gender = 'F'

        final String birthPlace = "USA";
        //birthPlace = "England";




    }
}
