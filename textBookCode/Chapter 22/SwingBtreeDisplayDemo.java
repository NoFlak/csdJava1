import javax.swing.JFrame;
/**
   This class demonstrates the Swing Display of 
   a binary tree.
*/

public class SwingBtreeDisplayDemo
{
    public static void main(String [] args)
    {
        // Create the tree.
        Node root;
        Node aNode = new Node(10);
        aNode.left = new Node(20);
        Node dNode = new Node(40);
        Node cNode = new Node(30, dNode, new Node(50));
        aNode.right = cNode;
        root = aNode;
        
        // Display the tree in a JFrame.        
        JFrame frame = new JFrame("Swing Display of Binary Tree");
        frame.add(SwingNodeUtilities.getView(root));
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        frame.setVisible(true);
    }
}