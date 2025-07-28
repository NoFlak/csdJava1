import javafx.scene.layout.Pane;
import javax.swing.JPanel; 

public class DisplayableBtree extends BinaryTree
{
    private BinaryTree tree;
    public DisplayableBtree(BinaryTree t)
    {
        tree = t;        
    }
    
    @Override
    public boolean isEmpty()
    {
       return tree.isEmpty();
    }
    
    // Return a view of the binary tree suitable for 
    // display in Swing.
    public JPanel getSwingView()
    {
        return  SwingNodeUtilities.getView(tree.root);           
    }  
    
    // Return a view of the binary tree suitable for 
    // display in JavaFX
    public Pane getJavaFXView()
    {       
       return  JavaFXNodeUtilities.getView(tree.root);
    }
}
