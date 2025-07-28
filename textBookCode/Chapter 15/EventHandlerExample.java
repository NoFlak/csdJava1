import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
/**
    This program illustrates event handling.  
 */
public class EventHandlerExample extends Application
{
    @Override
    public void start(Stage stage) 
    {
        // Create a button and set a handler on the button.
        Button button = new Button("Click Me");       
        button.setOnAction(new SimpleEventHandler());
        
        // Create VBox with center alignment.
        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);
        
        // Add button to VBox and set the VBox as scene
        vBox.getChildren().add(button);
        stage.setScene(new Scene(vBox, 250, 90));
        stage.setTitle("Event Handler");        
        stage.show();        
    }    
}

// Handler class.
class SimpleEventHandler implements EventHandler<ActionEvent>
{
    @Override
    public void handle(ActionEvent event)
    {
        JOptionPane.showMessageDialog(null, "Hello JavaFX!"); 
    }    
}