package day40_FinalKeword;

public class Animal {
    private  String name;
    private final String breed;
    private final char gender;
    private final String color;
    private String size;
    private int age;

    public Animal(String breed, char gender, String color) {
        this.breed = breed;
        this.gender = gender;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println(name+ " is eating");
    }

    public final void drink(){
        System.out.println(name+ " is drinking water");
    }



}
