package day10_NestedIf;

public class GradeReport2 {
    public static void main(String[] args) {

      int s= 135;

        String result =(s>=0 && s<= 100)?   (s>=90)? "Excellent"  :(s>=80)?  "Great"  :(s>=70)?
                        "Good"  :(s>=60)?  "Passed" : "Failed"  :"Invalid Score";

        System.out.println(result);


    }
}
