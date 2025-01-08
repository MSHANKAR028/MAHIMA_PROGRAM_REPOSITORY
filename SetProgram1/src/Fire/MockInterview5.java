package Fire;
import java.util.*;
public class MockInterview5 {
    public boolean checkRootEqualSum(TreeNode root){
        if(root == null){
            return true;
        }
        return root.val==(root.left.val + root.right.val);
    }
    public static void main(String[] args) {
        MockInterview5 mockInterview5 = new MockInterview5();
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(4);
        root.right=new TreeNode(6);
        System.out.println(mockInterview5.checkRootEqualSum(root));

        TreeNode root1 = new TreeNode(5);
        root1.left = new TreeNode(3);
        root1.right=new TreeNode(1);
        System.out.println(mockInterview5.checkRootEqualSum(root1));
    }








}
