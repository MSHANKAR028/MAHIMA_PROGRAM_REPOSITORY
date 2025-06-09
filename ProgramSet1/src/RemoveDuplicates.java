import java.util.Arrays;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        for(int i=1;i<nums.length;i++){
            int current=nums[i];
            int previous=nums[i-1];
            if(current!=previous){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        RemoveDuplicates remove = new RemoveDuplicates();
        System.out.println(remove.removeDuplicates(new int[]{1,1,2}));
        System.out.println(remove.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }








}
