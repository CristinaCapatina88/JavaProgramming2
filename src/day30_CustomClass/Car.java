package day30_CustomClass;

public class Car {
    public String brand;
    public  String model;
    public String color;
    public int year ;
    public int price;


    public void drive (){
        System.out.println(brand+" "+model+ " is driving");
    }
     public void start(){
         System.out.println(brand+" "+model+ " started");
     }

    public void stop(){
        System.out.println(brand+" "+model+ " stoped");
    }
    public void setInfo(String carbrand, String carmodel, String carcolor, int caryear, int carprice){
        brand=carbrand;
        model=carmodel;
        color=carcolor;
        year=caryear;
        price=carprice;
    }

    public String toString() {
        return "Car :" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=$" + price +
                ' ';
    }
}
/*
Car Class:

    Attributes:
        brand, model, color, year, price

    Actions:
        drive(), start(), stop(), toString(), setInfo()


Student Class:

    Attributes:
        name, gender, age, studentID

    Actions:
        eat(), sleep(), drink(), code()
        setInfo(): to set all the attributes of student object
        toString(): to print the full info of student
 */