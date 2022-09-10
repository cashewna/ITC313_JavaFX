package chapter14;

import javafx.application.Application;
import javafx.css.converter.FontConverter;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class FontDemo extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        // Create a new stackpane and hold a circle
        StackPane pane = new StackPane();
        Circle circle = new Circle();
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(new Color(0.5, 0.5, 0.5, 0.1));
        pane.getChildren().add(circle);

        // Create a label and set its properties
        Label label = new Label("JavaFX");
        label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
        pane.getChildren().add(label);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 200, 250);
        stage.setTitle("FontDemo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
