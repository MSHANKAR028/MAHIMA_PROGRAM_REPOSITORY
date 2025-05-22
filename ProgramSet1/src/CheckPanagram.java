public class CheckPanagram {
    public boolean checkPanagram(String sentence) {
        int[] counts = new int[26];

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            // this checks to see if it is only a character
            if (Character.isLetter(ch)) { // This checks to see if it is only  letters
                int index = Character.toLowerCase(ch) - 'a';
                counts[index]++;
            }
        }

        // This checks to see of the index has a 1 or 0
        // so incase its not 0
        for (int i = 0; i < 26; i++) {
            if (counts[i] == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CheckPanagram cp = new CheckPanagram();
        System.out.println(cp.checkPanagram("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(cp.checkPanagram("leetcode"));
        System.out.println(cp.checkPanagram("pwwkew"));

    }
}
