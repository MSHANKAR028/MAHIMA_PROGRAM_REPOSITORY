import java.util.Scanner;

public class ScoreString {
    public  static int scoreOfString(String str) {
    int sum=0;
    for(int i=0;i<str.length()-1;i++){
        char ch = str.charAt(i);
        char ch2=str.charAt(i+1);
        int chVal=(int)ch;
        int chVal2=(int)ch2;
        sum=sum+Math.abs(chVal-chVal2);
    }
    return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        System.out.println(scoreOfString(str));



    }
}
