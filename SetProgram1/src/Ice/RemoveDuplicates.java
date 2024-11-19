package Ice;
import java.util.*;
import java.lang.*;


public class RemoveDuplicates {
   public int[] removeDuplicates(int[] nums){
       Set<Integer> hashSet = new HashSet<>();
       for(int i=0;i<nums.length;i++){
           hashSet.add(nums[i]);
       }
       return hashSet.stream()
               .mapToInt(Integer::intValue)
               .toArray();
       // if you want this


       //int[] result = new int[hashSet.size()];
       //int i=0;
       //for (int val: hashSet) {
          // result[i++] = val;
      // }


   }
   public static void main(String[] args) {
       RemoveDuplicates r = new RemoveDuplicates();
       System.out.println(Arrays.toString(r.removeDuplicates(new int[]{1,1,2})));
       System.out.println(Arrays.toString(r.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4})));
   }


















}
