package day18_NestedLoop;
/*
write proframm that can divide two positive numbers without using division and * multipl oper.
 */
public class DivideTwoNumbers {
    public static void main(String[] args) {
        int a=30;
        int b =7;

        int count =0;//to count how many time b is subtracting from a

        while(a>=b){
            a-=b;
            count++;//every time the loop is executed the count increases (this is how we get the result for division)

        }
        System.out.println(count+" with a remainder of "+ a);


    }
}
