package day21_ForEachLoop;

public class ForEachLoopIntro {
    public static void main(String[] args) {
        int [] numbers ={10,20,30,40,50,60,70};

        for (int i = 0; i < numbers.length; i++) {//indexes of the array
            int eachelement= numbers[i];
            System.out.println(eachelement);
        }
        System.out.println("_______________________________________");
        for (int each : numbers){//elements of the array
            System.out.println(each);
        }

    }
}
