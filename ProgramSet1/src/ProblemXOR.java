public class ProblemXOR {
    public static int xorOperation(int num, int start) {
        int[] nums = new int[num];
        int XOR = 0;

        for (int i = 0; i < num; i++) {
            nums[i] = start + 2 * i;
        }

        for (int i = 0; i < num; i++) {
            XOR = XOR ^ nums[i];
        }

        return XOR;
    }

    public static void main(String[] args) {
        // Test cases
        int result1 = xorOperation(5, 0);
        int result2 = xorOperation(4, 3);
        int result3 = xorOperation(5, 4);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}
