import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/*
 * This program demonstrates the use of Text fields.
*/

public class TextFieldDemo extends Application
{
    @Override
    public void start(Stage stage) 
    {
        // Create labels for the user interface.
        Label inputLabel = new Label("Number: ");
        Label outputLabel = new Label("Square of Number: ");
        
        // Create the text fields for the user interface.
        TextField inputTextField = new TextField();
        TextField outputTextField = new TextField();
        inputTextField.setPrefColumnCount(4);
        outputTextField.setPrefColumnCount(4);
        outputTextField.setEditable(false);
        
        
        // Create HBox and add  the labels and textfields.
        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.CENTER);
        hBox.setPadding(new Insets(10));
        hBox.getChildren().addAll(inputLabel, inputTextField,
                                  outputLabel, outputTextField);
        hBox.setStyle("-fx-background-color: white");
        
        // Create the event handler for the input text field.
        // The handler read a number from the input text field,
        // squares it, and writes it to the output text field.        
        EventHandler<ActionEvent> handler = event ->
        {
            // Get Number from input text field.
            String inputText = inputTextField.getText().trim();
            int number = Integer.parseInt(inputText);
            
            // Write the square to the output text field.
            int square = number*number;
            outputTextField.setText(String.valueOf(square));            
        };
        // Set the handler on the input text field
        inputTextField.setOnAction(handler);        
        
        // Set the stage and show.
        stage.setScene(new Scene(hBox));
        stage.setTitle("TextField Demo");
        stage.show();        
    }    
}