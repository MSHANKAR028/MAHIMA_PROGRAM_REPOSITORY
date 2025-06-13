package IceCream;

import java.util.Arrays;
import java.util.HashMap;

public class FindMissingAndRepeatedVal {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = grid.length;
        for (int i = 0; i<n; i++) {
            for(int j=0; j<n; j++){
                int count = map.getOrDefault(grid[i][j], 0);
                count++;
                map.put(grid[i][j], count);
            }
        }
        int repeated = 0;
        int missing = 0;
        for(int i=1; i<=n*n; i++){
            Integer count = map.getOrDefault(i,0);
            if(count > 1){
                repeated =i;
            }
            if(count == 0){
                missing =i;
            }
        }
        return new int[]{repeated, missing};
    }
    public static void main(String[] args) {
        FindMissingAndRepeatedVal obj = new FindMissingAndRepeatedVal();
       int[] result = obj.findMissingAndRepeatedValues(new int[][]{{1,3},{2,2}});
        System.out.println(Arrays.toString(result));
    }





}
