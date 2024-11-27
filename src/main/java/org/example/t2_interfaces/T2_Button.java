package org.example.t2_interfaces;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class T2_Button extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        Button button1 = new Button("Boton standard");
        Button button2 = new Button("Boton rojo");
        Button button3 = new Button("Boton amarillo");
        Button button5 = new Button("este boton tiene un texto largo pero no pasa nada porque se puede desplegar") ;
        button2.setTextFill(Color.RED);
        button3.setStyle("-fx-background-color: yellow");


        FileInputStream fileInputStream1 = new FileInputStream("images.jpg");
        Image image1 = new Image(fileInputStream1);
        ImageView ima = new ImageView(image1);
        Button button4 = new Button("SIEMPRE FIELES",ima);



        VBox b1 = new VBox();
        b1.getChildren().addAll(button1,button2,button3,button4);
        Scene scene1 = new Scene(b1,500,500);
        primaryStage.setScene(scene1);
        primaryStage.setTitle("T2 Button");
        primaryStage.show();
    }
}
