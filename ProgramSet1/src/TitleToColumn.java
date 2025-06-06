public class TitleToColumn {
    public int titleToNumber(String str) {
        int sum = 0;
        for(int i = str.length()-1, pow=0; i >= 0; i--,  pow++) {
            char ch = str.charAt(i);
            sum += (ch - 'A' + 1) * Math.pow(26, pow);
        }
        return sum;

    }
    public static void main(String[] args) {
        TitleToColumn obj = new TitleToColumn();
        System.out.println(obj.titleToNumber("aaa"));
        System.out.println(obj.titleToNumber("ZY"));
    }






    }
