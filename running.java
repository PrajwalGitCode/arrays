import java.util.*;


//========== User's Code Starts Here ==========

class Solution {
    public int[] runningSum(int[] nums) {
        //Dont print anything only return the Output.
         int n = nums.length;

        // Calculate the running sum in place
        for (int i = 1; i < n; i++) {
            nums[i] += nums[i - 1];
        }

        return nums;
    }
}

//========== User's Code Ends Here ==========



public class Main
{
   
    
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        Solution s = new Solution();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] output = s.runningSum(arr);
        for(int i=0;i<n;i++)
            System.out.print(output[i]+" ");
        System.out.println();
    }
}
