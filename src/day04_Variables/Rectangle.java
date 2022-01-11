package day04_Variables;

//length
//                        width
//
//                        area = length * width
//                        perimeter =  2 * (length + width)
public class Rectangle {
    public static void main(String[] args) {
        double length =5.1;
        double width = 2.1;

        double area = length * width ;
        double perimeter = 2*(length+width);

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
        System.out.println("width = " + width);
        System.out.println("length = " + length);

    }

}
