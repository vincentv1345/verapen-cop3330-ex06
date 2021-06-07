package org.example;
import java.util.Date;
/**
 * Used outdated Date import
 * so I had to add 1900 to the year
 * when taken from imported package
*/

public class Year {
    public int calcYear(){
        Date a = new Date();
        int year = a.getYear();
        return (year + 1900);
    }
}
