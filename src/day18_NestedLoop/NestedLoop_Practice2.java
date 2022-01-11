package day18_NestedLoop;
/*
 Print the following shape by using a nested Loop:
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
 */
public class NestedLoop_Practice2 {
    public static void main(String[] args) {

        for (int j = 0; j <10 ; j++) {//print 10 executii date in for i loop

            for (int i = 0; i < 10; i++) {

                System.out.print("* ");//printeaza 10*

            }
            System.out.println();//to have an extra line

        }

    }
}
