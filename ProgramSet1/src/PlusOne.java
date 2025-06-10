import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int sum=0;
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = digits.length-1; i>=0; i--){
            sum=carry+digits[i];
            list.add(sum%10);
            carry=sum/10;

        }
        if(carry>0){
            list.add(carry);
        }
        int[] res = new int[list.size()];


        for(int i=list.size()-1;i>=0;i--){
            res[list.size()-i-1] = list.get(i);
        }
        return res;

    }
    public static void main(String[] args) {
        PlusOne p = new PlusOne();
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        int [] result = p.plusOne(digits);
        System.out.println(Arrays.toString(digits));

        System.out.println(Arrays.toString(result));
    }
    }


