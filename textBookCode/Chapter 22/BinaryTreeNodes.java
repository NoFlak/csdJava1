/**
   This program demonstrates construction and traversal of binary trees.
 */   
   
public class BinaryTreeNodes
{  
    // Creates a binary tree from nodes and traverses it in 
    // in inorder.
    public static void main(String[] args)
    {
        Node root = null;  // Will be root of the binary tree.
        
        Node aNode = new Node(10);
        aNode.left = new Node(20);
        Node dNode = new Node(40);
        Node cNode = new Node(30, dNode, new Node(50));
        aNode.right = cNode;
        root = aNode;
      
        System.out.print("Inorder traversal is: ");
        NodeUtilities.inorder(root);
        System.out.println();       
    }
}