package Minimum_Moves_to_Equal_Array_Elements_453;

public class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i=0;i<nums.length;i++)
        {
            min  = Math.min(min,nums[i]);
            sum = sum+nums[i];
        }
        return sum - min*nums.length;
    }
}
