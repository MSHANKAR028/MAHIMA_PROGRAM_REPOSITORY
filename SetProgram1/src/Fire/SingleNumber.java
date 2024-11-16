package Fire;
import java.util.*;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int count=map.getOrDefault(nums[i], 0);
            count++;
            map.put(nums[i], count);
        }
            


        return 0;
    }






















}
