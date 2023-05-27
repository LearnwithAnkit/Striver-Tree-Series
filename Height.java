public class Height {

    public static int heightOfTree(TreeNode root)
    {
        if(root==null)
        return 0;
        int left=heightOfTree(root.left);//height of left subtree
        int right=heightOfTree(root.left);//height of right subtree
        return 1+Math.min(left,right);
    }
}
