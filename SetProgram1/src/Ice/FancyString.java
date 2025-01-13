package Ice;
import java.util.*;


public class FancyString {

    public String fancyString(String str){
       if(str==null || str.length()==0){
            return ""; // This takes care of the null, or 0
       }
        int count = 1; // Did this because if we take leeetcode as an example l is  str[0] so count = 1
       char ch = str.charAt(0);
       StringBuilder sb = new StringBuilder();
       sb.append(ch); // getting appended into StringBuilder internal array.
       for(int i=1;i<str.length();i++){
          if(ch==str.charAt(i)){
              count++;
          }
          else{
              count = 1; // Resets the counter, as the letter is not the same, e and t arent the same
              ch = str.charAt(i); // Updating the character
          }
          if(count <= 2){
              sb.append(str.charAt(i));// checks to see if the count is equal or less than 2 appends it to the array.
          }
       }

        return sb.toString();

    }
    public static void main(String[] args) {
        FancyString f = new FancyString();
        System.out.println(f.fancyString("abc"));
        System.out.println(f.fancyString("aaabcaaa"));
        System.out.println(f.fancyString("aaa"));
        System.out.println(f.fancyString("leeetcode"));
    }

















}
