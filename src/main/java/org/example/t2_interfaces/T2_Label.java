package org.example.t2_interfaces;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class T2_Label extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        Label label = new Label();
        label.setText("Etiqueta simple");
        label.setTextFill(Color.RED);

        Label label3 = new Label("Etiqueta de fondo amarillo");
        label3.setStyle("-fx-background-color: yellow");
        Label label4 = new Label("Etiqueta Times New Roman");
        Font font4 = new Font("Times New Roman",32);
        label4.setFont(font4);
        Label label5 = new Label("Etiqueta con fondo azul y tamaño minimo");
        label5.setStyle("-fx-background-color: #7373e7");
        label5.setMinSize(300,50);


        FileInputStream fileInputStream1 = new FileInputStream("images.jpg");
        Image image1 = new Image(fileInputStream1);
        ImageView ima = new ImageView(image1);
        Label label6 = new Label("SIEMPRE FIELES",ima);

        FileInputStream fileInputStream2 = new FileInputStream("impreza.jpg");
        Image image2 = new Image(fileInputStream2);
        ImageView ima2 = new ImageView(image2);
        ima2.setFitHeight(200);
        ima2.setFitWidth(300);
        Label label7 = new Label("zubaru",ima2);



        VBox vBox1 = new VBox();
        vBox1.getChildren().addAll(label,label3,label4,label5,label6,label7);

        Scene scene1 = new Scene(vBox1,500,500);
        primaryStage.setScene(scene1);
        primaryStage.show();
    }
}
