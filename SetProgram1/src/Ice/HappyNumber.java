package Ice;
import java.util.*;
public class HappyNumber {

    public boolean isHappy(int n) {
        Set<Integer> hash = new HashSet<>();
        while(true){
            int sum = getSquaredSum(n);
            if(sum==1)
                return true;
            boolean res = hash.add(sum);
            if(!res)
                return false;
            n=sum;
        }
    }

    public int getSquaredSum(int n) {
        if(n<=0){
            return 0;
        }
        int reminder = n%10;
        int quotient = n/10;

        return reminder*reminder + getSquaredSum(quotient );
    }

    public static void main(String[] args) {
        HappyNumber happy = new HappyNumber();
        System.out.println(happy.isHappy(2));
        System.out.println(happy.isHappy(9));
        System.out.println(happy.isHappy(10));
        System.out.println(happy.isHappy(19));
        System.out.println(happy.isHappy(20));
    }































}
