package day32_Constructor;

public class ConstructorCalls {

    public ConstructorCalls(){
        System.out.println("Default Constructor");
    }

    public ConstructorCalls(int a){
        this();
        System.out.println("Constructor with int argument");
    }

    public static void main(String[] args) {

       ConstructorCalls obj1 = new ConstructorCalls();

        System.out.println("________________________________________");

        ConstructorCalls obj2 = new ConstructorCalls(10);


    }

}
