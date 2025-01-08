package Fire;
import java.util.*;
public class CountingElementUpdate {
    public int countingElementUpdate(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            int count = map.getOrDefault(arr[i], 0);
            count++;
            map.put(arr[i], count);
        }
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (map.get(num) != null && map.get(num) == num + 1) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        CountingElementUpdate obj = new CountingElementUpdate();
        System.out.println(obj.countingElementUpdate(new int[]{1,2,3,4,5,6,7,8,9}));
        System.out.println(obj.countingElementUpdate(new int[]{1,2,3}));
        System.out.println(obj.countingElementUpdate(new int[]{1,1,3,3,5,5,7,7}));



    }




}
