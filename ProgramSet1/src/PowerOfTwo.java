public class PowerOfTwo {
    public static boolean powerOfTwo(int n) {
        int low=0;
        int high=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(Math.pow(2,mid)==n){
                return true;
            }
            else if(Math.pow(2,mid)<n){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        System.out.println(powerOfTwo(1));
        System.out.println(powerOfTwo(16));
        System.out.println(powerOfTwo(2));
        System.out.println(powerOfTwo(3));
        System.out.println(powerOfTwo(8));

    }
}
