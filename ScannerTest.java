/* program to read Student Roll Number and Name from the console and display them (Using Scanner class) */
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your rollno and name :");
        int rollno = sc.nextInt();
        String  name = sc.next();
        System.out.println("Roll No: "+rollno+" Name: "+name);
        sc.close();
    }
}
