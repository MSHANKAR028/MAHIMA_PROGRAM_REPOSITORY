import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != i) {
        return i;
        }
    }
    return nums.length;
    }
    public static void main(String[] args) {
        MissingNumber missing = new MissingNumber();
        System.out.println(missing.missingNumber(new int[]{1,2,4}));
        System.out.println(missing.missingNumber(new int[]{3,0,1}));
    }






}
