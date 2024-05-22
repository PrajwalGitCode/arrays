import java.util.*;


//========== User's Code Starts Here ==========
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int totalSum = 0;
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            int contribution = (((i + 1) * (n - i) + 1) / 2) * arr[i];
            totalSum += contribution;
        }
        
        return totalSum;
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
        int output = s.sumOddLengthSubarrays(arr);
        
        System.out.println(output);
    }
}
