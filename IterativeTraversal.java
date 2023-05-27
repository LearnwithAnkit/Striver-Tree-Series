import java.util.*;
public class IterativeTraversal {
    //TC-O(N) Space-O(N)
    public static void preorder(TreeNode root)
    {
        if(root==null) return;
        Stack<TreeNode> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty())
        {
            TreeNode node=st.pop();
            System.out.print(node.data+" ");
            if(node.right!=null) 
            st.push(node.right);
            if(node.left!=null)
            st.push(node.left);
        }
    }
    //inorder
    public static void inorder(TreeNode root)
    {
        if(root==null) return;
        Stack<TreeNode> st=new Stack<>();
        TreeNode node=root;
        while(true)
        {   
            if(node!=null)
            {
                st.push(node);
                node=node.left;
            }
            else
            {
                if(st.isEmpty())
                break;
                node=st.pop();
                System.out.print(node.data+" ");
                node=node.right;
            }
        }
    }
}
