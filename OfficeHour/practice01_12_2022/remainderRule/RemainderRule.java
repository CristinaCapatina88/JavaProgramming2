package practice01_12_2022.remainderRule;

public class RemainderRule {
    public static void main(String[] args) {

boolean hasremaindere=remainder(15,5);

        System.out.println(hasremaindere);


    }

    public static boolean remainder(int a, int b ){
        if(a%b==0){
            return true;
        }else{
            return false;
        }
    }
}
