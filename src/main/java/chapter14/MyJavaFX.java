package chapter14;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application {

    @Override // Override the start method in the applications class
    public void start(Stage stage) {

        // Create a scene and place a button in the scene
        Button btOk = new Button("Ok.");
        Scene scene = new Scene(btOk, 200, 250);
        stage.setTitle("MyJavaFX");
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
