import java.util.ArrayList;

public class BoundaryTraversal {
    //This is for anticlock wise boundary traversal-First add all left boundary nodes except leaf node then add all leaf node and then add all right boundary node(while traversing add in reverse order)
    public static boolean isLeaf(TreeNode node)
    {
        if(node==null) return false;
        if(node.left==null&&node.right==null)
        return true;
        return  false; 
    }
    public static void addleftboundary(TreeNode cur,ArrayList<Integer> ds)
    {
        cur=cur.left;
        while(cur!=null)
        {   if(!isLeaf(cur)) ds.add(cur.data);
            if(cur.left!=null) 
            {
                cur=cur.left;
            }
            cur=cur.right;

        }
    }
    public static void addRightboundary(TreeNode cur,ArrayList<Integer> ds)
    {
        cur=cur.right;
        ArrayList<Integer> tmp=new ArrayList<>();
        while(cur!=null)
        {   if(!isLeaf(cur)) tmp.add(0,cur.data);
            if(cur.right!=null) 
            {
                cur=cur.right;
            }
            cur=cur.left;
        }
        for(int i=0;i<tmp.size();i++) ds.add(tmp.get(i));
    }
    public static void addLeaf(TreeNode cur,ArrayList<Integer> ds)
    {
        if(isLeaf(cur))
        {
            ds.add(cur.data);
            return;
        }
        if(cur.left!=null) addLeaf(cur.left,ds);
        if(cur.right!=null) addLeaf(cur.right,ds);
    }
    public static void boundaryTraversal(TreeNode root,ArrayList<Integer> ds)
    {
        if(!isLeaf(root)) ds.add(root.data);
        addleftboundary(root, ds);
        addLeaf(root, ds);
        addRightboundary(root, ds);
        
    }

}
