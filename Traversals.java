public class Traversals {

//DFS
//1.Inorder(go to extreme left subtree then apply left root right then go to right then apply the same)

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

// public static void Preorder(TreeNode root)
// {

// }
}
