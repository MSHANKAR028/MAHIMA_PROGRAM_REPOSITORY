import java.util.Arrays;

public class RunningSum {
    public static int[] runningSum(int[] arr){
        int sum = 0;
        int [] result = new int [arr.length];
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            result[i]=sum;
        }
        return result;
    }
    public static void main(String [] args){
        RunningSum running = new RunningSum();
        System.out.println(Arrays.toString(runningSum(new int[]{1, 2, 3, 4})));
    }








}
