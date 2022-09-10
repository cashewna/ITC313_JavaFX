package chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MultipleStageDemo extends Application {

    public MultipleStageDemo() {
        System.out.println("Test constructor is invoked.");
    }
    @Override
    public void start(Stage stage) {
        System.out.println("Start method is invoked.");
        // Create a scene and place button in the scene
        Scene scene = new Scene(new Button("Ok."), 200, 250);

        // Set the title, scene, and show the stage
        stage.setTitle("MyJavaFX");
        stage.setScene(scene);
        stage.show();

        Stage stage2 = new Stage();
        stage2.setTitle("Second stage");
        stage2.setScene(new Scene(new Button("New Stage"), 200, 250));
        stage2.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
