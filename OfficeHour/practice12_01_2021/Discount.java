package practice12_01_2021;

import java.util.Scanner;

/*
A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
                            Create a quantity variable
                            Suppose, one unit will cost 100.
                            Judge and print total cost for user.
                            ( Scanner Class can be used )

                            INPUT for quantity :  5        EXPECTED : No discount applied

                            INPUT for quantiy  :  15        EXPECTED : You get a discount of $discount and                                                                                your total cost is $totalCost
 */
public class Discount {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your quantity");
 int quantity= scan.nextInt();
 double price=100;
 double totacost= quantity*price;
 double discountrate= 0.1;
 double totalDiscount;

 if(totacost>=1000){
     totalDiscount=discountrate*totacost;
     System.out.println("you will get discount of  "+totalDiscount+" and your total will be "+(totacost-totalDiscount));

 }else{
     System.out.println("No discount applied");
 }

scan.close();

    }
}
