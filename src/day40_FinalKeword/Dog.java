package day40_FinalKeword;

public class Dog extends Animal{

    public Dog(String breed, char gender, String color) {
        super(breed, gender, color);
    }

    public void eat(){
        System.out.println(getName()+ " is eating dog food");
    }



}
