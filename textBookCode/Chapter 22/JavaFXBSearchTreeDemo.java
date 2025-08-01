import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
   This class is a JavaFX interface for testing the
   the binary search tree class.
*/

public class JavaFXBSearchTreeDemo extends Application
{
    @Override
    public void start(Stage stage) throws Exception
    {
       // Set up the binary tree to manipulate        
       BinarySearchTree binTree = new BinarySearchTree();
    
       // This binary tree wraps the real binary tree 
       // so it can be displayed.
       DisplayableBtree 
           displayBinTree = new DisplayableBtree(binTree);
        
       // Displays the result of the user command.
       TextField cmdResultTextField = new TextField();
       cmdResultTextField.setEditable(false);
       
       // Used by the user to enter a command.
       TextField cmdTextField = new TextField();
       
       // HBox1 holds cmdResultTextField and its label.
       HBox hBox1 = new HBox(10);
       Label cmdResultLabel = new Label("Command Result");
       hBox1.getChildren().addAll(cmdResultLabel, cmdResultTextField);
       
       // Place holder for the binary tree view.
       HBox bTreeView = new HBox();
       bTreeView.setAlignment(Pos.CENTER);
       
       // HBox2 holds the cmdTextField and its label
       HBox hBox2 = new HBox(10);
       Label cmdLabel = new Label("Command");
       hBox2.getChildren().addAll(cmdLabel, cmdTextField);
       
       // Put the three HBox objects in a VBox
       VBox outerPane = new VBox(10);
       outerPane.setPadding(new Insets(10));
       outerPane.getChildren().addAll(hBox1, bTreeView, hBox2);
       
       // Command hander needs to access to the bTreeView
       // so it can set the binary tree view, and to the 
       // cmdResultTextField so it can set the command result.
       // Also needs access to the binary tree and its displayable
       // twin.
       EventHandler<ActionEvent> 
           handler = new CmdHandler(bTreeView, cmdResultTextField, 
                                    binTree, displayBinTree);      
       cmdTextField.setOnAction(handler);
       
       // Set up the stage
       stage.setTitle("Binary Search Tree Operations");
       stage.setScene(new Scene(outerPane));
       stage.show();       
    }
    
    public static void main(String [] args)
    {
         launch(args) ;      
    }
    
}

// Event Handler class
class CmdHandler implements EventHandler<ActionEvent>
{
    // These class variables reference
    // data in the calling environment.
    private HBox view;
    private TextField cmdResultTextField;
    private BinarySearchTree binTree;
    private DisplayableBtree displayBinTree;
    
    // Constructor stores references to data in 
    // the calling enviroment.
    public CmdHandler(HBox tView, TextField cmdResTf,
                      BinarySearchTree tree, 
                      DisplayableBtree dTree)
    {
        view = tView;
        cmdResultTextField = cmdResTf;
        binTree = tree;
        displayBinTree = dTree;
    }
    
    public void handle(ActionEvent evt)
    {
        // Get the command from the event target.
        TextField cmdTf = (TextField)evt.getTarget();
        String cmdStr =  cmdTf.getText();
        
        // Use a scanner to read the command and its parts.
        Scanner sc = new Scanner(cmdStr);
        String cmd = sc.next();
        switch (cmd)
        {
            case "add":
            {
                // Perform the operation on the tree.
                int value = sc.nextInt();
                binTree.add(value);
               
                // Replace the old view of the tree.
                view.getChildren().clear();             
                view.getChildren().add(displayBinTree.getJavaFXView());               
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
                int value = sc.nextInt();
                binTree.remove(value);
                
                 // Replace the old view of the tree.
                view.getChildren().clear();                
                view.getChildren().add(displayBinTree.getJavaFXView());               
                cmdResultTextField.setText(" ");               
            }
            return;
        }
    }
}