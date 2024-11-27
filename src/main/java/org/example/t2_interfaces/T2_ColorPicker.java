package org.example.t2_interfaces;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class T2_ColorPicker extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        ColorPicker dp1 = new ColorPicker();
        Text text = new Text("Seleccione un color");

        HBox hBox = new HBox();

        hBox.getChildren().addAll(text,dp1);

        Scene scene = new Scene(hBox,500,500);

        primaryStage.setScene(scene);
        primaryStage.setTitle("T2 DatePicker");
        primaryStage.show();
    }
}
