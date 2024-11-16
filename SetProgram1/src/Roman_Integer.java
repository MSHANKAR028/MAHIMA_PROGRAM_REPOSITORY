import java.util.Scanner;

public class Roman_Integer {

    public static int romanToInt(String s){
        int num=0;
        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            switch(ch){
                case 'I':
                    num=1;
                    break;
                case 'V':
                    num=5;
                    break;
                case 'X':
                    num=10;
                    break;
                case 'L':
                    num=50;
                    break;
                case 'C':
                    num=100;
                    break;
                case 'D':
                    num=500;
                    break;
                case 'M':
                    num=1000;
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
            sum=sum+num;
        }


       return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        System.out.println(romanToInt(s));
    }













}
