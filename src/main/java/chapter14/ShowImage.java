package chapter14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ShowImage extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        // Create an HBox pane which places all nodes horizontally in one row
        Pane pane = new HBox(10);
        pane.setPadding(new Insets(5, 5, 5, 5)); // padding
        Image image = new Image("images/au.gif");
        pane.getChildren().add(new ImageView(image));

        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);
        pane.getChildren().add(imageView);

        ImageView imageView2 = new ImageView(image);
        imageView2.setRotate(90);
        pane.getChildren().add(imageView2);

        // Create a scene and place it on stage
        Scene scene = new Scene(pane);
        stage.setTitle("Show Image");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
