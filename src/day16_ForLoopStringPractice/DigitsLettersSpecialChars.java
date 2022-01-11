package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {

        String str ="Cydeo123456Sch) (ool!@#$WoodenSpoon";

        String digits ="";
        String letters = "";
        String specialChar = "";

        for (int i = 0; i < str.length(); i++) {// index nr of str(0~last index)

            char ch = str.charAt(i);//to get all the character from the string
            if(ch>='0'&& ch <='9'){// if the character is between 0~9
                digits+= ch;
            }else if(ch>='A'&& ch <='Z'||ch>='a'&& ch <='z'){
                letters += ch;
            }else {//if the character is not digits nor letters
                if(ch !=' ') {//if the special character is not a space
                    specialChar += ch;
                }
            }

        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChar = " + specialChar);

    }
}
