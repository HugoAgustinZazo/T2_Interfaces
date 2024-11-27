package org.example.t2_interfaces;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class T2_Eje extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        ComboBox<String> cb = new ComboBox<>();
        for(int i=8;i<35;i++) {

            cb.getItems().add(String.valueOf(i));
        }
        ComboBox cb2 = new ComboBox<>();
        ComboBox cb3= new ComboBox<>();
        List<String> listNames= new ArrayList();
        listNames.add("Times New Roman");
        listNames.add("Tahoma");
        listNames.add("Garamond");
        listNames.add("Verdana");
        listNames.add("Arial");
        listNames.add("Impact");
        listNames.add("Calibri");


        for(String f:listNames){
            Label label = new Label(f);
            label.setFont(new Font(f,15));
            cb3.getItems().add(label);
        }


        Label label = new Label("");
        HBox hBox = new HBox();
        hBox.getChildren().addAll(cb,cb2,cb3);
        for (int j = 0; j < 34; j++) {
            Label label1 = new Label("            ");
            Color color = Color.hsb(j * 10.5, 1.0, 1.0);
            label1.setBackground(new Background(new BackgroundFill(color, null, null)));

            cb2.getItems().add(label1);
        }

        Scene scene1 = new Scene(hBox,500,500);
        primaryStage.setScene(scene1);
        primaryStage.show();


    }
}
