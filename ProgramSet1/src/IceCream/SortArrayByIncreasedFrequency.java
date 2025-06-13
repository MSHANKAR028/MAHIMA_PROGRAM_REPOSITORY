package IceCream;

import java.util.*;

public class SortArrayByIncreasedFrequency {
    class MyComparator implements Comparator<Map.Entry<Integer, Integer>> {
        public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
            if(o1.getValue()!=o2.getValue()){
                return o1.getValue()-o2.getValue();
            }
            else{
                return o2.getKey()-o1.getKey();
            }
        }
    }
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            Integer count = map.getOrDefault(nums[i], 0);
            count++;
            map.put(nums[i], count);
        }
        MyComparator comparator = new MyComparator();
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(comparator);
         for(Map.Entry<Integer, Integer> entry : map.entrySet()){
             pq.add(entry);
         }
         int[] result = new int[nums.length];
         int i=0;
         while(!pq.isEmpty()){
             Map.Entry<Integer, Integer> entry = pq.poll();
             for(int j=0; j<entry.getValue(); j++){
                 result[i] = entry.getKey();
                 i++;
             }
         }
         return result;

    }
    public static void main(String[] args) {
        SortArrayByIncreasedFrequency obj = new SortArrayByIncreasedFrequency();
        int [] numbers = new int[] {1,1,2,2,2,3};
        int[] result = obj.frequencySort(numbers);
        System.out.println(Arrays.toString(result));

    }




























}
