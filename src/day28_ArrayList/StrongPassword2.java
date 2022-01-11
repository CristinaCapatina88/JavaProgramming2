package day28_ArrayList;

public class StrongPassword2 {
    public static void main(String[] args) {
      String password ="cdeo1990@";

      int countUpperCase=0;
        int countLowerCase=0;
        int countDigits=0;
        int countSpecialChar=0;

        for (int i = 0; i <password.length() ; i++) {
            char each = password.charAt(i);//each characters from every index number

            if(Character.isUpperCase(each)){
                countUpperCase++;//then is true we increse by one
            }else if(Character.isLowerCase(each)){
                countLowerCase++;//then is true we increse by one
            }else if(Character.isDigit(each)) {
                countDigits++;//then is true we increse by one
            }else {
                countSpecialChar++;//then is true we increse by one
            }
        }
        /*
        System.out.println("countLowerCase = " + countLowerCase);
        System.out.println("countUpperCase = " + countUpperCase);
        System.out.println("countDigits = " + countDigits);
        System.out.println("countSpecialChar = " + countSpecialChar);
        */

        boolean hasUpperCase= countUpperCase>0;
        boolean hasLowerCase= countLowerCase>0;
        boolean hasDigits= countDigits>0;
        boolean hasSpecialChar= countSpecialChar>0;
        
        boolean strongPassword = password.length()>=8 && !password.contains(" ") && hasDigits && hasSpecialChar && hasLowerCase && hasUpperCase;

        System.out.println("strongPassword = " + strongPassword);
    }
}
