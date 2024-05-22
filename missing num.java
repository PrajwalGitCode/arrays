import java.util.*;


//========== User's Code Starts Here ==========
class Solution {
    public int missing_elements(int[] nums) {
        int n = nums.length + 1;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            actualSum += nums[i];
        }
        
        return expectedSum - actualSum;
    }
}

//========== User's Code Ends Here ==========


public class Main
{
   
   
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String y=sc.nextLine();
        String n =sc.nextLine();
        Solution s = new Solution();
        String s_arr[]=n.split(" ");
        int arr[]=new int[s_arr.length];
        for(int i=0;i<s_arr.length;i++)
        {
            arr[i]=Integer.parseInt(s_arr[i]);
        }
        
        int max= s.missing_elements(arr);
        
        System.out.println(max);
    }
}
