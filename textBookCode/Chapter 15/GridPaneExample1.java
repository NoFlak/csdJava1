import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
    GridPane Example 
 */
public class GridPaneExample1 extends Application
{
    @Override
    public void start(Stage stage) 
    {
        // Create a GridPane.
        GridPane gridPane = new GridPane();
        
        // Add three buttons.
        gridPane.add(new Button(" long (1, 0) button  "), 1, 0);
        gridPane.add(new Button("(0, 1)"), 0, 1);
        gridPane.add(new Button("(3, 1)"), 3, 1);
        
        // Make the grid lines visible.
        gridPane.setGridLinesVisible(true);
        
        // Set the stage and show.
        stage.setScene(new Scene(gridPane));
        stage.setTitle("GridPane Example 1");
        stage.show();
    }    
}