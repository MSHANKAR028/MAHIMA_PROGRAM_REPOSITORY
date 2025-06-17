package IceCream;

public class FindIndexOfFirstOccurence {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length()-needle.length(); i++) {
            boolean IsAll = true;
            for(int j=0; j<needle.length();j++){
                if(haystack.charAt(i+j) != needle.charAt(j)){
                    IsAll = false;
                    break;
                }
            }
            if(IsAll){
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        FindIndexOfFirstOccurence f = new FindIndexOfFirstOccurence();
        System.out.println(f.strStr("sadbutsad", "sad"));
        System.out.println(f.strStr("leetcode", "leeto"));
    }
}
/*
 What you did in this program:
 In this program you created a for loop in order to iterate through haystack, but you had to make sure that you
 don't reach the array-out-of-bound, so we made sure that haystack.length() - needle.length(). So in the begininng
 you assumed that the IsAll, is equal to true. So we go through the second when checking whether the character isn't the same as the needles
 character, then we set the IsAll function to false, and break from the loop. (inner loop) So in the outter loop, we check if it is true, and if
 yes, then we return the i, else we return -1 indicating that there wasn't a match.

 */
