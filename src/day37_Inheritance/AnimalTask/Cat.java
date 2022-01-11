package day37_Inheritance.AnimalTask;

public class Cat extends Animal {

    public Cat(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);//calling the parent class
    }


    public void scratch(){
        System.out.println(name+" is scatching");
    }


}
