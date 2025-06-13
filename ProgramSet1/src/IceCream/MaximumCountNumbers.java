package IceCream;

public class MaximumCountNumbers {
    public int maximumCount(int[] nums) {
        int neg = 0;
        int pos = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                neg++;
            }
            else if(nums[i] > 0){
                pos++;
            }

        }
        return Math.max(neg, pos);

    }
    public static void main(String[] args) {
        MaximumCountNumbers obj = new MaximumCountNumbers();
        System.out.println(obj.maximumCount(new int[]{1,2,3,4,5}));
        System.out.println(obj.maximumCount(new int[]{-2,-1,-1,1,2,3}));
        System.out.println(obj.maximumCount(new int[]{-3,-2,-1,0,0,1,2}));
        System.out.println(obj.maximumCount(new int[]{5,20,66,1314}));
    }











}
