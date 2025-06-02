public class FirstPalindrome {
    public String firstPalindrome(String[] words) {
       int [] counts = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            if(isPalindrome(words[i])){
                counts[i] = 1;
                return  words[i];
            }
        }
        return  "";
    }

    public boolean isPalindrome(String word) {
        boolean palidrome = true;
        for(int left =0, right = word.length() - 1; left < right; left++, right--){
            if(word.charAt(left) != word.charAt(right)){
                palidrome = false;
            }
        }
        return palidrome;
    }
    public static void main(String[] args) {
        FirstPalindrome first = new FirstPalindrome();
        System.out.println(first.firstPalindrome(new String[]{"abc","car","ada","racecar","cool"}));
        System.out.println(first.firstPalindrome(new String[]{"notapalindrome","racecar"}));
        System.out.println(first.firstPalindrome(new String[]{"def","ghi"}));
    }
}
