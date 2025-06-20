package IceCream;

import java.util.HashMap;

public class ContainDuplicates {
    public boolean containsDuplicate(int[] nums) {
        boolean containsDuplicate = false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int count = map.getOrDefault(nums[i], 0);
            count++;
            map.put(nums[i], count);
        }
        for(Integer count  : map.values()){
            //int count = map.getOrDefault(values, 0);
            if(count > 1){
                containsDuplicate = true;
                break;
            }
        }
        return containsDuplicate;

    }
    public static void main(String[] args) {
        ContainDuplicates obj = new ContainDuplicates();
        System.out.println(obj.containsDuplicate(new int[]{3,2,3,1}));
        System.out.println(obj.containsDuplicate(new int[]{3,2,3,1,2,1,2}));
        System.out.println(obj.containsDuplicate(new int[]{1,2,3,4}));
    }
}
