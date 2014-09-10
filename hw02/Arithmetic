//Andrew Schillaci
//Professor Chen
//CSE 002 Fundamentals of Programming
//9 September 2014

//The purpose of this program is to compute and display the total cost of each kind of item; sales tax for that total cost
//total cost of purchases (before tax)
//totally actually paid for the transaction, including sales tax

public class Arithmetic { //Class required for every program
     public static void main (String [] args) { //Main method required for every program
          
          //Number of pairs of socks
          int nSocks=3;
          //Cost per pair of socks
          //(‘$’ is part of the variable name)
          double socksCost$=2.58;
          
          //Number of drinking glasses
          int nGlasses=6;
          //Cost per glass
          double glassesCost$=2.29;
          
          //Number of boxes of envelopes
          int nEnvelopes=1;
          //cost per box of envelopes
          double envelopeCost$=3.25;
          double taxPercent=0.06;
          
          double totalSocks$ = ((socksCost$) * (nSocks));//Total cost of socks
          double socksSalesTax= (totalSocks$ * .06);
          double totalGlasses$ =  ((nGlasses) * (nGlasses)); //Total cost of glasses
          double glassesSalesTax= (totalGlasses$ * .06);
          double totalEnvelopes$ = ((envelopeCost$) * (nEnvelopes)); //Total cost envelopes
          double envelopeSalesTax= (totalEnvelopes$ * .06);
          double averageCost = (socksCost$ + glassesCost$ + envelopeCost$) / 3; //Average cost of Ed's, Jan's and my meal
          double total = totalSocks$ + totalGlasses$ + totalEnvelopes$; //The total cost of purchases (before tax)
          double salesTax = (total * .06); //Round up to the next whole dollar 
          double total2= (total+salesTax);
          
          System.out.println(" Three pairs of socks costs $ " + totalSocks$ + " and the sales tax is " +socksSalesTax); //Print out the cost for a slice of pizza
          System.out.println(" Six pairs of glasses costs $ " + totalGlasses$ + " and the sales tax is " +glassesSalesTax); //Print out the cost for a scoop of ice cream
          System.out.println(" A box of envelopes costs $ " + totalEnvelopes$ + " and the sales tax is " +envelopeSalesTax); //Print out the cost for a cannoli
          System.out.println(); // Puts a space in between the print statements
          
          System.out.printf("The total cost is (before taxes) $%.2f", total); //Print out the total cost before taxes
          System.out.println(); //Puts a space in between print statements
          System.out.printf("Total actually paid for this transaction, including sales tax is $%.2f", total2);
        
     }
}
         