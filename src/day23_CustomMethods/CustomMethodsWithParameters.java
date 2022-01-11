package day23_CustomMethods;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {

        evenOrodd(10);//the methods demands additional info to complete the task
        ageOfPerson(1965);
        System.out.println("________________________");
         printNumbers(10,20);
    }

    //create a function is a number is odd numb or even nr
    public static void evenOrodd(int number){
        if(number%2==0){
            System.out.println(number+" is even umber");
        }else{
            System.out.println(number+" is odd umber");
        }

    }
    // create a function that can display the age of the person
    public static void ageOfPerson (int birthYear){
        int age =2021-birthYear;
        System.out.println("Your age is "+age);
    }

//create a func that ptint all the numbers bettwen x to y
public static void printNumbers(int x, int y){
    for (int i = x+1; i < y ; i++) {
        System.out.println(i);
    }
}
}
