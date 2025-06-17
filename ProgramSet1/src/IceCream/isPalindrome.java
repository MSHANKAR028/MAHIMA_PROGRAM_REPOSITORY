package IceCream;

public class isPalindrome {
    boolean checkifPalidrome(int nums){
        int reversed = 0;
        int tmp = nums;
        while (tmp > 0){
            int remain = tmp % 10;
            tmp /= 10;
            reversed = reversed * 10 + remain;
        }
        return nums == reversed;
    }

    public static void main(String[] args) {
        isPalindrome p = new isPalindrome();
        System.out.println(p.checkifPalidrome(101));
        System.out.println(p.checkifPalidrome(-121));
        System.out.println(p.checkifPalidrome(121));
    }
}
