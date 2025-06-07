public class isPowerOf2 {

    public static boolean isPowerOf2(int n) {
        for (int i = 0; i <= n; i++) {
            if (Math.pow(2, i) == n)
                return true;
        }
        return false;
    }
    public static boolean binarySearch(int n) {
    int low = 1;
    int high = n;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if(mid==n){
            return true;
        }
        else if(mid<n){
            high = mid - 1;
        }
        else{
            low = mid + 1;
        }
    }
    return false;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(1));
        System.out.println(binarySearch(16));
    }


}
