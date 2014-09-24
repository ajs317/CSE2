//Andrew Schillaci
//Professor Chen
//CSE 002 Fundamentals of Programming
//23 Sept 2014

//purpose of this program is prompt the user to enter a six digit number for a course, which will then output the semester 
//the course was taken and what year

import java.util.Scanner; //create a scanner object

public class CourseNumber { //class required for every program
     public static void main (String[] args) { //main method required for every programs
          //create a scanner 
          Scanner myScanner;
          myScanner = new Scanner(System.in);
          
          System.out.print("Enter a six digit number giving the course semester: "); //print
          
          //take input
          if (myScanner.hasNextInt()) {
               int semester = myScanner.nextInt();
               if (semester < 186510 || semester > 201440) //evaulateif input is the range
                    System.out.println("The number is outside the range 186510-201440"); //print
               else if (semester % 15 == 0) //evaluate if input is divisible by 15
                    System.out.println("The course was offered in the summer 2 semester of " + semester / 100); //print
               else if (semester % 40 == 0)  //evaulate if input is divisible by 40
                    System.out.println("The course was offered in the fall semester of " + semester / 100); //print
               else if (semester % 20 == 0)  //evaulate if input is divisible by 20 
                    System.out.println("The course was offered in the Summer 1 semester of " + semester / 100); //print
               else if (semester % 10 == 0)  //evaulate if input divisible by 10
                    System.out.println("The course was offered in the spring semester of " + semester / 100); //print
               else
                    System.out.println("You entered an invalid number "); //print
          }
          else { //evaluate if all above statements are false
               System.out.println("You did not enter an int "); //print
               return;
          }
     }
}
