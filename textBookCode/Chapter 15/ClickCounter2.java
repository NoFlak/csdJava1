import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
   This program illustrates the use of inner classes
   for event handling.
 */
public class ClickCounter2 extends Application
{
    @Override
    public void start(Stage stage)
    {
        // Create label, button, and attach event handler to the button.
        Label label = new Label("0");
        Button button = new Button("Click");
        
        // Define an inner class to use as event handler.
        class ClickHandler implements EventHandler<ActionEvent>
        {
            public void handle(ActionEvent event)
            {
                int count = Integer.parseInt(label.getText());
                count++;
                label.setText(String.valueOf(count));
            }
        }
        // Create a handler object based on the inner class
        // and set on the button.
        button.setOnAction(new ClickHandler());

        // Add the label and button to a pane.
        VBox pane = new VBox(10);
        pane.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(label, button);

        // Set up the stage.
        stage.setScene(new Scene(pane, 200, 80));
        stage.setTitle("Click Count");
        stage.show();
    }
}

