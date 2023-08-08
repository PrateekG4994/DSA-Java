/*a Program on Throwing Excerptions */
class MyClass
{
    static void method()
    {
        try
        {
            throw new ArithmeticException();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Caught and Rethrown");
            throw e;
        }
    }
}
public class ThrowingException {
    public static void main(String[] args) {
        try{
            MyClass.method();
        }
        catch(Exception e)
        {
            System.out.println("Caught in main " +e);
        }
    }
}
//Output
/*Caught and Rethrown
Caught in main java.lang.ArithmeticException*/