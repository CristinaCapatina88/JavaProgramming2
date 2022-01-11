package day24_CustomMethod_Return;
/*
1. Create a method that can display the initials of the person

2. Create a method that can display the domain of the email

3. Create a method that can display the name of the month based on the given number to the method

4. Create a method that can print the name of the day based on the given number to the method

5. Create a method that can print how many days a month has
 */
public class BreakfastTasks {

    public static void main(String[] args) {
     initials("cristina","roman");// this is argument

    domain("cris@yahoo.com");
     nameOfMonth(11);


    }

    // 1.Create a method that can display the initials of the person.  initials()
 public static void initials(String firstName , String lastName){
        String initial = firstName.charAt(0)+ "."+ lastName.charAt(0);
     System.out.println("initial = " + initial.toUpperCase());
 }

  //2. Create a method that can display the domain of the email
public static void domain (String email){
     String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
    System.out.println(domain);
}

//3. Create a method that can display the name of the month based on the given number to the method
public static void nameOfMonth(int number){
        String name ="";
        if(number>=1 && number<=12){
           name=(number==1)? "Jan" :(number==2)? "Feb" :(number==3)? "March": (number==4)? "April":(number==5)? "May":(number==6)? "june" :(number==7)? "July"
                   :(number==8)? "August" :(number==9)? "Sept":(number==10)? "Oct":(number==11)? "Nov" : "Dec";
        }else{
            name="Invalid";
        }
    System.out.println("name = " + name);
}

//4. Create a method that can print the name of the day based on the given number to the method
 public static void nameOfDay(int number){


 }

//5. Create a method that can print how many days a month has
    public static void daysInMonths (int number){



    }
//Create a class called AgeGroups, and write a program that can define the age groups of a person
//
//                 age groups are:
//                        infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
//                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
//                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
//                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
//                        Senior Citizen (75 - 84),
//                        Old Senior Citizen (85+)



}
