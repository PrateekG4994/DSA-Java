//Java program for Omega (Ω) notation approach
import java.util.*;
import java.lang.*;
public class omega {
    static void print(int a[], int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if( i != j)
                System.out.println(a[i]+" "+a[j]);
            }
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,3};
        int n=a.length;
        print(a, n);
    }
}

/*
Output
1 2
1 3
2 1
2 3
3 1
3 2
 */