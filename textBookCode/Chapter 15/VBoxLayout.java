
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
    This program demonstrates use of the VBox pane.
*/

public class VBoxLayout extends Application
{    
    @Override
    public void start(Stage stage)
    {
        // Create label, button and pane.
        Label label = new Label("This is a label");        
        Button button = new Button("Button");    
		
        // Create a VBox with default spacing and alignment.
        VBox pane = new VBox();
		
        // Add the label and button to the children of the pane.
        pane.getChildren().addAll(label, button);
		
        // Set pane as root of scene and set the scene on the stage.
        Scene scene = new Scene(pane, 220, 80);        
        stage.setTitle("VBox Layout");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }    
}
