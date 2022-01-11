package day10_NestedIf;
/*
90~100:excelent
80~89 : great
70~79 : good
62~69: passed
0~59 :failled
 */
public class GradeReport {
    public static void main(String[] args) {

int score = 95;
if(score >= 0 && score <= 100){//if the score is valid
    //5 possibilities
    if(score >= 90 ){
        System.out.println("excellent");
    }else if (score >= 80 ){//false score<80
        System.out.println("great");
    }else if(score>=70){//false score <70
        System.out.println("good");
    }else if (score >=60){//false score less60
        System.out.println("passed");
    }else{
        System.out.println("failed");
    }

    System.out.println("score = " + score);



}else {
    System.out.println("Invalid score");
}


        System.out.println("____________________________________");

String result ="";//temporary

        if(score >= 0 && score <= 100){ // if the score is valid (0 ~ 100 )

            if(score>= 90 ){ //false:  score < 90
                result = "Excellent";
            }else if(score >= 80 ){ // false: score < 80
                result = "Great";
            }else if(score >= 70){ // false: score < 70
                result = "Good";
            }else if(score >= 60){// false: score < 60
                result = "Passed";
            }else{
                result = "Failed";
            }

        }else{ // if the score is NOT valid
            result = "Invalid Score";
        }




    }

}
