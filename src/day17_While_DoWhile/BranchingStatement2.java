package day17_While_DoWhile;

public class BranchingStatement2 {
    public static void main(String[] args) {
        for (char i = 'A'; i <='E' ; i++) {

            if(i=='C'){
               break;//break gets executed when the condition gets true
            }
            System.out.println(i);
        }

        System.out.println("____________________________");
        //print even nr 1~10

        for (int i = 1; i <=10 ; i++) {

            if(i%2!=0){
                continue;//skips odd print even
            }
            System.out.println(i);
        }

        System.out.println("____________________________________________");
//print odd nr 1~10

        for (int i = 1; i <=10 ; i++) {

            if(i%2==0){
                continue;//skip the even nr
            }
            System.out.println(i);
        }


    }
}
