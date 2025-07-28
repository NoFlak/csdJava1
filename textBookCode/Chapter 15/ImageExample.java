import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
   This program demonstrates the ImageView class.
*/

public class ImageExample extends Application
{    
    @Override
    public void start(Stage stage)
    {     
        // Create a pane.
        VBox vBox = new VBox();   
        vBox.setAlignment(Pos.CENTER);
        
        // Add image view to the pane.
        vBox.getChildren().add(new ImageView("tiger.jpg"));  
        
        // Set the stage and show.
        Scene scene = new Scene(vBox);        
        stage.setTitle("Image Demo");
        stage.setScene(scene);
        stage.show(); 
    }    
}
