/*a program for implementing interfaces */
import java.io.*;
interface StackInterface
{
    int size = 100;
    void push(int num);
    int pop(); 
    boolean isEmpty();
    boolean isFull();
}
class IntStack implements StackInterface
{
    int top;
    int [] data = new int[StackInterface.size];
    {
        top = -1;
    }
    public void push(int num)
    {
        data [++top]=num;
    }
    public int pop()
    {
        return data[top--];
    }
    public boolean isEmpty()
    {
        return top == -1;
    }
    public boolean isFull()
    {
        return top == StackInterface.size -1;
    }
}
public class InterfaceDemo {
    public static void main(String[] args) throws IOException {
        {
            StackInterface s = new IntStack();
            BufferedReader br;
            br =new BufferedReader(new InputStreamReader(System.in));
            int choice;
            do
            {
                System.out.println("1: PUSH\n2: POP\n3: Exit");
                System.out.println("Enter Your Choice");
                choice = Integer.parseInt(br.readLine());
                switch(choice)
                {
                    case 1: if(s.isFull())
                        System.out.println("Stack Overflow");
                    else
                    {
                        System.out.println("Enter the Element");
                        int num = Integer.parseInt(br.readLine());
                        s.push(num);
                    }
                    break;
                    case 2: if(s.isEmpty())
                        System.out.println("Stack underflow");
                    else
                        System.out.println("Popped value ="+s.pop());
                    break;
                }
            }while(choice != 3);
        }
    }
}
