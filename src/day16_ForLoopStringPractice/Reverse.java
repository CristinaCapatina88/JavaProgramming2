package day16_ForLoopStringPractice;
/*
write a progr that can reverse a String
input:WoodenSpoon
out: noopS nedooW
 */
public class Reverse {
    public static void main(String[] args) {

        String str = "Wooden Spoon";

        String result ="";// contain the reversed version of str

       /*
        result+= str.charAt(str.length()-1);//n
        result+= str.charAt(10);//o
        result+= str.charAt(9);//o
        result+= str.charAt(8);//p
        result+= str.charAt(7);//S
        result+= str.charAt(6);//' '
        result+= str.charAt(5);//n
        result+= str.charAt(4);//e
        result+= str.charAt(3);//d
        result+= str.charAt(2);//o
        result+= str.charAt(1);//o
        result+= str.charAt(0);//W
        */

        for(int i= str.length()-1; i>=0;i-- ){//i:index nr of str (starting from last index to index 0
            result+=str.charAt(i);//to get each character from the string
       //+= means adding each character to the result
        }



        System.out.println(result);


    }
}
