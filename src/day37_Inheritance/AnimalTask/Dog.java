package day37_Inheritance.AnimalTask;

public class Dog extends Animal {
public int a;


    public Dog(String name, String breed, String size, String color, char gender, int age,int a){
super(name, breed, size, color, gender, age);

this.a=a;
    }

    public void bark(){
        System.out.println(name+ " is barking ");
    }

}


