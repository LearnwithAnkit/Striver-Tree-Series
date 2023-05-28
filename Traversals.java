import java.util.*;
public class Traversals {

//DFS
//1.Inorder
//TC-O(N) Space-O(N)
public static void inorder(TreeNode root)
{
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
}

//2.Preorder
//TC-O(N) Space-O(N)
public static void Preorder(TreeNode root)
{
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        inorder(root.left);
        inorder(root.right);
}

//3.PostOrder
//TC-O(N) Space-O(N)
public static void Postorder(TreeNode root)
{
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        inorder(root.right);
        System.out.print(root.data+" ");
}

//BFS
//Inorder Traversal
//TC-O(N) Space-O(N)
public static void LevelOrder(TreeNode root)
{  
    if(root==null) return;
   Queue<TreeNode> q=new LinkedList<>();
   q.add(root);
   while(!q.isEmpty())
   {
    int size=q.size();
    
    
    for(int i=0;i<size;i++)
    {
        TreeNode node=q.remove();
        if(node.left!=null) 
        q.offer(node.left);
        if(node.right!=null) 
        q.offer(node.right);  
        System.out.print(node.data+" ");
    }
   }
}
}
