/**
   This class has various utility methods for working with nodes.
*/
public class NodeUtilities
{    
    /**
       Inorder traversal of a binary tree rooted at a node.
       @param btree : The root of the binary tree.
     */
    static public void inorder(Node btree)
    {
        if (btree != null)
        {
            inorder(btree.left);
            System.out.print(btree.value + " ");
            inorder(btree.right);
        }
    }
}