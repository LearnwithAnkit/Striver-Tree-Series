// import TREE.Traversals.*;
public class Main {
public static TreeNode CreateTree() {
    TreeNode root=new TreeNode(10);
        TreeNode node2=new TreeNode(20);
        TreeNode node3=new TreeNode(30);
        TreeNode node4=new TreeNode(40);
        TreeNode node5=new TreeNode(50);
        TreeNode node6=new TreeNode(60);
        TreeNode node7=new TreeNode(70);
        // Traversals tv=new Traversals();
        root.left=node2;
        root.right=node3;
        node2.left=node4;
        node2.right=node5;
        node3.left=node7;
        node3.right=node6;
        return root;
}
    public static void main(String args[])
    {
        TreeNode root=CreateTree();
        System.out.println("Inorder");
        Traversals.inorder(root); 
        System.out.println("\nPostOrder");
        Traversals.Postorder(root); 
        System.out.println("\nPreorder");
        Traversals.Preorder(root); 
        System.out.println("\nLevelOrder");
        Traversals.LevelOrder(root); 
        System.out.println("\nIterative Preorder");
        IterativeTraversal.preorder(root);
        System.out.println("\nIterative inorder");
        IterativeTraversal.inorder(root);
        System.out.println("\nIterative postorder");
        IterativeTraversal.postorder(root);
        System.out.println("\nHeight of Tree is: "+Height.heightOfTree(root));
        System.out.println("The given binary tree is: "+(CheckBalancedBinaryTree.isBalanced(root)?"Balanced":"Not Balanced"));
        System.out.println("The given binary tree is: "+(CheckBalancedBinaryTree.isBalancedOptimized(root)?"Balanced":"Not Balanced"));
        System.out.println("Diameter of Tree is: "+Diameter.diameter(root));
        System.out.println("Diameter of Tree is: "+Diameter.diameterOptimized(root));

        int maxpath[]=new int[]{0};
        MaxPathSum.findmaxpath(root,maxpath);
        System.out.println("Max path sum of Tree is: "+maxpath[0]);
        TreeNode root2=new TreeNode(0);
        System.out.println("Same tree? "+(SameTreeOrNot.sametree(root, root)?"Yes":"No"));
        System.out.println("Same tree? "+(SameTreeOrNot.sametree(root, root2)?"Yes":"No"));

 
    }
    
}
