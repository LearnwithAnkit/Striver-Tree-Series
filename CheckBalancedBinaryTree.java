import java.lang.Math;
public class CheckBalancedBinaryTree {
    //abs diff of height of left subtree and height of right subtree cannot be more than 1;
    public static boolean isBalanced(TreeNode root)
    {   if(root==null) return true;
        if(Math.abs(Height.heightOfTree(root.left)-Height.heightOfTree(root.right))>1)
        return false;
        if(isBalanced(root.left)&&isBalanced(root.right)) return true;
        return false;

    }
    
}
