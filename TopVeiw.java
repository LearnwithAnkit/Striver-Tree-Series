import java.util.*;
public class TopVeiw {
    public static class pair
    {   
        TreeNode node;
        int level;
        pair(TreeNode node,int level)
        {
            this.node=node;
            this.level=level;
        }
    }
    public static ArrayList<Integer> topview(TreeNode root,ArrayList<Integer> ds)
    {
        Map<Integer,Integer> map=new TreeMap<>();
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(root, 0));
        while(!q.isEmpty())
        {
            pair p=q.remove();
            TreeNode node=p.node;
            int level=p.level;
            if(!map.containsKey(level))
            {
                map.put(level,node.data);
            }
            if(node.left!=null)
            {
                q.add(new pair(node.left,level-1));
            }
            if(node.right!=null)
            {
                q.add(new pair(node.right,level+1));
            }
        }
        for(int val:map.keySet())
        {
            ds.add(map.get(val));
        }
        return ds;
    }
}
