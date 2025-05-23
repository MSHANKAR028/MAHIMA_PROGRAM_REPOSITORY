import java.util.Scanner;

public class CheckNisDoubleExist {
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == 2 * arr[j]) {
                    return true;
                }
            }

        }
        return false;
    }
    public static void main(String[] args) {
        CheckNisDoubleExist ch = new CheckNisDoubleExist();
        System.out.println(ch.checkIfExist(new int[]{10,2,5,3}));
        System.out.println(ch.checkIfExist(new int[]{3,1,7,11}));
        System.out.println(ch.checkIfExist(new int[]{7,1,14,11}));
    }






}
