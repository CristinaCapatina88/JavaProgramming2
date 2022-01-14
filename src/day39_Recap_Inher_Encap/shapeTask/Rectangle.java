package day39_Recap_Inher_Encap.shapeTask;

public class Rectangle extends Shape {

    private double length;
    private double width;


    public Rectangle( double length, double width) {
        super("Rectangle");
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        if(length<=0){
            System.out.println("Invalid length"+ length);
            System.exit(1);
        }
        this.length = length;
    }



    public void setWidth(double width) {
        if(width<=0){
            System.out.println("Invalid width"+ width);
            System.exit(1);
        }
        this.width = width;
    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double primeter() {
        return 2*(length*width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area='" + area() + '\'' +
                " , perimeter='" + primeter() + '\'' +
                '}';
    }
}
