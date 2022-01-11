package day35_Encapsulation.encapsulation;

public class Person {

   private String name;
    private int age;

    public String getName(){
        return name;
    }

   public void setName(String name){
        this.name=name;
   }

   public int getAge(){
        return age;
   }

    public void setAge(int age){
       if(age<=0){
           System.out.println("invalid age : "+ age);
           System.exit(0);
       }
    if(age>150){
        System.out.println("invalid age : "+ age);
        System.exit(0);
    }
        this.age=age;
}


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
