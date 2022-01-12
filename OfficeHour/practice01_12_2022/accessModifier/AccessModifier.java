package practice01_12_2022.accessModifier;

import practice01_05_2022.WrapperClassIntro;

public class AccessModifier {
    public static void main(String[] args) {
       Person person= new Person();
       person.ID=123;
       person.name="Palina";
       person.lastName="Ivankiu";
       //person.age= 25;
        WrapperClassIntro wp= new WrapperClassIntro();
        System.out.println("wp.str = " + wp.str);

    }

}
