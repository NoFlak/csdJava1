import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

/**
   The BinarySearchTreeDemo class builds the 
	user interface and supports user interaction.
*/

public class BinarySearchTreeDemo extends JFrame
{
    private 
	 BinarySearchTree binTree = new BinarySearchTree();   
    private JLabel cmdResultLabel;
    private JTextField cmdResultTextField;
    
    private JLabel cmdLabel;
    private JTextField cmdTextField;   
    
    public BinarySearchTreeDemo()
    {
        setTitle("Binary Search Tree Operations");
        
        //cmd text and cmd Result label in North
        JPanel resultPanel = new JPanel(new GridLayout(1,2));
        cmdResultLabel = new JLabel("Command Result: ");
        cmdResultTextField = new JTextField();
        resultPanel.add(cmdResultLabel);
        resultPanel.add(cmdResultTextField);
        cmdResultTextField.setEditable(false);
        
        add(resultPanel, BorderLayout.NORTH);
        
        // Leave center for binary tree view
        
        // cmd label and cmd text field in South
        cmdLabel = new JLabel("Command: ");
        cmdTextField = new JTextField();
        JPanel cmdPanel = new JPanel(new GridLayout(1,2));
        cmdPanel.add(cmdLabel);
        cmdPanel.add(cmdTextField);
		  ActionListener cmdLis = new CmdTextListener();
        cmdTextField.addActionListener(cmdLis);
        add(cmdPanel, BorderLayout.SOUTH);
        
        // Set up the frame
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setVisible(true);
    }
    
    JPanel view = null;
    
    /**
	    This private inner class responds to commands
		 typed into the command entry text field.
    */
    private class CmdTextListener
	        implements ActionListener
	 {		  
       public void actionPerformed(ActionEvent evt)
       {
          String cmdStr = cmdTextField.getText();
          Scanner sc = new Scanner(cmdStr);
          String cmd = sc.next();
          if (cmd.equals("add"))
          {
              int value = sc.nextInt();
              binTree.add(value);
              if (view != null)
                 remove(view);
              view = binTree.getView();            
              add(view);
              pack();
              validate(); 
              cmdResultTextField.setText(" ");
          }
          if (cmd.equals("isempty"))
          {
              String resultText = 
				       "Tree empty? " + binTree.isEmpty();
              cmdResultTextField.setText(resultText);
          }
          if (cmd.equals("contains"))
          {
              int value = sc.nextInt();
              String resultText = "Contains "+ value + "?: "
                                + binTree.contains(value);
              cmdResultTextField.setText(resultText);           
          }
          if (cmd.equals("remove"))
          {
              int value = sc.nextInt();
              binTree.remove(value);
              if (view != null)
                 remove(view);
              view = binTree.getView();            
              add(view);
              pack();
              validate(); 
              cmdResultTextField.setText(" "); 
          }        
    }
	 }
	 
   /**
      The main method creates an instance of the 
	   BinarySearchTreeDemo class which causes it 
      to display its window.
   */

  public static void main(String[ ]args)
  {	  
     new BinarySearchTreeDemo();	 
  }   
}