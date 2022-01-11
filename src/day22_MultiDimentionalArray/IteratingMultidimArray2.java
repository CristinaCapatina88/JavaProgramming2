package day22_MultiDimentionalArray;

public class IteratingMultidimArray2 {
    public static void main(String[] args) {

        int [][] arr2D = {{1,2,3} ,{4,5,6,7},{8,9,10,11,12} };

        for (int i = arr2D.length - 1; i >= 0; i--) {//i index nr of 1D array starting from last index to zero

            for (int j = 0; j < arr2D[i].length; j++) {//j index nr of each elements starting from zero to last index
                System.out.print(arr2D[i][j]+" ");
            }

            System.out.println();

        }
        System.out.println("_____________________________________");

        for (int i = 0; i < arr2D.length; i++) {//index nr of each 1D arrays starting from zero

            for (int j = arr2D[i].length - 1; j >= 0; j--) {//j for each element starting from last index to zero
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();

        }
        System.out.println("____________________________________");
        for (int i = arr2D.length - 1; i >= 0; i--) {//printeaza dela coada toate 1D arrays

            for (int j = arr2D[i].length - 1; j >= 0; j--) {//printeaza de la coada toate elementele din fiecare array
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }

    }
}
 /*
 task:1
 8 9 10 11 12 13
 4,5,6,7
 1,2,3



 task:2

3 2 1
7 6 5 4
12 11 10 9 8


task 3
12 11 10 9 8
7 6 5 4
3 2 1
  */