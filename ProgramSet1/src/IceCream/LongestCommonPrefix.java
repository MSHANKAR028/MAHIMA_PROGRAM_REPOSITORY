package IceCream;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] words) {
        String first = words[0];
        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);
            boolean isAllMatch = true;

            for (int j = 1; j < words.length; j++) {
                if(words[j].length()<=i){
                    isAllMatch = false;
                    break;
                }
                if (words[j].charAt(i) != ch) {
                    isAllMatch = false;
                    break;
                }
            }

            if (!isAllMatch) {
                break;
            }

            prefix.append(ch);
        }

        return prefix.toString();
    }
    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        System.out.println(lcp.longestCommonPrefix(new String[]{"flower","flow","flight", "f"}));
        System.out.println(lcp.longestCommonPrefix(new String[]{"dog","racecar","car"}));

    }







}
