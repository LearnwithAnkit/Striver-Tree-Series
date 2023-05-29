import java.util.*;
public class RightView {
    public static void rightview(TreeNode root,ArrayList<Integer> ds,int level)
    {
        if(root==null)
        return;
        if(level==ds.size())//if node is coming first time for this level
        {
            ds.add(root.data);
        }
        rightview(root.right, ds, level+1);
        rightview(root.left, ds, level+1);
        
    }
}
