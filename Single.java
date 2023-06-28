//Java program to illustrate time complexity for single for-loop (Big O Notation)
public class Single {
   public static void main(String[] args) {
    int a = 0, b = 0;
    int N = 4, M = 4;
    //this loop  for N time
    for(int i=0;i<N;i++)
    {
        a=a+10;
    }
    //this loop for M time
    for(int i=0;i<M;i++)
    {
        b=b+40;
    }
    System.out.println(a+" "+b);
   }
}

/*
Output
40 160
*/
