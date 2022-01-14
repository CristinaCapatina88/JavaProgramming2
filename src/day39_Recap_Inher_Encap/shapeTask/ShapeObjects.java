package day39_Recap_Inher_Encap.shapeTask;

public class ShapeObjects {
    public static void main(String[] args) {


        Square square = new Square(10.0);
        System.out.println(square);

        square.setSide(15);

        Rectangle rectangle=new Rectangle(2.5 ,6.3);
        System.out.println(rectangle);

        rectangle.setLength(10);
        System.out.println(rectangle.getLength());

        Circle  circle = new Circle(5);
        System.out.println(circle);

        circle.setRadius(3);
        System.out.println(circle.getRadius());

    }
}
