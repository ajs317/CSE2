//Andrew Schillaci
//Professor Chen
//CSE 002 Fundamentals of Programming
//23 September 2014

//purpose of this program is to prompt the user to enter a month and then feedback how many days are in the month
//also ask for a the year if the input is Feb

import java.util.Scanner; //create a scanner object

public class Month { //class required for every Java program
     public static void main (String[] args) { //main method required for every Java program
          
          //create a scanner     
          Scanner myScanner;
          myScanner = new Scanner(System.in);
          
          //prompt the user top enter a month
          System.out.print("Enter an integer for the month, January(1), February(2), March(3), April(4), May(5), June(6), July(7), August(8), September(9), October(10), November(11),December(12): ");
          int month = myScanner.nextInt();
          
          if ((month == 1) || (month== 3) || (month==5) || (month==7) || (month==8) || (month==10) || (month==12)) //evaluate if month has 31 days
               System.out.println("The month has 31 days ");//print
          else if ((month == 4) || (month==6) || (month==9) || (month==11)) //evaluate if month has 30 days
               System.out.println("The month has 30 days ");//print
          else if (month == 2) //evaluate if month is February
               System.out.println("The month has 28 days ");//print
          else //evaluate if all above statements are false
               System.out.println("You did not enter an int between 1 and 12 ");//print
          
     }
}

