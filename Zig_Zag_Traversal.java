import java.util.*;
public class Zig_Zag_Traversal {
    public static void zigzag(TreeNode root,ArrayList<ArrayList<Integer>> ds)
    {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean flag=false;
        while(!q.isEmpty())
        {
            int size=q.size();
            ArrayList<Integer> x=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode node=q.remove();
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
                x.add(node.data);
            }
            if(flag==false)
            {
                ds.add(x);
                flag=true;
            }
            else
            {
                Collections.reverse(x);
                ds.add(x);
                flag=false;
            }
        }
    }
}
