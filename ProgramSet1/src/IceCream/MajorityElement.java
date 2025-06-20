package IceCream;



import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int count = map.getOrDefault(nums[i], 0);
            count++;
            map.put(nums[i], count);
        }

        int max = Integer.MIN_VALUE;
        int maxKey = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxKey = entry.getKey();
            }

        }
        return maxKey;
    }
    public static void main(String[] args) {
        MajorityElement majority = new MajorityElement();
        System.out.println(majority.majorityElement(new int[]{3,2,3}));
        System.out.println(majority.majorityElement(new int[]{3,2,3,1}));
        System.out.println(majority.majorityElement(new int[]{3,2,3,1,2,1,2}));
    }

    /*
    What I did in this program:
    In this program the task was the return the majority element in the array. The first step that I did was that
   Key and the Value pair into the Hashmap(), as the keys held the integer of the numbers the values held the count
   of the keys. Then I iterated over the map in order to find the maximum element that was needed. To do that I checked
   using an if condition whether the max was less than the getValue(), and if it was I set the value to max. Similarly, I
   needed to return the matching key. So I created a variable called maxKey and set it to default value in my case I set
   it to -1. So when I had found my max value, I also set my key value to the matching key to the value that had the maximum.
   Therefore, I returned the maxKey
     */
}