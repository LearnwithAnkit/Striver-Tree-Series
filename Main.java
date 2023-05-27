// import TREE.Traversals.*;
public class Main {
    public static void main(String args[])
    {
        TreeNode node1=new TreeNode(10);
        TreeNode node2=new TreeNode(20);
        TreeNode node3=new TreeNode(30);
        TreeNode node4=new TreeNode(40);
        TreeNode node5=new TreeNode(30);
        TreeNode node6=new TreeNode(50);
        TreeNode node7=new TreeNode(60);
        // Traversals tv=new Traversals();
        node1.left=node2;
        node1.right=node3;
        node2.left=node4;
        node2.right=node5;
        node3.left=node7;
        node3.right=node6;
        Traversals.inorder(node1); 
        System.out.println();
        Traversals.Postorder(node1); 
        System.out.println();
        Traversals.Preorder(node1); 
        System.out.println();

    }
    
}
