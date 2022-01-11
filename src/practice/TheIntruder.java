package practice;
import java.util.*;
public class TheIntruder {
    public static void main(String[] args) {
    int [] nums = {2,2,3,5,4};
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE

        for(int each: nums){
            int frequency =0;

            for (int element:nums){
                if(each==element){
                    frequency++;
                }
            }

            if(frequency==1){
                System.out.println(each + " ");
            }


        }

    }
}
