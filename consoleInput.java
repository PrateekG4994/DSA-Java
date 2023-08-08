/* Program to read Student roll Number and Name from the console and display them(Using BUfferedReader) */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class consoleInput {
    public static void main(String[] args)  throws IOException{
        int rollNumber;
        String name;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Roll Number: ");
        rollNumber = Integer.parseInt(br.readLine());
        System.out.println("Enter the Name: ");
        name = br.readLine();
        System.out.println(" Roll Number = " + rollNumber);
        System.out.println(" Name = " + name);
        
    }
}
