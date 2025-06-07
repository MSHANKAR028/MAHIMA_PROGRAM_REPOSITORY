public class DivideByDigits {

    public static int divideByDigits(int number) {
        int count = 0;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            temp = temp / 10;
            if (digit != 0 && number % digit == 0)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(divideByDigits(1248));

    }

}












