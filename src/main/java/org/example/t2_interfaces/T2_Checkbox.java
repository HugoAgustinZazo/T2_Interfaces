package org.example.t2_interfaces;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class T2_Checkbox extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        CheckBox checkBox1 = new CheckBox("Opcion 1");
        CheckBox checkBox2 = new CheckBox("Opcion 2");

        Font font4 = new Font("Times new Roman",32);
        checkBox1.setFont(font4);
        checkBox2.setFont(font4);
        HBox hB1 = new HBox();

        hB1.getChildren().add(checkBox1);
        hB1.getChildren().add(checkBox2);


        Scene sc1 = new Scene(hB1,500,500);
        primaryStage.setScene(sc1);
        primaryStage.show();
    }
}
