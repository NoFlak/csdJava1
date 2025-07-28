import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 

/**
   The AVLFrame class builds the user interface and 
   supports user interaction.
*/

public class AVLTreeDemo extends JFrame
implements ActionListener
{
    // AVL Tree and a Displayable wrapper.
    private AVLTree avlTree = new AVLTree();   
    private DisplayableBtree 
            displayAvlTree = new DisplayableBtree(avlTree);
    
    // User interface components.
    private JLabel cmdResultLabel;
    private JTextField cmdResultTextField;    
    private JLabel cmdLabel;
    private JTextField cmdTextField;
   
    public AVLTreeDemo()
    {
        setTitle("AVL Trees");
        
        // cmd text and cmd Result label in North Region.
        JPanel resultPanel = new JPanel(new GridLayout(1,2));
        cmdResultLabel = new JLabel("Command Result: ");
        cmdResultTextField = new JTextField();
        resultPanel.add(cmdResultLabel);
        resultPanel.add(cmdResultTextField);
        cmdResultTextField.setEditable(false);     
        add(resultPanel, BorderLayout.NORTH);
        
        // Leave center for binary tree view.
        
        // cmd label and cmd text field in South Region.
        cmdLabel = new JLabel("Command: ");
        cmdTextField = new JTextField();
        JPanel cmdPanel = new JPanel(new GridLayout(1,2));
        cmdPanel.add(cmdLabel);
        cmdPanel.add(cmdTextField);
        cmdTextField.addActionListener(this);
        add(cmdPanel, BorderLayout.SOUTH);
        
        // Set up the frame.
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setVisible(true);
    }
    
    JPanel view = null;
    
    /**
       This method interprets user commands entered in the 
       command entry text field.
       @return evt The action event from the 
       command entry text field.
    */
    
    public void actionPerformed(ActionEvent evt)
    {
        String cmdStr = cmdTextField.getText();
        Scanner sc = new Scanner(cmdStr);
        String cmd = sc.next();
        if (cmd.equals("add"))
        {
            int value = sc.nextInt();
            avlTree.add(value);
            if (view != null)
                remove(view);
            view = displayAvlTree.getSwingView();            
            add(view);
            pack();
            validate(); 
            cmdResultTextField.setText(" ");
        }      
    } 
	 
    /**
       The main method creates an instance of the 
       AVLTreeDemo class which causes it to display
       its window.
   */
	 
    public static void main(String [ ] args)
    {
      AVLTreeDemo atd =  new AVLTreeDemo();
    }    
}