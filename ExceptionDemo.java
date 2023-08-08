public class ExceptionDemo {
    public static void main(String[] args) {
        int a, b, c;
        try
        {
            System.out.println("In Try Block");
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = a/b;
            System.out.println("Qoutient = "+c);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Exception Caught : "+ae);
        }
        System.out.println("After Catch");
    }
}
