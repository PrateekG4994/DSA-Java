/*A program to display contents of file a.txt */
import java.io.FileInputStream;
import java.io.IOException;

public class File {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
        int n;
        System.out.println("Total bytes = " +fis.available());
        while ((n = fis.read()) !=-1) 
        System.out.println((char)n);
        fis.close();
    }
}
