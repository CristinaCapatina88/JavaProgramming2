package day10_NestedIf;

public class NameOfMonths2 {
    public static void main(String[] args) {

        int n =5;

        String result = (n== 1) ? "January" :(n== 2)? "Feb" :(n== 3)? "March" :(n == 4)? "April" :(n == 5)? "May"
                :(n== 6)? "June " :(n == 7)? "July"  :(n == 8)? "August" :(n == 9)? "September"
                :(n == 10)?  "Octomber" :(n == 11 )? "November" : "December";

        System.out.println(result + " is the current month ");








    }
}
