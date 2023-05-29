public class CheckForSymmetrical
{
   public static boolean issym(TreeNode left,TreeNode right)
   {
    if(left==null||right==null)
    {
        return left==right;
    }
    if(left.data!=right.data) return false;
    return (issym(left.left, right.right))&&(issym(left.right, right.left));
   }
    public static boolean isSymmetrical(TreeNode root)
    {
        return root==null||issym(root.left,root.right);
    }
    
}