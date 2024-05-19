//========== User's Code Starts Here ==========
import java.util.*;
public class Main
{
   
    public static void print_subarray(int arr[],int length)
    {
       /*Function to print all the subarrays given in an array
        Input arr--> array, length -->length of an array */

 for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                }
                System.out.println(); 
            }
        }
        
       
       
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
        print_subarray(arr,n);
        
    }
}
//========== User's Code Ends Here ==========

