package day59_OOPReview;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Encapsulation {

    private int ssn;

    private final LocalDate published = LocalDate.of(2020,9,8);//cam not be modified
    private int getSSN(){//read only
        return ssn;
    }

    public void setSsn(int ssn){//modify only
        this.ssn = ssn;
    }

    public LocalDate getPublished(){
        return published;
    }
    //public void set published(LocalDate published){this.published = published}
}
