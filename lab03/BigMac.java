//Andrew Schillaci
//Professor Chen
//CSE 002
//12 September 2014

//Purpose of this program is to compute the cost of buying some big macs
//I will use the scanner class to obtain from the user the how many big macs, cost of big macs, and the percentage sales tax
//Then displays the total cost

import java.util.Scanner;

public class BigMac {
    public static void main (String args[]){
        
        scanner myScanner;
        myScanner = new Scanner(System.in);
        
        System.out.print("Enter the number of big macs (an integer > 0):");
        int nBigMacs = myScanner.nextDouble();
        
        System.out.print("Enter the cost per Big Mac as " + " a double (in the form xx.xx):");
        int bigMac$ = myScanner.nextDouble();
        
        System.out.print("Enter the percent tax as a whole number (xx): ");
        double taxrate = myScanner.nextDouble();
        
        double cost$;
        cost$ = nBigMacs*bigMac$*(1+taxrate); //Get the whole amount, dropping decimal fraction dollars = (int) cost$
        int dollars = (int)cost$; //Whole dollar amount of cost dimes, penniesint dimes= (int) (cost$*100)%10;
        int pennies=(int)(cost$*100)%10;
        System.out.println("The total cost of " +nBigMacs +" big macs, at $"+bigMac$ +" per Big Mac, with a " + " sales tax of $"+ taxrate + ", is $"+dollars+ '.' +dimes+pennies);
        
    }
}