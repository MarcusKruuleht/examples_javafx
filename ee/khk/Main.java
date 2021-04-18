package ee.khk;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.Scene;

import java.util.concurrent.Flow;


public class Main extends Application {

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Label lbl = new Label("Hello");
        Button btn = new Button("Click");

        FlowPane root = new FlowPane();
        root.getChildren().addAll(lbl, btn);
        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);

        stage.setTitle("Layout in JavaFX");

        stage.show();
    }
}