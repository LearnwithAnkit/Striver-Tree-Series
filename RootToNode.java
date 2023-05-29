import java.util.*;
public class RootToNode {
    public static boolean roottonodepath(TreeNode root,ArrayList<Integer> ds,int x)
    {
    if(root==null)
    return false;
    ds.add(root.data);
    if(root.data==x)
    return true;
    if(roottonodepath(root.left, ds, x)||roottonodepath(root.right, ds, x))
    return true;
    ds.remove(ds.size()-1);
    return false;
    }
}
