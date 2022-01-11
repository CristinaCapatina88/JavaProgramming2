package day23_CustomMethods;

public class CustomMethodsPractice {
    public static void main(String[] args) {

        helloworld5times();
        System.out.println("_____________________");
         helloCydeo5times();
        System.out.println("_____________________");
         evennumbers();
    }
    //create a function that can print hello world 5 times
    public static void helloworld5times(){

        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello World!");
        }
    }
//create a function that can print Cydeo  5 times
    public static void helloCydeo5times(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello Cydeo!");
        }
    }
    // create a function that can print the even nr from 1 ~10
    public static void evennumbers(){
        for (int i =1; i <=10 ; i++) {//or( i=2;i<11;i+=2)
            if(i%2==0){
                System.out.println(i);
            }
        }
    }

}
