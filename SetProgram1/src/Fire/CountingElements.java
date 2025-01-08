package Fire;
import java.util.*;

public class CountingElements {

    public int counting(int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            int num = arr[i];
            if(IsThere(arr, num+1)){
                count++;
            }
        }
        return count;
    }

    boolean IsThere(int[] arr, int num) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                found = true;
                break;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        CountingElements obj = new CountingElements();
        System.out.println(obj.counting(new int[]{1,2,3,4}));
        System.out.println(obj.counting(new int[]{1,2,3}));
        System.out.println(obj.counting(new int[]{1,3,2,3,5,0}));



    }
}