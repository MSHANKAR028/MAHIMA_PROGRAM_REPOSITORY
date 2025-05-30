import java.util.HashMap;

public class divideTheArray {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> map = new  HashMap<>();
        int count = 0;
        for(int i=0;i<nums.length;i++){
            count=map.getOrDefault(nums[i],0);
            count++;
            map.put(nums[i],count);
        }
        for(int key:map.keySet()){
            if(map.get(key) %2 != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        divideTheArray d = new divideTheArray();
        System.out.println(d.divideArray(new int[]{3,2,3,2,2,2}));
        System.out.println(d.divideArray(new int[]{1,2,3,4}));
    }

}
