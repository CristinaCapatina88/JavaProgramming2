package day33_Statics;

public class Iphone {

    public static String brand ="Apple";
    public String model;
    public double price;
    public static String OS="IOS";
    public String color;

  public static boolean hasBattery=true;
    public static boolean hasFaceTime=true;

    //public static void printModelandPrice(){
     //   System.out.println(model + ": "+ price);
   // }
    public void  method1(){
        System.out.println(model + ": "+ price);
        System.out.println(OS);
    }

    public static void  printOperatingSystem(){
        System.out.println(OS);
    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
