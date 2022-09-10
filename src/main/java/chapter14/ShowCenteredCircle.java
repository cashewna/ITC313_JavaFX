package chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCenteredCircle extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        // Create a pane and add a circle inside it
        Pane pane = new Pane();
        Circle circle = new Circle();
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        pane.getChildren().add(circle);

        // Create a scene and place it on the stage
        Scene scene = new Scene(pane, 200, 200);
        stage.setTitle("Show Centered Circle");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
