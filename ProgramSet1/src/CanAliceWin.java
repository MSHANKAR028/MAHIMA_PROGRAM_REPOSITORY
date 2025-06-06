import java.util.Scanner;

public class CanAliceWin {
    public static  boolean canAliceWin(int[] nums) {
       int single=0;
       int doubleDigit=0;
       for(int i=0;i<nums.length;i++){
           if(nums[i]>=0 && nums[i]<10){
               single+=nums[i];
           }
           else if(nums[i]>=10 && nums[i]<100){
               doubleDigit+=nums[i];
           }
       }
       return single!=doubleDigit;

    }
    public static void main(String[] args) {
        CanAliceWin win = new CanAliceWin();
        System.out.println(win.canAliceWin(new int[]{1,2,3,4}));
        System.out.println(win.canAliceWin(new int[]{1,2,3,4,10}));
    }










}
