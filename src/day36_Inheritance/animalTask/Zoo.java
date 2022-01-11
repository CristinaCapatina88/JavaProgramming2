package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setInfo("Max","Husky","Small","White",'M',2);
dog.eat();
dog.drink();
        dog.sleep();
dog.move();
dog.bark();

        System.out.println(dog);

        Cat cat = new Cat();
        cat.setInfo("Tarcin","British","Small","brown",'F', 2);
cat.eat();
cat.sleep();
cat.drink();
cat.move();

cat.meow();
cat.scratch();

        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", "Large", "Red",'M' ,1 );

tiger.eat();
tiger.move();
tiger.drink();
tiger.sleep();

tiger.roar();
tiger.hunt();

        System.out.println(tiger);

    }
}
