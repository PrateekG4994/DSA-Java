/* Program to Demonstrate Inheritance and Interfaces */
import static java.lang.Math.*;
interface Shape
{
    double area();
}
class Circle implements Shape
{
    double radius;
    Circle(double radius){
    this.radius=radius;
    }
    public double area() {
    return Math.PI * radius * radius;
    }
}
class Cylinder extends Circle
{
    double height;
    Cylinder(double radius, double height){
    super(radius);
    this.height=height;
    }
    public double area() //Overriding
    {
        return Math.PI * radius * radius * height;
    }
}
public class Test {
    public static void main(String[] args) {
        Shape s;
        s = new Circle(5.2);
        System.out.println("Area of Circle = " +s.area());
        s = new Cylinder(5, 2.5);
        System.out.println("Area of Cylinder = " +s.area());
    }
}

/*
OUTPUT
Area of Circle = 84.94866535306801
Area of Cylinder = 196.34954084936209
 */