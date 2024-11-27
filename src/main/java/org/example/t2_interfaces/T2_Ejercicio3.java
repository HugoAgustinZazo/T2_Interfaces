package org.example.t2_interfaces;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.stage.Stage;

public class T2_Ejercicio3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label label1 = new Label("");
        Label label2 = new Label("Welcome! Please sign in.");
        Label label3 = new Label("Username:  ");
        Label label4 = new Label("Password:  ");
        Label label5 = new Label("");
        Label label9 = new Label("Show password characters?  ");
        Label label10 = new Label("");
        Label label11 = new Label("");
        Label label12 = new Label("");
        Label label13 = new Label("");



        Button button = new Button("Sign in");



        CheckBox checkBox = new CheckBox();
        GridPane gridPane = new GridPane();
        HBox hBox = new HBox();
        Font font4 = new Font("",25);
        Font font5 = new Font("",17);

        label2.setFont(font4);
        label3.setFont(font5);
        label4.setFont(font5);
        TextField textField = new TextField();
        label9.setFont(Font.font("System",FontPosture.ITALIC,12));
        PasswordField passwordField = new PasswordField();
        passwordField.setText("password");
        hBox.getChildren().addAll(label9,checkBox);
        gridPane.add(label3,2,1);
        gridPane.add(textField,3,1);
        gridPane.add(label4,2,3);
        gridPane.add(passwordField,3,3);
        gridPane.add(hBox,3,4);
        gridPane.add(button,3,7);

        GridPane.setHalignment(button, HPos.RIGHT);

        gridPane.setVgap(20d);
        gridPane.setHgap(20d);


        VBox vBox = new VBox();
        vBox.getChildren().addAll(label1,label10,label2,label5,gridPane);
        vBox.setAlignment(Pos.TOP_CENTER);


        Scene scene = new Scene(vBox,400,350);
        primaryStage.setTitle("login.fxml");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
