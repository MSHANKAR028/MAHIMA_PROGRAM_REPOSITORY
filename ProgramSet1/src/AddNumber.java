public class AddNumber {

   public static int addDigitsOnce(int number) {
       int sum = 0;

       while (number != 0) {
           sum += number % 10;
           number=number/10;
       }
       return sum;
   }
    public static int addDigits(int number) {
       while(number > 10){
           number=addDigitsOnce(number);
       }
       return number;
    }


       public static void main(String[] args) {
       int value = 38;
       int value2 =0;
       System.out.println(addDigits(value));
       System.out.println(addDigits(value2));

   }


















}
