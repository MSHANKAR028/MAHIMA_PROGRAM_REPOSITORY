public class LongestPalindrome {

    public  String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];

        // All substrings of length 1 are palindromes
        int len = 1;
        int start = 0;

        //mark length 1 substring
        for (int i = 0; i < n; i++)
            dp[i][i] = true;

        // mark length 2 substring
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;

                start = i;
                len = 2;
            }
        }

        // mark strings longer than length 3
        for (int k = 3; k <= n; k++) {
            for (int i = 0; i < n - k + 1; i++) {
                int j = i + k - 1;

                if (dp[i + 1][j - 1] && s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = true;

                    if (k > len) {
                        start = i;
                        len = k;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=start; i<start+len; i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    // Driver Code
    public static void main(String[] args) {
        LongestPalindrome obj = new LongestPalindrome();
        System.out.println(obj.longestPalindrome("babad"));
        System.out.println(obj.longestPalindrome("cbbd"));
    }















}
