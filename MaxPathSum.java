public class MaxPathSum
{   //TC-O(N)
    public static int findmaxpath(TreeNode root,int[] max)
    {
        if(root==null)
        {
            return 0;
        }
        int lv=findmaxpath(root.left, max);
        int rv=findmaxpath(root.right, max);
        max[0]=Math.max(max[0],Math.max(lv,rv)+root.data);
        return root.data+Math.max(lv,rv);
    }
}