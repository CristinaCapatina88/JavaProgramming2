package day17_While_DoWhile;

public class DoWhileLoopIntro {
    public static void main(String[] args) {
        boolean a= false;

        for (int i = 0; a;) {
            System.out.println("wooden - for loop");
        }
        System.out.println("________________________________________");

       while(a) {//it will never gets executet becouse is false
           System.out.println("wooden--while loop");
       }
        System.out.println("____________________________________");

       do{
           System.out.println("wooden--- do-while loop");//va printa wooden no meter what
       }while (a);//if is true it will be repeated again

    }
}
