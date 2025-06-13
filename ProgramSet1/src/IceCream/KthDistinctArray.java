package IceCream;

import java.util.HashMap;

public class KthDistinctArray {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int count = map.getOrDefault(arr[i],0);
            count++;
            map.put(arr[i],count);
        }
        int counter = 0;
        for(int i=0;i<arr.length;i++){
            int value = map.getOrDefault(arr[i],0);
            if(value == 1){
                counter++;
            }
            if(counter == k){
                return arr[i];
            }
        }
        return "";
    }
    public static void main(String[] args) {
        KthDistinctArray obj = new KthDistinctArray();
        String [] arr = {"d","b","c","b","c","a"};
        System.out.println(obj.kthDistinct(arr,2));
    }







}
