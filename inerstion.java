//========== User's Code Starts Here ==========
import java.util.*;
public class Main
{
   
    public static int[] sort_array(int arr[],int length)
    {
        /*Function to sort the array in ascending order
        After sorting return the sorted array */


for (int i = 1; i < length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        return arr;
    }

        /* Dont change anything below. If changed click on reset. */
        
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] output = sort_array(arr, n);
        for(int i=0;i<n;i++)
            System.out.println(output[i]);
    }
}
//========== User's Code Ends Here ==========

