import java.lang.Math;
public class Diameter {
    //Diameter-Longest Path in the tree between any two TreeNode.
    //Brute force TC-O(N^2)
    static private int max=Integer.MIN_VALUE;
    public static int diameter(TreeNode root)
    {
        if(root==null)
        return 0;
        int lh=Height.heightOfTree(root.left);
        int rh=Height.heightOfTree(root.right);
        max=Math.max(max,lh+rh);
        int d1=diameter(root.left);
        int d2=diameter(root.right);
        return Math.max(max,Math.max(d1,d2));
        
    }
    //Optimized 
    public static int diameterOptimized(TreeNode root)
    {   int d[]=new int[1];
        findmax(root,d);
        return d[0];
    }
    public static int findmax(TreeNode root,int[] d)
    {
        if(root==null)
        return 0;
        int lh=findmax(root.left,d);
        int rh=findmax(root.right,d);
        d[0]=Math.max(d[0],lh+rh);
        return 1+Math.max(lh,rh);
    }


}
