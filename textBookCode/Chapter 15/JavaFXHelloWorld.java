import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/** 
    Java FX Hello World using a Label.
 */

public class JavaFXHelloWorld extends Application
{   
    @Override
    public void start(Stage stage)
    {       
        // Create label 
        Label label = new Label("Hello World!"); 
        
        // Set label as root of scene graph.
        Scene scene = new Scene(label , 300, 80);   
        stage.setScene(scene);
        
        // Set stage title and show the stage.
        stage.setTitle("Hello World!");
        stage.show();
    }   
}