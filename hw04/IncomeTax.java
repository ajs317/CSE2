//Andrew Schillaci
//Professor Chen
//CSE 002 Fundamentals of Programming
//23 Sept 2014

//purpose of this program is prompt the user to enter a number in thousands and provide the tax bracket for this number
//and how much that number will be taxed

import java.util.Scanner; //create a scanner object

public class IncomeTax { //class required for every program
     public static void main (String[] args) { //main method required for every programs
          //create a scanner 
          Scanner myScanner;
          myScanner = new Scanner(System.in);
          
          System.out.print("Enter an int given the number of thousands: "); //print
          
          //take input
          if (myScanner.hasNextInt()) {
               int digits = myScanner.nextInt();
               if (digits >= 0 && digits < 20) //evaulate if digits is in the range
                    System.out.println("The tax rate on $" +digits * 1000 + " is 5%, and the tax is $" +(digits * 1000) * .05); //print
               else if (digits < 0) //evaluate if digits is greater than 0
                    System.out.println("You did not enter a positive int"); //print
               else if (digits >= 20 && digits < 39)  //evaulate if digits is equal to 15
                    System.out.println("The tax rate on $" +digits * 1000 + " is 7%, and the tax is $" +(digits * 1000) * .07); //print
               else if (digits < 40)  //evaulate if digits is equal to 16 
                    System.out.println("The tax rate on $" +digits * 1000 + " is 7%, and the tax is $" +(digits * 1000) * .07); //print
               else if (digits >=40 && digits < 78) //evaluate if digits is in the range
                    System.out.println("The tax rate on $" +digits * 1000+ " is 12%, and the tax is $" +(digits * 1000) * .12); //print
               else if (digits < 78) //evaluate if digits is less than 78
                    System.out.println("The tax rate on $" +digits * 1000 + " is 12%, and the tax is $" +(digits * 1000) * .12); //print
               else if (digits >= 78)  //evaluate
                   System.out.println("The tax rate on $" + digits * 1000 + " is 14%, and the tax is $" +(digits * 1000) * .14); //print
               else //evaluate if all above statements are false
                    System.out.println("You entered an invalid number "); //print
          }
          else { //evaluate if all above statements are false
               System.out.println("You did not enter an int "); //print
               return;
          }
     }
}
