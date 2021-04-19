package ee.khk;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.control.Label;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class Main extends Application {

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{

        TreeItem<String> rootTreeNode = new TreeItem<String>("Languages");
        rootTreeNode.setExpanded(true);

        TreeItem<String> germanics = new TreeItem<String>("Germanic");
        germanics.getChildren().add(new TreeItem<String>("Germanic"));
        germanics.getChildren().add(new TreeItem<String>("English"));

        TreeItem<String> romans = new TreeItem<String>("Roman");
        romans.getChildren().add(new TreeItem<String>("French"));
        romans.getChildren().add(new TreeItem<String>("Spanish"));
        romans.getChildren().add(new TreeItem<String>("Italian"));

        rootTreeNode.getChildren().add(germanics);
        rootTreeNode.getChildren().add(romans);

        TreeView<String> langsTreeView = new TreeView<String>(rootTreeNode);
        langsTreeView.setPrefSize(150, 200);

        MultipleSelectionModel<TreeItem<String>> selectionModel = langsTreeView.getSelectionModel();

        Label lbl = new Label();

        selectionModel.selectedItemProperty().addListener(new ChangeListener<TreeItem<String>>() {

            public void changed(ObservableValue<? extends TreeItem<String>> changed,
                                TreeItem<String> oldValue, TreeItem<String> newValue) {
                if (newValue != null) {

                    String path = newValue.getValue();
                    TreeItem<String> parent = newValue.getParent();
                    while (parent != null) {
                        path = parent.getValue() + " / " + path;
                        parent = parent.getParent();
                    }
                    lbl.setText(path);
                }
            }
        });

        FlowPane root = new FlowPane(Orientation.VERTICAL, 10, 10,  langsTreeView, lbl);
        Scene scene = new Scene(root, 300, 250);

        stage.setScene(scene);
        stage.setTitle("TreeView in JavaFX");
        stage.show();
    }
}