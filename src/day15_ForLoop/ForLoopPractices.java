package day15_ForLoop;

public class ForLoopPractices {
    public static void main(String[] args) {

        for( int i =15; i<=45 ;i++) {

            System.out.print(i+ " ");

        }

        System.out.println();

        System.out.println("_________________________________________________");
        //100.....50
        for(int i= 100; i>=50; i--){//i:100 99 98 ...50
            System.out.print(i+" ");

        }
        System.out.println();

        System.out.println("_____________________________________________");

        //print all the even nr betw 1~55

        for(int i=1 ; i<= 55; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }

        }

        System.out.println();//to print the next print statement from a new line
         //print all the even nr betw 1~55

        for (int i=2 ; i<=54; i +=2 ) {//1:2 4 6 8..54
            System.out.print(i+" ");

        }

        System.out.println();
        System.out.println("____________________________________________");



    }
}
