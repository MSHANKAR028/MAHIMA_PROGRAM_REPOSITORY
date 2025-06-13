package IceCream;

import java.util.Arrays;

public class MergingAndSorting {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0, j=0; int k=0;
        int [] result = new int[m+n];
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                result[k]=nums1[i];
                k++;
                i++;
            }
            else{
                result[k]=nums2[j];
                j++;
                k++;
            }
        }
        if( j >= n){
            while(i<m){
                result[k]=nums1[i];
                k++;
                i++;
            }
        }
        if( i >= m){
            for(;j<n;k++,j++){
                result[k]=nums2[j];
            }
        }
        for(int t=0; t<result.length; t++){
            nums1[t]=result[t];
        }

    }
    public static void main(String[] args) {
        MergingAndSorting obj = new MergingAndSorting();
        int [] num1 = new int[]{1,2,3,0,0,0};
        int [] num2 = new int[]{2,5,6};
        obj.merge(num1, 3, num2, 3);
        System.out.println(Arrays.toString(num1));

    }























}
