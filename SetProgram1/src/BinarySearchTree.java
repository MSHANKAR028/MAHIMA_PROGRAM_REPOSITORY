public class BinarySearchTree {

class Node {
    int data;
    Node left;
    Node right;
    public Node(int data) {
        this.data = data;
    }
}
    public static Node binarySearch(Node node, int target){
        if(node==null){
            return null;
        }
        else if(node.data==target){
            return node;
        }
        else if(node.data<target)
            return binarySearch(node.right,target);
        else
            return binarySearch(node.left,target);

    }
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();



    }




















}
