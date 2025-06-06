public class UglyNumber {
    boolean isUgly(int num) {
        if (num <= 0)
            return false;

        while ( num > 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else if (num % 3 == 0) {
                num /= 3;
            } else if (num % 5 == 0) {
                num /= 5;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        UglyNumber uglyNumber = new UglyNumber();
        System.out.println(uglyNumber.isUgly(1));
        System.out.println(uglyNumber.isUgly(6));
        System.out.println(uglyNumber.isUgly(14));
        System.out.println(uglyNumber.isUgly(8));

    }







}
