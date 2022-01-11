package day06_PrimitiveTypeCastings;

import java.sql.SQLOutput;

/*
Create a class called BirthDay and create the following variable
             name, birthDay(int), birthMonth(String), birthYear(int)

             use concatenation to display the birthday of the person

                 if  name = "John"
                     birthDay = 25
                     birthMonth = "April"
                     birthYear = 1995;

                 output:
                     John was born on April/25/1995.
 */
public class BirthDay {
    public static void main(String[] args) {

        String name = "John";
        int birthDay = 25;
        String birthMonth = "April";
        int birthYear = 1995;


//John was born on April/25/1995.

        System.out.println(name + " was born on " + birthMonth + "/" + birthDay + "/" +birthYear + ".");

// My favorite is "bookName"

        String bookName = "50 Shades of Grey";
        System.out.println("My favorite book is \" " + bookName + "\"");


    }



}
