import java.util.ArrayList;
import java.util.List;

public class TheLargestGoodInteger {
    public String largestGoodInteger(String num) {
        List<String> string = new ArrayList<String>();
        String str = "";

        for (int i = 0; i < num.length(); i++) {
            if (!str.isEmpty()&& str.charAt(0) == num.charAt(i)) {
                str += num.charAt(i);
            } else {
                str = "" + num.charAt(i);
            }

            if (str.length() == 3) {
                string.add(str);
            }


        }
        if(string.isEmpty()){
            return "";
        }
        String Largest = string.get(0);
        for(String s:string){
            if(s.compareTo(Largest)>0){
                Largest = s;
            }
        }
        return Largest;

    }
    public static void main(String[] args) {
        TheLargestGoodInteger obj = new TheLargestGoodInteger();
        System.out.println(obj.largestGoodInteger("6777133339"));
        System.out.println(obj.largestGoodInteger("2300019"));
        System.out.println(obj.largestGoodInteger("42352338"));
    }
}