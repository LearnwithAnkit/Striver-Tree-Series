import java.util.*;
public class IterativeTraversal {
    //TC-O(N) Space-O(N)
    //steps-first add root than right and then left to stack as stack follow fifo so when we pop out left will come out first;
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
    //keep on going left and print if no left found go to right
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
     public static void postorder(TreeNode root)
    {
        if(root==null) return;
        Stack<TreeNode> st1=new Stack<>();
        Stack<TreeNode> st2=new Stack<>();
        st1.push(root);
        while(!st1.isEmpty())
        {
            TreeNode node=st1.pop();
            st2.push(node);
            // System.out.print(node.data+" ");
            if(node.left!=null) 
            st1.push(node.left);
            if(node.right!=null)
            st1.push(node.right);
        }
        while(!st2.isEmpty())
        {
            System.out.print(st2.pop().data+" ");
        }


    }

    
}
