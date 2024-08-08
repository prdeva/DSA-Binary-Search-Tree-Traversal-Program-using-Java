import java.util.*;
        //creating the tree node;
class TreeNode{
    int value;
    TreeNode left,right;
    TreeNode(int value)
    {
        this.value=value;
        left=right=null;

    }
}
//step 02;class Defenetion tree traversal

public class treeTravesal2
{
    public void Preorder(TreeNode node)
    {
        if(node==null)
        return;
        System.out.print(node.value+" ");
        Preorder(node.left);
        Preorder(node.right);

    }
    public void inorder(TreeNode node)
    {
        if(node==null)
        return;
        inorder(node.left);
        System.out.print(node.value+" ");
        
        inorder(node.right);

    }
    public void Postorder(TreeNode node)
    {
        if(node==null)
        return;
        Postorder(node.left);
        Postorder(node.right);
        System.out.print(node.value+" ");
       

    }
    //main function
    public static void  main(String[] args)
    {
        TreeNode root =new TreeNode(4);
        root.left=new TreeNode(2);
        root.right=new TreeNode(5);
        root.left.left=new TreeNode(3);
        root.left.left.right=new TreeNode(9);
        root.left.left.right.left=new TreeNode(1);
        root.right.left=new TreeNode(7);
        root.right.right=new TreeNode(6);
        root.right.right.left=new TreeNode(8);
       
      
        treeTravesal2 tree=new treeTravesal2();
        System.out.print("Preorder Travesal:");
        tree.inorder(root);
        System.out.print("inorder Travesal:");
        tree.Preorder(root);
        System.out.print("Postorder Travesal:");
        tree.Postorder(root);

    }
}
