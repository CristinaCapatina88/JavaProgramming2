package day34_GarbageCollection_AccessModifiers;

import static day34_GarbageCollection_AccessModifiers.Circle.pi;

public class StaticImport {
    public static void main(String[] args) {

        System.out.println(Circle.pi);//call this way when we didnt import
        System.out.println(pi);//becouse we have the static import


    }
}
