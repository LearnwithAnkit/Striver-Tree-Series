import java.lang.Math;
public class CheckBalancedBinaryTree {
    //abs diff of height of left subtree and height of right subtree cannot be more than 1;
    //TC->O(N^2)
    public static boolean isBalanced(TreeNode root)
    {   if(root==null) return true;
        if(Math.abs(Height.heightOfTree(root.left)-Height.heightOfTree(root.right))>1)
        return false;
        if(isBalanced(root.left)&&isBalanced(root.right)) return true;
        return false;
    }
    //Optimized Approach if height diff>1 return -1 else return height of tree if any subtree return -1 then tree  is not balanced TC-O(N)
    public static boolean isBalancedOptimized(TreeNode root)
    {
        return check(root)!=-1;
    }
    public static int check(TreeNode root)
    {
        if(root==null)
        return 0;
        int lh=check(root.left);
        int rh=check(root.right);
        if(lh==-1||rh==-1) return -1;
        if(Math.abs(lh-rh)>1) return -1;
        return 1+Math.min(lh,rh);
    }
    
}
