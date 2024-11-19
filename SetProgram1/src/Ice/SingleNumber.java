package Ice;
import java.util.*;
import java.lang.*;
import java.io.*;
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int tmp=0;
        for(int i=0;i<nums.length;i++){
            tmp=tmp^nums[i];
        }
        return tmp;

    }
    public static void main(String[] args) {
        SingleNumber ob = new SingleNumber();
        System.out.println(ob.singleNumber(new int[]{1,2,3,2,1}));
        System.out.println(ob.singleNumber(new int[]{2,2,3,3,5}));
    }












}
