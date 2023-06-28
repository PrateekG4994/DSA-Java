//Program to illustrate time complexity of the form O(log2 N) (Big O Notation).
import java.util.*;

public class log2N {
    public static void main(String[] args) {
        int N = 8, k = 0;
        for (int i = N / 2; i <= N; i++) {
            for (int j = 2; j <= N; j = j * 2) {
                System.out.println(k + " ");
                k = k + N / 2;
            }
        }
    }
}
/*
Output
0 
4 
8 
12 
16 
20 
24 
28 
32 
36 
40 
44 
48 
52 
56  
 */