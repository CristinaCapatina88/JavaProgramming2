package day37_Inheritance.phoneTask;

public class Phone {//parent only contain the common features of all subclass

    public String brand;
    public String model;
    public String size;
    public double price;
    public String color;

    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public  static  boolean hasBattery;

    static {
        hasBattery=true;
    }

    public void call(long phoneNumber){
        System.out.println(brand + model+ "is calling"+ phoneNumber);

    }
    public void text(long phoneNUmber){
        System.out.println(brand + model+ "is texting"+ phoneNUmber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", has baterry='" + hasBattery + '\'' +
                '}';
    }
}
