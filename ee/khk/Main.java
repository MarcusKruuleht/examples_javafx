package ee.khk;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;



public class Main extends Application {

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        Button okBtn = new Button("OK");
        Button cancelBtn = new Button("Cancel");
        Label lbl = new Label("Select");

        VBox vbox = new VBox(15);

        VBox.setVgrow(okBtn, Priority.ALWAYS);
        okBtn.setMaxHeight(Double.MAX_VALUE);
        okBtn.setMaxWidth(100);
        // VBox täislaius
        // okBtn.setMaxWidth(Double.MAX_VALUE);

        VBox.setVgrow(cancelBtn, Priority.ALWAYS);
        cancelBtn.setMaxHeight(Double.MAX_VALUE);
        cancelBtn.setMaxWidth(100);
        // VBox täislaius
        // cancelBtn.setMaxWidth(Double.MAX_VALUE);

        vbox.getChildren().addAll(lbl, okBtn, cancelBtn);

        Scene scene = new Scene(vbox, 300, 150);
        stage.setScene(scene);

        stage.setTitle("VBox in JavaFX");

        stage.show();
    }
}