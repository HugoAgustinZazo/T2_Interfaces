package org.example.t2_interfaces;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class T2_Ejercicio2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane borderPane = new BorderPane();

        Button button1 = new Button("Pizza Price Calculator");
        Label label1 = new Label("Pizza Cost: $10.00");
        Font font4 = new Font("Times New Roman",20);
        label1.setFont(font4);
        Label label2 = new Label("");
        Label label3 = new Label("");

        VBox vBox1 = new VBox();

        CheckBox checkBox1 = new CheckBox("Extra Chesse");
        CheckBox checkBox2 = new CheckBox("Pepperoni");
        CheckBox checkBox3 = new CheckBox("Sausage");
        vBox1.getChildren().add(checkBox1);
        vBox1.getChildren().add(checkBox2);
        vBox1.getChildren().add(checkBox3);


        VBox vBox2 = new VBox();

        CheckBox checkBox4 = new CheckBox("Green Pepper");
        CheckBox checkBox5 = new CheckBox("Onion");
        CheckBox checkBox6 = new CheckBox("Anchovies");

        vBox2.getChildren().add(checkBox4);
        vBox2.getChildren().add(checkBox5);
        vBox2.getChildren().add(checkBox6);


        borderPane.setCenter(button1);
        borderPane.setBottom(label1);
        borderPane.setTop(label2);
        borderPane.setLeft(vBox1);
        borderPane.setRight(vBox2);


        borderPane.setBackground(Background.fill(Paint.valueOf("#d8beda")));

        BorderPane.setAlignment(label1,Pos.CENTER);
        Scene sc1 = new Scene(borderPane,500,500);
        primaryStage.setScene(sc1);
        primaryStage.setTitle("T2_checkbox_ejercicio");
        primaryStage.show();

    }
}
