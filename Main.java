// import TREE.Traversals.*;
import java.util.*;
public class Main {
public static TreeNode CreateTree() {
    TreeNode root=new TreeNode(10);
        TreeNode node2=new TreeNode(20);
        TreeNode node3=new TreeNode(30);
        TreeNode node4=new TreeNode(40);
        TreeNode node5=new TreeNode(50);
        TreeNode node6=new TreeNode(60);
        TreeNode node7=new TreeNode(70);
        // Traversals tv=new Traversals();
        root.left=node2;
        root.right=node3;
        node2.left=node4;
        node2.right=node5;
        node3.left=node7;
        node3.right=node6;
        return root;
}
    public static void main(String args[])
    {
        // TreeNode root=CreateTree();
        TreeNode root=new TreeNode(10);
        TreeNode node2=new TreeNode(20);
        TreeNode node3=new TreeNode(30);
        TreeNode node4=new TreeNode(40);
        TreeNode node5=new TreeNode(50);
        TreeNode node6=new TreeNode(60);
        TreeNode node7=new TreeNode(70);
        // Traversals tv=new Traversals();
        root.left=node2;
        root.right=node3;
        node2.left=node4;
        node2.right=node5;
        node3.left=node7;
        node3.right=node6;

        System.out.println("Inorder");
        Traversals.inorder(root); 
        System.out.println("\nPostOrder");
        Traversals.Postorder(root); 
        System.out.println("\nPreorder");
        Traversals.Preorder(root); 
        System.out.println("\nLevelOrder");
        Traversals.LevelOrder(root); 
        System.out.println("\nIterative Preorder");
        IterativeTraversal.preorder(root);
        System.out.println("\nIterative inorder");
        IterativeTraversal.inorder(root);
        System.out.println("\nIterative postorder");
        IterativeTraversal.postorder(root);
        System.out.println("\nHeight of Tree is: "+Height.heightOfTree(root));
        System.out.println("The given binary tree is: "+(CheckBalancedBinaryTree.isBalanced(root)?"Balanced":"Not Balanced"));
        System.out.println("The given binary tree is: "+(CheckBalancedBinaryTree.isBalancedOptimized(root)?"Balanced":"Not Balanced"));
        System.out.println("Diameter of Tree is: "+Diameter.diameter(root));
        System.out.println("Diameter of Tree is: "+Diameter.diameterOptimized(root));

        int maxpath[]=new int[]{0};
        MaxPathSum.findmaxpath(root,maxpath);
        System.out.println("Max path sum of Tree is: "+maxpath[0]);
        TreeNode root2=new TreeNode(0);
        System.out.println("Same tree? "+(SameTreeOrNot.sametree(root, root)?"Yes":"No"));
        System.out.println("Same tree? "+(SameTreeOrNot.sametree(root, root2)?"Yes":"No"));
        ArrayList<ArrayList<Integer>> zz=new ArrayList<>();
        Zig_Zag_Traversal.zigzag(root, zz);
        System.out.println("zig-zag traversal:-"+zz);
        ArrayList<ArrayList<Integer>> zzo=new ArrayList<>();
        Zig_Zag_Traversal.zigzag(root, zzo);
        System.out.println("zig-zag traversal:-"+zzo);
        ArrayList<Integer> bd=new ArrayList<>();
        BoundaryTraversal.boundaryTraversal(root, bd);
        System.out.println("Boundary traversal:-"+bd);
        ArrayList<ArrayList<Integer>> vo=new ArrayList<>();
        VerticalOrder.verticalorder(root,vo);
        System.out.println("Vertical traversal:-"+vo);
       ArrayList<Integer> tv=new ArrayList<>();
        tv=TopVeiw.topview(root, tv);
        System.out.println("top view:-"+tv);
        ArrayList<Integer> bv=new ArrayList<>();
        bv=BottomView.bottomview(root, bv);
        System.out.println("bottom view:-"+bv);
        ArrayList<Integer> rv=new ArrayList<>();
        RightView.rightview(root, rv,0);
        System.out.println("right view:-"+rv);
        ArrayList<Integer> lv=new ArrayList<>();
        LeftView.leftview(root, lv,0);
        System.out.println("left view:-"+lv);
        System.out.println("isSymmetrical?-"+CheckForSymmetrical.isSymmetrical(root));
        ArrayList<Integer> roottoPath=new ArrayList<>();
        RootToNode.roottonodepath(root, roottoPath,70);
        System.out.println("Root to Node path:-"+roottoPath);
        System.out.println("LCA of 60 and 70 is:-"+LCA.lca(root,node6, node7).data);
        
    }
    
}
