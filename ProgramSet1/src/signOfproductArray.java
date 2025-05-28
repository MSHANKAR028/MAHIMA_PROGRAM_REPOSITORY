import java.util.Scanner;

public class signOfproductArray {
    public int arraySigm(int[] nums) {
        long product = 1;
        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];
        }
        return (int) signFunc(product);
    }

    public int signFunc(long x) {
        if (x < 0) {
            return -1;
        }
        if (x > 0) {
            return 1;
        }
        return 0;
    }
    public int arraySign(int[] nums) {
        int negcounter = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0)
                return 0;
            if (nums[i] < 0) {
                negcounter++;
            }
        }
        if(negcounter %2 ==0)
            return 1;
        else
            return -1;
    }

    public static void main(String[] args) {
        signOfproductArray obj = new signOfproductArray();
        int result = obj.arraySigm(new int[]{-1, -2, -3, -4, 3, 2, 1});
        System.out.println(result);
    }
}