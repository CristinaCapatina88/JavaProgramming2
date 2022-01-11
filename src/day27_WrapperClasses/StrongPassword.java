package day27_WrapperClasses;

public class StrongPassword {
    public static void main(String[] args) {
        String password="Cydeo1990@";
        boolean r1= password.length()>=8 && !password.contains(" ");
        //we assume that all the req are false using this temp boolean expres

        boolean r2=false;//has upper case
        boolean r3=false;//has lower case
        boolean r4=false;//temp has special char
        boolean r5=false;// has digit
        
      char[]chars=  password.toCharArray();//create array by calling toCharArray
      //we check each char from the array
        for (char each : chars) {
            if(Character.isUpperCase(each)){//from wrapper class we call the method to check the uppercase
                r2=true;
            }else if(Character.isLowerCase(each)){
                r3=true;
            }else if(Character.isDigit(each)){
                r5=true;
            }else{
                r4=true;
            }
        }
        boolean isstrongPassw = r1 && r3 && r2 && r4 && r5 ;

        System.out.println("isstrongPassw = " + isstrongPassw);
        
    }

    public static boolean isStrongPassword (String password){
        boolean r1= password.length()>=8 && !password.contains(" ");
        //we assume that all the req are false using this temp boolean expres

        boolean r2=false;//has upper case
        boolean r3=false;//has lower case
        boolean r4=false;//temp has special char
        boolean r5=false;// has digit

        char[]chars=  password.toCharArray();//create array by calling toCharArray
        //we check each char from the array
        for (char each : chars) {
            if(Character.isUpperCase(each)){//from wrapper class we call the method to check the uppercase
                r2=true;
            }else if(Character.isLowerCase(each)){
                r3=true;
            }else if(Character.isDigit(each)){
                r5=true;
            }else{
                r4=true;
            }
        }
        boolean isstrongPassw = r1 && r3 && r2 && r4 && r5 ;
        return isstrongPassw;
    }
}
