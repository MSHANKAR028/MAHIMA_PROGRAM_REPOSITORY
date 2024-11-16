import java.util.*;

public class BinaryTreeAverageValue {

    public double[] averageValues(TreeNode root) {
        java.util.List<java.lang.Double> result = new ArrayList<java.lang.Double>();
        if(root == null)
            return new double[0];
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            double sum = 0;
            for(int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                sum +=  node.val;
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            result.add(sum/size);
        }
        double[] res = new double[result.size()];
        for(int i = 0; i < res.length; i++){
            res[i] = result.get(i);
        }
        return res;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        BinaryTreeAverageValue obj = new BinaryTreeAverageValue();
        double [] result= obj.averageValues(root);
        System.out.println(Arrays.toString(result));
    }

















}
