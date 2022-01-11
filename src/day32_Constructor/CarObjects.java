package day32_Constructor;

public class CarObjects {
    public static void main(String[] args) {

        Car car1= new Car("brand","model");
        Car car2 = new Car("Honda","Acord");
        Car car3 = new Car("Toyota","Camry",2000);
        Car car4 = new Car("BMW","Q7",2020,65000);
        Car car5 = new Car("Audi","AR",2018,96000,"white");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}
