/* Abstract Class and Methods */
abstract class Shape
{
    double dim1, dim2;
    Shape(double d1, double d2)
    {
        dim1 = d1; dim2 = d2;
    }
    abstract double area();
}
class Circle extends Shape
{
    Circle(double radius)
    {
        super(radius, 0);
    }
    double area()
    {
        return Math.PI*dim1*dim1;
    }
}
class Rectangle extends Shape{
    Rectangle(double length, double breadth)
    {
        super(length, breadth);
    }
    double area()
    {
        return dim1*dim2;
    }
}
public class AbstractDemo
{
    public static void main(String[] args) {
        Shape s;
        s = new Circle(2);
        System.out.println("Area of Circle = "+s.area());
        s = new Rectangle(10, 20);
        System.out.println("Area of rectangle = "+s.area());
    }
}
/*Output
Area of Circle = 12.566370614359172
Area of rectangle = 200.0
 */