package org.example.t2_interfaces;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class T2_RadioButton extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        RadioButton radioButton1 = new RadioButton("Opcion 1");
        RadioButton radioButton2 = new RadioButton("Opcion 2");
        RadioButton radioButton3 = new RadioButton("Opcion 3");

        Font font4 = new Font("Times new ROman,",32);
        radioButton1.setFont(font4);
        radioButton2.setFont(font4);
        radioButton3.setFont(font4);

        VBox vBox1 = new VBox();
        vBox1.getChildren().add(radioButton1);
        vBox1.getChildren().add(radioButton2);
        vBox1.getChildren().add(radioButton3);


        Scene sc1 = new Scene(vBox1,500,500);
        primaryStage.setScene(sc1);
        primaryStage.show();

    }
}
