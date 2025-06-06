import java.util.HashMap;

public class SolutionOfProbem1 {
    public int firstUniqChar(String str) {
        HashMap<Character, Integer> count = new HashMap<>();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            Integer val = count.getOrDefault(ch, 0);
            val++;
            count.put(ch, val);
        }
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            Integer val = count.getOrDefault(ch, 0);
            if(val == 1) {
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        SolutionOfProbem1 sol = new SolutionOfProbem1();
        System.out.println(sol.firstUniqChar("leetcode"));
        System.out.println(sol.firstUniqChar("loveleetcode"));
        System.out.println(sol.firstUniqChar("aabb"));
    }



}
