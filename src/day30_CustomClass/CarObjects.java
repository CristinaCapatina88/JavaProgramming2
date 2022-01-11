package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {

        Car car1= new Car();
        car1.setInfo("Honda","Pilot","Grey",2020,45000);

        Car car2 = new Car();
        car2.setInfo("Toyota", "Camry","white",1996,20000);

        car1.drive();
        car2.stop();

        System.out.println(car1);
        System.out.println(car2);

        Car [] cars = {car1,car2};// array of cars
        ArrayList<Car> carslist = new ArrayList<>();
        carslist.addAll(Arrays.asList(car1,car2));// arrayList that contains two cars

        for(Car each:carslist){
            System.out.println(each.brand+ " : "+ each.price);
        }
        System.out.println("______________________________________________________");
//recall cars Honda: 2005-2008
 //recall cars Toyota: 1995-1997

       carslist.removeIf(p-> p.brand.equals("Honda") && p.year>=2005 && p.year<=2008) ;
       carslist.removeIf(p-> p.brand.equals("Toyota") && p.year>=1995 && p.year<=1997);


        System.out.println(carslist);


    }
}
