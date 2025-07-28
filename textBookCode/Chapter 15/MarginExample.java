import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
    This program illustrates how to set margins
    on children of a VBox.
 */
public class MarginExample extends Application
{    
    @Override
    public void start(Stage stage)
    {       
        // Create label and button.
        Label label = new Label("This is a label");        
        Button button = new Button("Button"); 
        
        // Set margins for a VBox pane on the label and button.
        Insets insets = new Insets(10);
        VBox.setMargin(label, insets);
        VBox.setMargin(button, insets);     
        
        // Create a VBox with default spacing and alignment
        VBox pane = new VBox();   
        
        // Add the label and button to the children of the pane.
        pane.getChildren().addAll(label, button);
        
        // Set pane as root of scene and set the scene on the stage.
        Scene scene = new Scene(pane, 240, 80);        
        stage.setTitle("Margin Example");
        stage.setScene(scene);
        stage.show();        
    }
}