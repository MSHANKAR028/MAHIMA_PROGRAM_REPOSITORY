package IceCream;

import java.util.Arrays;

public class MaximumDifferenceIncreasingElements {
    public int maximumDifference(int[] nums) {
        int max = -1;
        int difference = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] < nums[j]){
                    difference = nums[j] - nums[i];
                    max = Math.max(difference, max);
                }
            }
        }
        return max;

    }
    public static void main(String[] args) {
        MaximumDifferenceIncreasingElements m = new MaximumDifferenceIncreasingElements();
        System.out.println(m.maximumDifference(new int[]{7,1,5,4}));
        System.out.println(m.maximumDifference(new int[]{9,4,3,2}));

    }
}
