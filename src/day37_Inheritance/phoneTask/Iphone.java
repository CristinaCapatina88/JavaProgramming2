package day37_Inheritance.phoneTask;

public class Iphone extends Phone{

    public Iphone( String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }
    public void faceTime(long phoneNumber){
        System.out.println(brand + "is having a Face Time "+phoneNumber);
    }


}
/*
Create a sub class of Phone named IPhone:
                Variables:
                    brand, model, size, price, color

                Methods:
                    Constructor
                    call(long phoneNumber)
                    text(long phoneNumber)
                    faceTime(long phoneNumber)
                    faceTime(String email)
                    toString()
 */