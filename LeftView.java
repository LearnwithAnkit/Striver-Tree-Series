import java.util.*;
public class LeftView {
    //TC-O(N) SC-O(H)
    public static void leftview(TreeNode root,ArrayList<Integer> ds,int level)
    {
        if(root==null)
        return;
        if(level==ds.size())//if node is coming first time for this level
        {
            ds.add(root.data);
        }
        leftview(root.left, ds, level+1);
        leftview(root.right, ds, level+1);
        
        
    }
}
