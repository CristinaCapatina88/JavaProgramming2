package day11_Switch_Scanner;
/*
Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if

 */
public class Browsers {
    public static void main(String[] args) {
       String browserName = "chrome" ;
String result = "";

boolean validBrowser= browserName =="chrome" ||browserName =="safari"|| browserName =="edge"
                        ||browserName =="firefox" ||browserName =="opera";

if(validBrowser){// 5 options
    if(browserName =="chrome"){
        result= "Chrome browser is selected";
    }else if(browserName =="safari"){
        result= "Safari browser is selected";
    }else if (browserName =="firefox"){
        result= "Firefox browser is selected";
    }else if(browserName== "Opera") {
       result = "opera browser is selected";
    }else{
        result= "opera browser is selected";
    }
    }else{
    result ="Invalid Browser Name";
}

        System.out.println(result);
    }
}
