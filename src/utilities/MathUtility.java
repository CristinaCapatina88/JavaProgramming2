package utilities;

public class MathUtility {
   //Create a method that can return the sum of two integers
    public static int sum (int num1, int num2){
        int result = num1+num2;
        return result;
    }

    //Create a method that can return the sum of two decimal numbers
    public static double sum (double num1, double num2){
        double result = num1+num2;
        return result;
    }

    //Create a method that can return the subtraction of two integers
    public static int substraction (int num1, int num2){
        int result = num1-num2;
        return result;
    }

	//Create a method that can return the subtraction of two decimals
    public static double substraction (double num1, double num2){
        double result = num1-num2;
        return result;
    }

    //Creat a method that can return the multiplication of two integers
    public static int multiplication (int num1, int num2){
        int result = num1*num2;
        return result;
    }

	//Create a method that can return the multiplication of two decimals
    public static double multiplication (double num1, double num2){
        double result = num1*num2;
        return result;
    }

    //Create a method that passes two double parameters and return the division result
    public static double division (double num1, double num2){
        double result = num1/num2;
        return result;
    }

    //Create a method that can check if an integer is even number
        public static boolean even (int num) {
            boolean result = false;
            if(num%2==0)
                result=true;
            return result;
        }

	//Create a method that can check if an integer is odd number
    public static boolean odd (int num) {
        boolean result = false;
        if(num%2!=0)
            result=true;
        return result;
    }

    //Create a method that can return the maximum number between two integers
      public static int max(int num1, int num2){
        int max =0;
        if(num1>num2){
            max=num1;
        }else{
            max=num2;
        }
        return max;
      }

	//Create a method that can return the maximum number between two decimal numbers
    public static double max(double num1, double num2){
        double max =0;
        if(num1>num2){
            max=num1;
        }else{
            max=num2;
        }
        return max;
    }

	//Create a method that can return the minimum number between two integers
    public static int min(int num1, int num2){
        int min =0;
        if(num1<num2){
            min=num1;
        }else{
            min=num2;
        }
        return min;
    }

	//Create a method that can return the minimum number between two decimal numbers
    public static double min(double num1, double num2){
        double min =0;
        if(num1<num2){
            min=num1;
        }else{
            min=num2;
        }
        return min;
    }

    //Create a method that can return the square of an integer
     public static int square (int num){
      int result=num*num;
       return result;
}
    //Create a method that can return the square of a double

    public static double square (double num){
        double result=num*num;
        return result;
    }

	// Create a method that can return the cube of an integer
    public static int cube (int num){
        int result=num*num*num;
        return result;
    }

	//Create a method that can return the cube of a double
    public static double cube (double num){
        double result=num*num*num;
        return result;
    }

}

/*
    1. Create a class called MathUtility under the utility package:
			2.1 Create a method that can return the sum of two integers
			2.2 Create a method that can return the sum of two decimal numbers
			2.3 Create a method that can return the subtraction of two integers
			2.4 Create a method that can return the subtraction of two decimals
			2.5 Creat a method that can return the multiplication of two integers
			2.6 Create a method that can return the multiplication of two decimals
			2.7 Create a method that passes two double parameters and return the division reslt
			2.8 Create a method that can check if an integer is even number
			2.9 Create a method that can check if an integer is odd number
			2.10 Create a method that can return the maximum number between two integers
			2.11 Create a method that can return the maximum number between two decimal numbers
			2.12 Create a method that can return the minimum number between two integers
			2.13 Create a method that can return the minimum number between two decimal numbers
			2.14 Create a method that can return the square of an integer
					Ex: square(2) ==> 4
			2.15 Create a method that can return the square of a double
			2.16 Create a method that can return the cube of an integer
			2.17 Create a method that can return the cube of a double
     */

