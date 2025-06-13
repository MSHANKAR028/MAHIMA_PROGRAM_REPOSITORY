package IceCream;

import java.util.Arrays;

public class FinalArrayState {

    public int getMinIndex(int [] arr){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
         min = Math.min(min,arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==min){
                return i;
            }
            }
         return -1;
        }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i=0; i<k; i++){
          int index = getMinIndex(nums);
          nums[index]*=multiplier;
    }
        return nums;

    }
    public static void main(String[] args) {
        FinalArrayState state = new FinalArrayState();
        int [] result = {2,1,3,5,6};
        int k = 5;
        int multiplier = 2;
        int [] res = state.getFinalState(result,k,multiplier);
        System.out.println(Arrays.toString(res));
    }










}
