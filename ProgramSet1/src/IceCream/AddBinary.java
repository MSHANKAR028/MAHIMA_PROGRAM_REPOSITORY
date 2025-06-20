package IceCream;

import java.math.BigInteger;

public class AddBinary {
    String addBinary(String num1, String num2) {
        BigInteger deciNum1 = new BigInteger(num1, 2);
        BigInteger deciNum2 = new BigInteger(num2, 2);
        BigInteger sum = deciNum1.add(deciNum2);
        String answer = sum.toString(2);
        return answer;
    }
    public static void main(String[] args) {
        AddBinary addBinary = new AddBinary();
        System.out.println(addBinary.addBinary("11", "1"));
    }

    /* What you did in this program:
    In this program you were given a binary string and was told to add them:
    The step you did first your first approach was using a normal integer in order to
    add the sums together and turn it back into binary using the Integer.parseInt(num1(which held the binary), 2)
    and added the decimals and used the Integer.toBinaryToString. But we ran into an overbound issue. So we used the
    class BigInteger, which allowed the same things, being able to create our string into integer decomal, in the class of
    BigInteger, we used the add function given by BigInteger() to add the decinal values. In order to change it back to binary
     there is a method called toString (string, radix) which allows the integer numerical value to be turned into binary.
       */




}
