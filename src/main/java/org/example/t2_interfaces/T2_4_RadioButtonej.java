package org.example.t2_interfaces;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class T2_4_RadioButtonej extends Application {

    public static void main (String[]args){
        launch(args);
    }

    @Override
    public void start (Stage primaryStage){
        Label label1 = new Label("What is 10+20");
        Font font = new Font("Times New Roman",15);
        label1.setFont(font);

        RadioButton radioButton1 = new RadioButton("10");
        RadioButton radioButton2 = new RadioButton("20");
        RadioButton radioButton3 = new RadioButton("30");
        RadioButton radioButton4 = new RadioButton("40");
        Button button1 = new Button("Submit");


        VBox vBox1 = new VBox();
        vBox1.getChildren().addAll(label1);
        vBox1.getChildren().add(radioButton1);
        vBox1.getChildren().add(radioButton2);
        vBox1.getChildren().add(radioButton3);
        vBox1.getChildren().add(radioButton4);
        vBox1.getChildren().add(button1);


        Scene sc1 = new Scene(vBox1,500,500);
        primaryStage.setScene(sc1);
        primaryStage.setTitle("Quiz Questions1");
        primaryStage.show();

    }
}
