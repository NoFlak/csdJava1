import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

/**
   This class is a Swing interface to testing the 
   binary search tree class.
 */
public class SwingBSearchTreeDemo extends JFrame
{
    // The binary tree to be manipulated.
    private BinarySearchTree 
            binTree = new BinarySearchTree();
    
    // This binary tree wraps the real binary 
    // tree so it can be displayed.
    private DisplayableBtree 
            displayBinTree = new DisplayableBtree(binTree);
    
    // User interface components
    private JLabel cmdResultLabel;
    private JTextField cmdResultTextField;
    private JLabel cmdLabel;
    private JTextField cmdTextField;

    // Constructor builds the user interface and sets the 
    // event listener.
    public SwingBSearchTreeDemo()
    {
        setTitle("Binary Search Tree Operations");

        //cmd text and cmd Result label in North.
        JPanel resultPanel = new JPanel(new GridLayout(1, 2));
        cmdResultLabel = new JLabel("Command Result: ");
        cmdResultTextField = new JTextField();
        resultPanel.add(cmdResultLabel);
        resultPanel.add(cmdResultTextField);
        cmdResultTextField.setEditable(false);
        add(resultPanel, BorderLayout.NORTH);

        // Leave center for binary tree view
        // cmd label and cmd text field go in South.
        cmdLabel = new JLabel("Command: ");
        cmdTextField = new JTextField();
        JPanel cmdPanel = new JPanel(new GridLayout(1, 2));
        cmdPanel.add(cmdLabel);
        cmdPanel.add(cmdTextField);
        ActionListener cmdLis = new CmdTextListener();
        cmdTextField.addActionListener(cmdLis);
        add(cmdPanel, BorderLayout.SOUTH);

        // Set up the frame.
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    // View of the binary tree to be displayed in the frame.
    JPanel view = null;

    /**
       This private inner class responds to commands typed
       into the command entry text field. It executes the 
       commands on the real binary tree and then displays 
       the view from the displayable binary tree.
     */
    private class CmdTextListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent evt)
        {
            String cmdStr = cmdTextField.getText();
            Scanner sc = new Scanner(cmdStr);
            String cmd = sc.next();
            switch (cmd)
            {
                case "add":
                {
                    // Add the new value to the tree.
                    int value = sc.nextInt();
                    binTree.add(value);
                    
                    // Remove the old view and replace it with a 
                    // new view.
                    if (view != null) { remove(view); }                
                    view = displayBinTree.getSwingView();
                    add(view);
                    // Tell the frame to resize itself.
                    pack();
                    validate();
                    cmdResultTextField.setText(" ");
                }
                return;
                case "isempty":
                {
                    String resultText
                            = "Tree empty? " + binTree.isEmpty();
                    cmdResultTextField.setText(resultText);
                }
                return;
                case "contains":
                {
                    int value = sc.nextInt();
                    String resultText = "Contains " + value + "?: "
                            + binTree.contains(value);
                    cmdResultTextField.setText(resultText);
                }
                return;
                case "remove":
                {
                    // Similar to case for "add".
                    int value = sc.nextInt();
                    binTree.remove(value);
                    
                    if (view != null) {remove(view); }                    
                    view =  displayBinTree.getSwingView();
                    add(view);
                    
                    pack();
                    validate();
                    cmdResultTextField.setText(" ");
                }
                return;
            }
        }
    }

    /**
     * The main method creates an instance of the 
     * SwingBSearchTreeDemo class  which causes it
     * to display its window.
     */
    public static void main(String[] args)
    {
        new SwingBSearchTreeDemo();
    }
}
