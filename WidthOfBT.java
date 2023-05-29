import java.util.*;

public class WidthOfBT {
    public static class pair
    {
        TreeNode node;
        int num;
        pair(TreeNode n,int no)
        {
            node=n;
            num=no;
        }
    }
    public static int width(TreeNode root)
    {
        if(root==null) return 0;
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(root,0));
        int ans=0;
        while(!q.isEmpty())
        {
            int size=q.size();
            int min=q.peek().num;
            int first=0,second=0;
            for(int i=0;i<size;i++)
            {
                int curr_id=q.peek().num-min;
                TreeNode node=q.poll().node;
                if(i==0) first=curr_id;
                if(i==size-1) second=curr_id;
                if(node.left!=null)
                {
                    q.add(new pair(node.left,2*curr_id+1));
                }
                if(node.right!=null)
                {
                    q.add(new pair(node.right,2*curr_id+2));
                }
            }
            ans=Math.max(ans,second-first+1);
        }
        return ans;
    }
}
