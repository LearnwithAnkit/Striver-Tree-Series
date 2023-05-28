public class MaxPathSum
{   //TC-O(N)
    public static int findmaxpath(TreeNode root,int[] max)
    {
        if(root==null)
        {
            return 0;
        }
        //ignore the negative path sum it will anyway decrese the overall path sum
        int lv=Math.max(0,findmaxpath(root.left, max));
        int rv=Math.max(0,findmaxpath(root.right, max));
        max[0]=Math.max(max[0],lv+rv+root.data);
        // System.out.print(lv+" "+rv+"->"+max[0]+"\n");
        return root.data+Math.max(lv,rv);
    }
}