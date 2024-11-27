package org.example.t2_interfaces;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class T2_Password extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        PasswordField passwordField = new PasswordField();
        Font font4 = new Font("Times New Roman",32);
        passwordField.setFont(font4);

        HBox hBox = new HBox();
        hBox.getChildren().add(passwordField);



        Scene scene = new Scene(hBox,500,500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
