public class MaximumWealth {

    public static int maximumWealth(int[][] accounts) {
        //int[] sums = new int[accounts.length];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }
            max = Math.max(sum, max);
        }

        return max;
    }
    public static void main(String[] args) {
        MaximumWealth maximumWealth = new MaximumWealth();
        System.out.println(maximumWealth.maximumWealth(new int[][]{{1,2,3},{3,2,1}}));

    }
}
