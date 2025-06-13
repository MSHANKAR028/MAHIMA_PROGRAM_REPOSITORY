package IceCream;

import java.util.Arrays;
import java.util.HashMap;

public class CommonNumbers {
    public int getCommon(int[] nums1, int[] nums2) {
        int i=0; int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                return nums1[i];
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return -1;

    }
    public int getCommon2(int[] nums1, int[] nums2){
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i]==nums2[j]){
                    return nums1[i];
                }
            }
        }
        return -1;
    }
    public int getCommon3(int[] nums1, int[] nums2){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums1.length; i++){
            int count = map.getOrDefault(nums1[i], 0);
            count++;
            map.put(nums1[i], count);
        }
        for(int i=0; i<nums2.length; i++){
            int count = map.getOrDefault(nums2[i], 0);
            if(count>0){
                return nums2[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        CommonNumbers commonNumbers = new CommonNumbers();
        int [] num1 = new int[]{1,2,3};
        int [] num2 = new int[]{2,4};
        int result = commonNumbers.getCommon(num1, num2);
        int result1= commonNumbers.getCommon2(num1, num2);
        int result2= commonNumbers.getCommon3(num1, num2);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }



}
