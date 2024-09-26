import java.util.Scanner;

public class Maximum_SubArray {
    public static int  maxSubArray( int[] nums,int target) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i; j<nums.length;j++){
                sum+=nums[j];
                if(sum>=target){
                   int length=j-i+1;
                   max=Math.max(max,length);
                    break;
                }
            }
        }
        return max==Integer.MIN_VALUE?-1:max;
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

         System.out.println("enter the target");
         int target = sc.nextInt();
         System.out.println(maxSubArray(nums, target));
     }

}
