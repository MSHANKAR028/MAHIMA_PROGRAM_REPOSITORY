package Fire;
import java.util.*;
public class SearchInsertPostion {

    public int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int middle = (left+right)/2;
            if(nums[middle]==target){
                return middle;
            }
            else if(nums[middle]>target){
                right = middle-1;
            }
            else{
                left = middle+1;
            }
        }

        return left;

    }

    int binarySearch(int[] nums, int left, int right, int target){
        if (left > right)
            return left;

        int mid = (left + right)/2;
        if(nums[mid]==target)
            return mid;
        else if (nums[mid]>target)
            return binarySearch(nums, left, mid - 1, target);
        else
            return binarySearch(nums, mid + 1, right, target);
    }

    public static void main(String[] args) {
        SearchInsertPostion obj = new SearchInsertPostion();
        int arr[]={4, 5, 6, 7, 9, 12, 16};
        System.out.println(obj.searchInsert(arr, 16));
        System.out.println(obj.searchInsert(arr, 8));
    }
























}
