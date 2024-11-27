package org.example.t2_interfaces;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class T2_ComboBox extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        ComboBox <String> cb = new ComboBox<>();
        cb.getItems().addAll("Ingles","Frances","Aleman","Italiano");

        HBox hBox = new HBox();
        hBox.getChildren().add(cb);

        Scene scene1 = new Scene(hBox,500,500);
        primaryStage.setScene(scene1);
        primaryStage.show();
    }
}
