//Java Program for Theta (Θ) Notation Approach.
import java.lang.*;
import java.util.*;
public class Theta {
    // Function to find whether a key exists in an array or not using linear search
    static boolean linerSearch(int a[], int n, int key)
    {
        for(int i=0;i<n;i++)
        {
            if(a[i]==key)
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,10,40};
        int x=10;
        int n =arr.length;
        if (linerSearch(arr, n, x))
        System.out.println("Element is present in array");
        else
        System.out.println("Element is not present in array");
    }
}
/*
Output
Element is present in array
 */