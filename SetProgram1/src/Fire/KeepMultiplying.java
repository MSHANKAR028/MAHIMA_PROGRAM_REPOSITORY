package Fire;

public class KeepMultiplying {

    public int findFinal(int arr[], int num){
        //int product = 1;
       for(int i=0;i<arr.length;i++){
           if(IsThere(arr, num)){
               num=num * 2;
           }
       }
       return num;

    }

    public boolean IsThere(int arr[], int num ){
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                flag = true;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        KeepMultiplying obj = new KeepMultiplying();
        System.out.println(obj.findFinal(new int[]{5,3,6,1,12}, 3));
        System.out.println(obj.findFinal(new int[]{2,7,9}, 4));
        //System.out.println(obj.findFinal(new int[]{1,2,3,7,5,6,12,8,9}, 5));
    }







}
