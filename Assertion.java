public class Assertion {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        assert(a >= 0) : "a is negative or zero";
        System.out.println("Result = " +10/a);
    }
}
