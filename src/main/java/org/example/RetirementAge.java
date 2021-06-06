package org.example;
public class RetirementAge extends ConvertString{
    public void calculateAge(int a, int b){
        int y = calcYear();
        int yearsLeft = b - a;
        int retirementYear = y + yearsLeft;
        System.out.println("You have " + yearsLeft + " years left until you can retire.");
        System.out.println("It's " + y + " so you can retire in " + retirementYear);
    }
}
