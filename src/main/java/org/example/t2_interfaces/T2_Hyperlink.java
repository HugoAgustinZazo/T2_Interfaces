package org.example.t2_interfaces;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class T2_Hyperlink extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Hyperlink hyperlink = new Hyperlink("https://classroom.google.com");
        VBox vBox = new VBox();
        vBox.getChildren().add(hyperlink);


        Scene scene = new Scene(vBox,500,500);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
