package Ice;

public class ExistsANumberHigher {

    public boolean exists(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ExistsANumberHigher ob = new ExistsANumberHigher();
        System.out.println(ob.exists(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 5));
        System.out.println(ob.exists(new int[]{1, 2, 3, 4, 5}, 5));
        System.out.println(ob.exists(new int[]{1, 2, 3, 4, 5}, 6));
        System.out.println(ob.exists(new int[]{1, 2, 3, 4, 5}, 7));
        System.out.println(ob.exists(new int[]{4, 3, 3, 3, 2, 2, 2}, 4));

    }
}






