import java.util.*;
public class VerticalOrder {

    //map to store vertical and another map to stpre level and multinode
    //Use TreeMap<Integer,TreeMap<Integer,PriorityQueue>
    public static class Tuple{
        TreeNode node;
        int row,col;
        Tuple(TreeNode n,int r,int c)
        {
            node=n;
            row=r;
            col=c;
        }
    }
    public static void verticalorder(TreeNode root,ArrayList<ArrayList<Integer>> ds)
    {
        Map<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
        Queue<Tuple> q=new LinkedList<>();
        q.add(new Tuple(root,0,0));
        while(!q.isEmpty())
        {
            Tuple t=q.remove();
            TreeNode node=t.node;
            int row=t.row;
            int col=t.col;
            if(!map.containsKey(row))
            {
                map.put(row,new TreeMap<>());
            }
            if(!map.get(row).containsKey(col))
            {
                map.get(row).put(col,new PriorityQueue<>());
            }
            map.get(row).get(col).add(node.data);
            if (node.left != null) {
                q.offer(new Tuple(node.left, row - 1, col + 1));
            }
            if (node.right != null) {
                q.offer(new Tuple(node.right, row + 1, col + 1));
            }
        }
        // System.out.println(map);
        for (TreeMap < Integer, PriorityQueue < Integer >> ys: map.values()) {
            ds.add(new ArrayList < > ());
            for (PriorityQueue < Integer > nodes: ys.values()) {
                while (!nodes.isEmpty()) {
                    ds.get(ds.size() - 1).add(nodes.poll());
                }
            }
        }
    
    }
}
