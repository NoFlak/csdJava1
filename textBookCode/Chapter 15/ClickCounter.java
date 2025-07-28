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
   This program illustrates the passing of information
   to an event handler class constructor.
*/

public class ClickCounter extends Application
{
    @Override
    public void start(Stage stage)
    {
        // Create label, button, and attach event handler to the button.
        Label label = new Label("0");
        Button button = new Button("Click");
        button.setOnAction(new ClickHandler(label));
        
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

// Handler.
class ClickHandler implements EventHandler<ActionEvent>
{
    // Reference to label that will be updated.
    private Label rLabel;
    public ClickHandler(Label cParamLabel)
    {
        rLabel = cParamLabel;
    }
    @Override
    public void handle(ActionEvent event)
    {
       int count = Integer.parseInt(rLabel.getText());
       count ++;
       rLabel.setText(String.valueOf(count));
    }    
}