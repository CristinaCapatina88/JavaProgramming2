package day09_IfStatements;
/*
 Create a class called MedianNumber.
 write a program that can find the median number between three DIFFERENT given integers

            Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
 */
public class MedianNumber {
    public static void main(String[] args) {
        int a = 10,
                b= 15,
                c = 20;
        //if we have three different nr ,one is max one is min and one is median


       //                        a= 15 b=10 c= 20     a= 15 c=10 b= 20
               boolean aIsMedian = (a>b && a<c )||(a>c && a<b);
/*
in order for a to be the median nr:
1.if c is the max & b the minimum , then a is the median number
2.if b is the max nr and c is the min then a is the median nr
 */
         // b=15 a=20 c=10              b=15 a = 10 c= 20
        boolean bIsMedian = (b>c && b<a) || (b>a && b<c);


        boolean cIsMedian = !aIsMedian && !bIsMedian;

       if(aIsMedian){//if a is the median nr
           System.out.println(a+ "is the median nr");
       }
       if(bIsMedian){//if b is the median number
           System.out.println(b+ "is the median nr");
       }

        if(cIsMedian){//if c is the median nr
            System.out.println(c +"is the median nr");
        }



    }
}
