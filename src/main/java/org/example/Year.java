package org.example;
import java.util.Date;


public class Year {
    public int calcYear(){
        Date a = new Date();
        int year = a.getYear();
        int actualYear = (year + 1900);
        return actualYear;
    }
}
