public class RemoveElement {
    public int removeElement(int[] arr, int val) {
        int right=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=val){
                arr[right]=arr[i];
                right++;
            }
        }
        return right;

    }
    public static void main(String[] args) {
        RemoveElement e = new RemoveElement();
        System.out.println(e.removeElement(new int[]{3, 2, 2, 3},3));
        System.out.println(e.removeElement(new int[]{0,1,2,2,3,0,4,2},2));
    }
}
