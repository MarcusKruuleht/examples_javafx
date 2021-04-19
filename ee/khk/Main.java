package ee.khk;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class Main extends Application {

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{

        Label lbl = new Label();
        TextArea textArea = new TextArea();
        textArea.setPrefColumnCount(15);
        textArea.setPrefRowCount(5);
        Button btn = new Button("Click");
        btn.setOnAction(event -> lbl.setText("Input " + textArea.getText()));
        FlowPane root = new FlowPane(Orientation.VERTICAL, 10, 10, textArea, btn, lbl);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 300, 250);

        stage.setScene(scene);
        stage.setTitle("Hello JavaFX");
        stage.show();
    }
}