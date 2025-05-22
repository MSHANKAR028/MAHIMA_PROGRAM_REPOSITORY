public class SumOfMultiples {
    public int sumOfMultiples(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0||i % 5 == 0||i % 7 == 0) {
                sum += i;
            }
        }
        return sum;

    }
    public static void main(String[] args) {
        SumOfMultiples s = new SumOfMultiples();
        System.out.println(s.sumOfMultiples(7));
        System.out.println(s.sumOfMultiples(10));
        System.out.println(s.sumOfMultiples(15));
    }










}
