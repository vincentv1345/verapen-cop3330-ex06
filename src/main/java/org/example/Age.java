package org.example;
import java.util.Scanner;
/**
 * UCF COP3330 Summer 2021 Assignment 1 Solutions
 * Copyright 2021 Vincent Verapen
 */
public class Age
{
    public static void main( String[] args )
    {
        System.out.println( "What is your current age?" );
        Scanner age = new Scanner(System.in);
        Scanner retire = new Scanner(System.in);
        String ageNumber = age.next();
        System.out.println("At what age would you like to retire? ");
        String retirementAge = retire.next();
        RetirementAge n = new RetirementAge();
        RetirementAge o = new RetirementAge();
        int x = n.convert(ageNumber);
        int y = o.convert(retirementAge);
        n.calculateAge(x, y);
    }
}
