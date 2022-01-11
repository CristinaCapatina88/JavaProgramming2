package day19_LoopPractices;

public class ExitMethod {
    public static void main(String[] args) {

        for (int i = 0; i <5 ; i++) {

            if(i==3){
               // continue;// terminates the curent iteration of the loop
                //break; terminates the loop
                System.exit(0);//terminates the entire program as soon as i equal to 3
            }
            System.out.println(i);
        }

        System.out.println("Wooden Spoon");
    }
}
