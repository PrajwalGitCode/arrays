//========== User's Code Starts Here ==========
import java.util.*;
public class Main
{
   
    public static int[] store_array(int n)
    {
        /*Function to store the number from 1 to n 
        Note - After storing return the array (Create an array of size n)*/
     int[] arr = new int[n];
     for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

return arr;

        /* Dont change anything below. If changed click on reset. */
        
    
    }
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        
        int[] output = store_array(n);
        for(int i=0;i<n;i++)
            System.out.println(output[i]);
    }
}
//========== User's Code Ends Here ==========

