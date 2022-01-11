package day24_CustomMethod_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {
        //find the  max number between 100&200

      int maxnumber =  max(100,200);//we assign the value to a variable to make it reusable
        System.out.println(maxnumber);

        //multiply the max number by 2

        int multiplication= maxnumber*2;
        System.out.println(multiplication);
    }

    public static int max (int a, int b){
        int result=0;

        if(a>b){
            result=a;
        }else{
            result=b;
        }
        return result;
    }
}
