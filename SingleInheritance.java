/* Simple Inheritance Program */
class A
{
    int x;
    void setData(){
        x=10;
    }
    void display(){
        System.out.println("In A, x= "+x);
    }
}
class B extends A
{
    int y;
    void setData()
    {
        x =20; y= 30;
    }
    void display()
    {
        System.out.println("In B, x = "+x+" y = "+y);
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        A aObj = new A();
        aObj.setData();
        aObj.display();
        B bObj = new B();
        bObj.setData();
        bObj.display();
    }
}
