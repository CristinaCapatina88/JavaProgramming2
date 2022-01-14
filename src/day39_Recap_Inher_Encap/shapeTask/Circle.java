package day39_Recap_Inher_Encap.shapeTask;

public class Circle extends Shape{

    public Circle( double radius) {
        super("Circle");
        setRadius(radius);
    }

    public   static double pi = 3.14;
    private  double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            System.out.println("invalid radius");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius*radius*pi;
    }

    @Override
    public double primeter() {
        return 2*radius*pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                ", area='" + area() + '\'' +
                " , perimeter='" + primeter() + '\'' +
                '}';
    }
}
