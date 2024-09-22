import java.util.*;
public class InteresectionTwoArray {
    public static  int[] intersect(int[] nums1, int[] nums2) {
    HashMap<Integer,Integer>hash=new HashMap<>();
    List<Integer>result=new ArrayList<>();
    for(int i=0;i<nums1.length;i++){
        int count=hash.getOrDefault(nums1[i],0);
        count++;
        hash.put(nums1[i],count);
    }
    for(int i=0;i<nums2.length;i++){
        int count=hash.getOrDefault(nums2[i],0);
        if(count>0){
            result.add(nums2[i]);
            count--;
            hash.put(nums2[i],count);
        }
    }
        return result.stream().mapToInt(i->i).toArray();
    }

   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
       System.out.println("Enter the size of array");
        n=sc.nextInt();
        int[] nums2=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            nums2[i]=sc.nextInt();
        }

        int[] result=intersect(nums,nums2);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

   }
}

