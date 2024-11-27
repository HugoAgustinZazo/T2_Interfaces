package org.example.t2_interfaces;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class T2_Listview extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        ListView<String> lv= new ListView<>();
        lv.getItems().add("Inglés");
        lv.getItems().add("Fránces");
        lv.getItems().add("Aleman");
        lv.getItems().add("Itliano");

        lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        HBox hBox = new HBox();
        hBox.getChildren().add(lv);

        Scene scene1 = new Scene(hBox,500,500);
        primaryStage.setScene(scene1);
        primaryStage.show();
    }
}
