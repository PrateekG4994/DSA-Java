//java program to illustrate time complexity for nested (Big O Notation)
import java.io.*;
public class Nested {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        int N=4;
        int M=5;

        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                a=a+j;
                System.out.println(a+" ");
            }
            System.out.println();
        }
    }
}

/*
Output 
1 
3 
6 
10 

10 
11 
13 
16 
20 

20 
21 
23 
26 
30 

30 
31 
33 
36 
40
 */