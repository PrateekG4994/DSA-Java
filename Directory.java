/*Display names of all files and subdirectories of a directory passed as command line arguments*/
import java.io.*;
public class Directory {
    public static void main(String args[]) {
        String dirname = args[0];
        File f1 = new File(dirname);
        if(f1.isDirectory())
        {
            System.out.println("Contents of " + dirname);
            String[]  s = f1.list();
            for(String str: s)
            {
                File f = new File(dirname,str);
                if(f.isFile())
                System.out.println(str + " is a file ");
                else
                System.out.println(str + " is a directory ");
            }
        }
        else
        System.out.println("Not a Directory");
    }
}
