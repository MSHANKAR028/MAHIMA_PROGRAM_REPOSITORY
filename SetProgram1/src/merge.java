import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Time: O(n log n), Space: O(N)
public class merge {

    public static int compare(int[] arr1, int[] arr2) {
        return arr1[0] - arr2[0];
    }

    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][];

        Arrays.sort(intervals, merge::compare);
        List<int[]> result = new ArrayList<>();
        int[] temp = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if (temp[1] >= intervals[i][0]) {
                temp[1] = Math.max(temp[1], intervals[i][1]);
            } else {
                result.add(temp);
                temp = intervals[i];

            }
        }
        result.add(temp);

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        merge mer = new merge();
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] result = mer.merge(intervals);
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
