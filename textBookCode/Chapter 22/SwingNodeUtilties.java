/**
   This class is a utility for the graphical display
   of a binary tree using Swing.
*/
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;

class SwingNodeUtilities
{
    // Returns a component that displays a binary tree.
    public static JPanel getView(Node root)
    {
        // Empty tree is displayed as a blank JPanel.
        if (root == null) { return new JPanel(); }
        
        // Leaf node displayed as a panel containing a single text field.
        if (root.left == null && root.right == null)
        {
            JTextField tF = new JTextField(String.valueOf(root.value));
            tF.setEditable(false);
            tF.setBackground(Color.WHITE);
            JPanel leafPanel = new JPanel();
            leafPanel.add(tF);
            return leafPanel;
        }

        // Non-leaf node displayed in BorderLayout JPanel whose
        // NORTH region displays the node's value, and whose WEST 
        // and EAST regions display the left and right subtree at 
        // node.         
        JPanel panel = new JPanel(new BorderLayout());

        // Display the value in the node in NORTH.
        String value = String.valueOf(root.value);
        JTextField tF = new JTextField(String.valueOf(root.value));
        tF.setEditable(false);
        tF.setBackground(Color.WHITE);
        JPanel valuePanel = new JPanel();
        valuePanel.add(tF);
        panel.add(valuePanel, BorderLayout.NORTH);

        // Display the left and right subtrees in WEST and EAST.
        panel.add(getView(root.left), BorderLayout.WEST);
        panel.add(getView(root.right), BorderLayout.EAST);

        return panel;
    }
}

