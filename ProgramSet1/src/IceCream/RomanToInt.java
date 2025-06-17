package IceCream;

import java.util.HashMap;

public class RomanToInt {
    public int getValue(char roman){
        switch (roman){
            case 'I':
            return 1;
          case  'V':
             return 5;
          case 'X':
             return 10;
          case 'L':
              return 50;
          case 'C':
              return 100;
          case 'D':
              return 500;
          case 'M':
              return 1000;
           default:
                  return 0;
        }

    }


    public int romanToInt(String str) {
        int sum = 0;
        char prev = ' ';
        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            int val =  getValue(ch);

            if((prev == 'V'|| prev=='X')&& ch =='I'){
                sum-=val;
            }else if((prev == 'L'|| prev=='C') && ch =='X'){
                sum-=val;
            }else if((prev == 'D'|| prev=='M') && ch =='C'){
                sum-=val;
            }
            else
                sum+=val;


            prev = ch;

        }
        return sum;

    }
    public static void main(String[] args) {
        RomanToInt romanToInt = new RomanToInt();
        System.out.println(romanToInt.romanToInt("LVIII"));
        System.out.println(romanToInt.romanToInt("MCMXCIV"));
    }

/*
What you did on this program:
Gist:
First things first you created a switch statement in order to store the values of I, X, C, D, M and stored the
values.You went through the loop and got each character, and when you got each character.  You started
the loop at the opposite direction in order to not get into the array-out-of bound issue. Because if you were
 to use it then you should have done another way to check to see if it doesn't go into array outOfBound  go into an array out of bound.
    Now outside the loop you created a sum, and the previous:
    Inside the loop you got the value from calling your getValue function and then stored it into val.
    Then you compared your previous to the ch and if a character is either an or an X or a C and if that was the case:
    then you subtracted val. If it is not then you do default, and you add the sum. You set the previous to the ch.
    Finally, you returned the sum.
 */






}
