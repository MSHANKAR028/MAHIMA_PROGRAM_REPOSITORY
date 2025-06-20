package IceCream;

import java.util.Arrays;

public class DiffuseBomb {
    public int[] decrypt(int[] code, int k) {
        int [] result  = new int[code.length];
        int n = code.length;
        for (int i = 0; i < code.length; i++) {
            if(k==0){
                result[i] = 0;
            }
            else if(k>0){
                for(int j=1;j<=k;j++){
                    result[i]+=code[(i+j) % n];
                }
            }
            else{
                for(int j=k;j<0;j++){
                    result[i]+=code[(i+j+n) % n];
                }
            }
        }
        return result;

    }
    public static void main(String[] args) {
        DiffuseBomb d = new DiffuseBomb();
        int[] code = d.decrypt(new int[]{5,7,1,4}, 3);
        int [] code1 = d.decrypt(new int[] {1,2,3,4}, 0);
        int  [] code2 = d.decrypt(new int[] {2,4,9,3}, -2);
        System.out.println(Arrays.toString(code));
        System.out.println(Arrays.toString(code1));
        System.out.println(Arrays.toString(code2));


    }

}
