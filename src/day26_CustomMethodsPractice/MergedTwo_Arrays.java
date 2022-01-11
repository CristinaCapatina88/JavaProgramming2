package day26_CustomMethodsPractice;

public class MergedTwo_Arrays {

    public static void main(String[] args) {

    }
    public static int[] merge (int[] arr1, int[] arr2) {
        int [] result = new int[arr1.length+ arr2.length];
        int i=0;
        for (int each : arr1) {
            result[i++]=each;
        }
        for (int each : arr1) {
            result[i++]=each;
        }
        return result;
    }
    }





