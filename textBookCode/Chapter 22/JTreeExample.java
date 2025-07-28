  /**
   * This program shows how to build a JTree component
   */
  import javax.swing.*;
  import javax.swing.tree.*;
  public class JTreeExample
  {
      public static void main(String[] args)
      {
        //Create all the leaf nodes
        DefaultMutableTreeNode kate = new DefaultMutableTreeNode("Kate");
        DefaultMutableTreeNode amy = new DefaultMutableTreeNode("Amy");
        DefaultMutableTreeNode chuck = new DefaultMutableTreeNode("Chuck");
        DefaultMutableTreeNode joey = new DefaultMutableTreeNode("Joey");

        //Create the Bob node and add its children amy and chuck
        DefaultMutableTreeNode bob = new DefaultMutableTreeNode("Bob");
        bob.add(amy);
        bob.add(chuck);

        // Create the Sydney node and add its child joey
        DefaultMutableTreeNode sydney =
                new DefaultMutableTreeNode("Sydney");
        sydney.add(joey);

        // create the root node al,  and add  children bob, kate and sidney
        DefaultMutableTreeNode al = new DefaultMutableTreeNode("Al");
        al.add(bob);
        al.add(kate);
        al.add(sydney);

        // Create a default tree model to hold the tree rooted at al
        DefaultTreeModel myTreeModel = new DefaultTreeModel(al);
        // Create the JTree using the the tree model
        JTree myTree = new JTree(myTreeModel);

        //Display the tree in a JFrame
        JFrame myFrame  = new JFrame("Tree Exhibition Program");
        myFrame.add(myTree);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.pack();
        myFrame.setVisible(true);
     }
 }

