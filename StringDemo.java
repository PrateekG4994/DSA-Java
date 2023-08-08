/*A Demo Program on String Operations */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println("s1 = "+s1);
        char[] arr = {'a','b','c','d','e','f','g'};
        String s2 = new String(arr);
        System.out.println("s2 = "+s2);
        String s3 = new String(s2);
        if(s2==s3)
        System.out.println("s2 and s3 are equal references");
        if(s2.equals(s3))
        System.out.println(" s2 and s3 have same contents");
        System.out.println(s2+ " StartsWith abc = " + s2.startsWith("abc"));
        String s4 = "this is original";
        System.out.println("s4 = "+s4);
        System.out.println("after replacing i by x ");
        String s5 = s4.replace('i','x');
        System.out.println("s4 = "+s4);
        System.out.println("s5 = "+s5);
    }    
}
/*output
s1 = 
s2 = abcdefg
s2 and s3 have same contents
abcdefg StartsWith abc = true
s4 = this is original
after replacing i by x
s4 = this is original
s5 = thxs xs orxgxnal
 */