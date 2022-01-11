package day08_IfStatement;
/*
90- 100 ===>Excellent
80-89 ===>great
70-79===> good
60-69=====> passed
0- 59 ==>failed
 */
public class GradeReport {
    public static void main(String[] args) {
int score =85;
boolean a = score >=90 && score <=100;//when we give a condition for a range we use and logic
 boolean b =score >=80 && score <=89;//or score >=80 && !a ;
  boolean c = score >=70 && score<=79;
  //boolean c =!a && !b && score >=70;

        boolean d = score >=60 && score <= 69;
        boolean f = score >= 0 && score <=59;
        //boolean f = !a&& !b && !C && !D;
if(a) {//if the student made a
    System.out.println("Excellent");
}

if(b) {
    System.out.println("Great");
}
if(c) {
    System.out.println("Good");
}

if(d) {
    System.out.println("Passed");
}
if (f) {
    System.out.println("Failed");
}


    }
}
