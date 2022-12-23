package projects.shapes;

/**
 *
 * @author MOHAMED HASSAN
 */

class Circle{
    double radius;
    String color;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color=" + color + '}';
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
}
class Cylinder extends Circle{
    double hight;
    public Cylinder( double hight) {
        this.hight = hight;
    }

    public Cylinder(double hight, double radius) {
        super(radius);
        this.hight = hight;
    }

    public Cylinder() {
    }

    
    public Cylinder(double hight, double radius, String color) {
        super(radius, color);
        this.hight = hight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    @Override
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getRadius() {
        return radius;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Cylinder{" + "radius=" + radius + ", color=" + color + ", hight=" + hight +'}';
    }

    
    
    

    public double getVolume(){
        return 3.14*radius*radius*hight;
    }
    

    
    
}
public class Shapes {

    public static void main(String[] args) {
        Circle A =new Circle();
        A.setRadius(2.2);
        A.setColor("Red");
        A.getArea();
        A.toString();
        System.out.println( A.toString());
        System.out.println("The Area of Circle = "+A.getArea());
        Cylinder V = new Cylinder();
        V.setHight(3.2);
        V.setRadius(2.3);
        V.getColor();
        V.setColor("Red");
        V.getVolume();
        V.toString();
        System.out.println(V.toString());
        System.out.println("The Volume of Cylinder = "+V.getVolume());
    }
}
    
