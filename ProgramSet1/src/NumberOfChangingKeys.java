public class NumberOfChangingKeys {
    public int countKeyChanges(String str) {
        int count = 0;
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            char prev= str.charAt(i-1);
            if(Character.toLowerCase(ch)!=Character.toLowerCase(prev)){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        NumberOfChangingKeys ob = new NumberOfChangingKeys();
        System.out.println(ob.countKeyChanges(new String("abc")));
        System.out.println(ob.countKeyChanges(new String("aAbBcC")));
    }
}
