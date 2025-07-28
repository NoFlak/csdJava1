import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
    This program illustrates how to use radio buttons.  
 */

public class RadioButtonDemo extends Application
{
    @Override
    public void start(Stage stage) throws Exception
    {        
        // Vertical Box to hold the radio buttons.
        VBox radiosBox = new VBox(10);
        radiosBox.setPadding(new Insets(10, 10, 10, 10));        
        // Set a gray border around the radio button box.
        radiosBox.setStyle("-fx-border-color: gray;");       
        
        // Labels to use for the radio buttons.
        String [] optionLabels = 
          {"Walk", "Drive", "Take Public Transportation"};
        
        // Create the radioButtons and
        // set their toggleGroup property.
        ToggleGroup radiosGroup = new ToggleGroup();       
        RadioButton [] radioButtons = 
                new RadioButton[optionLabels.length];
        for (int k = 0; k < radioButtons.length; k++)
        {
           radioButtons[k] = new RadioButton(optionLabels[k]);           
           radioButtons[k].setToggleGroup(radiosGroup);
        }
        // Add the radio Buttons to the box.
        radiosBox.getChildren().addAll(radioButtons);
        // Pre-select the first choice.
        radioButtons[0].setSelected(true);        
        
        // Construct the top-level vertical box.             
        VBox topLevelBox = new VBox(10);
        topLevelBox.setAlignment(Pos.CENTER);     
        topLevelBox.setPadding(new Insets(10, 50, 10, 50));        
        
        // Create the button and selectionlabel
        // and add to the top-level box.
        Button showSelectionButton = new Button("Show Selection");
        Label selectionLabel = new Label();       
        topLevelBox.getChildren().
            addAll(radiosBox,showSelectionButton, selectionLabel);
        
        // Set the handler for the show selection button.
        EventHandler<ActionEvent> handler = event ->
        {
            for (RadioButton rb : radioButtons)
            {
                if (rb.isSelected())
                {
                    selectionLabel.setText(rb.getText());
                    return;
                }
            }
        };        
        showSelectionButton.setOnAction(handler);
        
        // Set the scene and the stage          
        Scene scene = new Scene(topLevelBox);
        stage.setScene(scene);
        stage.setTitle("RadioButton Demo");  
        stage.show();
    }    
}