package practice01_12_2022.constructor;

public class BaklavaRecipe {
    public String type;
    public double price;
    public int amountLB;

public  BaklavaRecipe(String type){
    this.type=type;
}

public BaklavaRecipe(String type, int amountLB){
    this(type);
    this.amountLB=amountLB;
}
    public BaklavaRecipe(String type, int amountLB, double price){
        this(type,amountLB);
        this.price=price;
    }

public void feedback(){
    System.out.println("Please write feedback for our desserts");
}

public static void order(){
    System.out.println("Please give your order at least 3 days in advance");
}

    public String toString() {
        return "BaklavaRecipe{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", amountLB=" + amountLB +
                '}';
    }
}
/*

        - Create a class called BaklavaRecipe

        Attributes:

            String type, int amountLB, double price

        - Add A constructor that can set all the fileds

        Actions:
           feedback(), static order() , toString()

        - Create a object class called BaklavaObjects

        */