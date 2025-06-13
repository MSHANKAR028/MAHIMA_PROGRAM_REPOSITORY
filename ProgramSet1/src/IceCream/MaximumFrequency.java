package IceCream;

import java.util.HashMap;

public class MaximumFrequency {
    public int maxDifference(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = map.getOrDefault(ch, 0);
            count++;
            map.put(ch, count);
        }
        int even = Integer.MAX_VALUE;
        int odd = Integer.MIN_VALUE;
        for(Integer val:map.values()){
            if(val % 2 == 0){
                even = Math.min(even, val);
            }
            else{
                odd=Math.max(odd,val);
            }
        }
        return (odd-even);

    }
    public static void main(String[] args) {
        MaximumFrequency obj = new MaximumFrequency();
        System.out.println(obj.maxDifference("aaaaabbc"));
    }

}
