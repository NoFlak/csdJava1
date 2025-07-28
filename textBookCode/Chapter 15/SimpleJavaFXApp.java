import javafx.application.Application;
import javafx.stage.Stage;

/**
   Simple JavaFX program displaying an empty stage.
*/
public class SimpleJavaFXApp extends Application
{
    public static void main(String []args)
    {
      launch(args);        
    }
    @Override
    public void start(Stage stage)
    {
        stage.setTitle("Simple JavaFX Application");        
        stage.show();
    }
}
