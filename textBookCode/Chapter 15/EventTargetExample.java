import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
   This program illustrates how to determine the
   event target.
 */
public class EventTargetExample extends Application
{
    @Override
    public void start(Stage stage)
    {
        Button button1 = new Button("One");
        Button button2 = new Button("Two");
        
        // Create the event handler using a lambda expression.
        EventHandler<ActionEvent> handler = 
                event -> 
                {
                    Button clickedButton = (Button) event.getTarget();
                    String newTitle = clickedButton.getText();
                    // set the new stage title.
                    stage.setTitle(newTitle);
                };
        
        // Add the same event handler to BOTH buttons.
        button1.setOnAction(handler);
        button2.setOnAction(handler);
        
        // Create a pane and add the two buttons to it.
        HBox pane = new HBox(10);
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(5, 50, 5, 50));
        pane.getChildren().addAll(button1, button2);
        
        // Set the stage and show.
        stage.setScene(new Scene(pane));
        stage.show();        
    }    
}
