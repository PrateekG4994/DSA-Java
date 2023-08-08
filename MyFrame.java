/*a program on Simple Java Frame */
import javax.swing.*;
public class MyFrame {
    JFrame f;
    MyFrame()
    {
        f = new JFrame("Welcome Frame");
        f.setSize(200, 100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new MyFrame();
    }
    
}
