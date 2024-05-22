//========== User's Code Starts Here ==========
import java.util.*;
public class Main
{
   
    public static int find_maximum_subarray(int arr[],int length)
    {
       /*write the code to find the maximum subarray sum
        Both array and size of array is given */
        int maxSum = arr[0]; 
        int currentSum = arr[0];

            for (int i = 1; i < length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;   
        /* Do not change the code beyond this point*/
    }
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max= find_maximum_subarray(arr,n);
        System.out.println(max);
    }
}
//========== User's Code Ends Here ==========

