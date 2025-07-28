import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
   This program demonstrates the JavaFX display of a 
   binary tree.
*/

public class JavaFXBtreeDisplayDemo extends Application
{
    @Override
    public void start(Stage stage) throws Exception
    {        
        // Create the tree.
        Node root;
        Node aNode = new Node(10);
        aNode.left = new Node(20);
        Node dNode = new Node(40);
        Node cNode = new Node(30, dNode, new Node(50));
        aNode.right = cNode;
        root = aNode;
        
        // Display the binary tree in a scene on the stage.
        Scene scene = new Scene(JavaFXNodeUtilities.getView(root));
        stage.setScene(scene);
        stage.setTitle("JavaFX Display of Binary Tree");
        stage.show();        
    }  
    
    public static void main(String [] args)
    {
        launch(args);
    }
}
