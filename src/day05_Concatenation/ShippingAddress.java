package day05_Concatenation;
/*
Create a class called ShippingAddress.java
Declare the following variables:
name
buildingNumber
streetName
city
state
zipCode

Use concatenation to print the full shipping address
 */
public class ShippingAddress {
    public static void main(String[] args) {

        String name ="Cristina King",
                buildingNumber ="11258",
                streetName ="Maple str",
                city ="Plainville",
                state ="MA",
                zipCode ="02658";
        System.out.println(name + "\n" +buildingNumber +" " + streetName +"\n"
        +city + ", " + state +" " +zipCode);




    }



}
