import java.util.ArrayList;
import java.util.Arrays;

public class NumberGame {
    public static int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList();
        for(int i=0; i<nums.length; i+=2){
            list.add(nums[i+1]);
            list.add(nums[i]);
        }
        int[] result = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        NumberGame number= new NumberGame();
        System.out.println(Arrays.toString(numberGame(new int[]{5,4,2,3})));
    }
}
