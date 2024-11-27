package org.example.t2_interfaces;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T2_Ejercicio4 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        ComboBox comboBox=new ComboBox<>();
        Label l1=new Label("2023-2024");
        Label l2=new Label("2024-2025");
        comboBox.getItems().addAll(l1,l2);
        comboBox.setMinHeight(68);
        Label l3=new Label("Año Academico: ");
        Label l4 = new Label("");


        Button b1=new Button();
        Button b2=new Button();

        HBox hBox2 = new HBox();
        hBox2.getChildren().addAll(b1,b2);
        FileInputStream imagen = new FileInputStream("tick.jpg");
        Image imagenRe = new Image(imagen);
        ImageView foto = new ImageView(imagenRe);
        foto.setFitWidth(40);
        foto.setFitHeight(40);

        b1.setGraphic(foto);
        b1.setText("Guardar");
        b1.setContentDisplay(ContentDisplay.TOP);
        FileInputStream imagen1 = new FileInputStream("cruz.jpg");
        Image imagenRe1 = new Image(imagen1);
        ImageView foto1 = new ImageView(imagenRe1);
        foto1.setFitWidth(40);
        foto1.setFitHeight(40);
        b2.setGraphic(foto1);
        b2.setText("Cancelar");
        b2.setContentDisplay(ContentDisplay.TOP);

        DatePicker datePicker1=new DatePicker();
   datePicker1.setMinHeight(68);
   datePicker1.setMinWidth(100);

        VBox vBox=new VBox();
        vBox.setSpacing(10);
        FlowPane flowFotos = new FlowPane();
        flowFotos.setHgap(10);
        flowFotos.setVgap(10);
        flowFotos.setPrefWrapLength(800);

        List<String> alumnos = Arrays.asList(
                "Agustín Zazo Hugo",
                "Baltasar Méndez Liberto",
                "Brihuega García Marco",
                "Cals González Alejandro",
                "Castillo Quintanar Daniel",
                "Cazorla Asensio Víctor",
                "Corral Tejero Félix",
                "Cózar Esteban Marcos",
                "Goujón Guitérrez Diego",
                "Hernández Gómez Javier",
                "Jaén Martín Celia",
                "Moreno Jiménez Matías",
                "Pérez Mínguez Iván",
                "Pérez Navarro Alberto",
                "Ponce Plaza Sergio",
                "Pordomingo Fernández Jorge",
                "Ramos Mejías Marco",
                "Rodríguez García Mario",
                "Rodríguez Ruescas Adrián",
                "Strohush Loyish Alejandro"

        );

        int j=0;
        for(int i=0;i<alumnos.size();i++){
           if(i<9) {
               VBox vBoxFoto = crearAlumno(j + "" + (i+1) + ".jpg",alumnos.get(i));
               flowFotos.getChildren().add(vBoxFoto);


           }else {
               VBox vBoxFoto = crearAlumno((i+1)+ ".jpg",alumnos.get(i));
               flowFotos.getChildren().add(vBoxFoto);

           }

        }
        flowFotos.setHgap(50);
        flowFotos.setVgap(50);
        HBox hBox3 = new HBox();
        hBox2.setSpacing(10);
        hBox3.getChildren().addAll(l3,comboBox,datePicker1);
        hBox3.setSpacing(10);
        HBox hBox1 = new HBox();
        hBox1.getChildren().addAll(hBox3,hBox2);
        hBox1.setSpacing(180);
        vBox.getChildren().addAll(hBox1,l4,flowFotos);

        HBox hBox=new HBox();
        hBox.setSpacing(10);

        hBox.setAlignment(Pos.TOP_CENTER);
        VBox vbox2 = new VBox();
        vbox2.getChildren().add(vBox);

        vbox2.setPadding(new Insets(10));


        Scene escena=new Scene(vbox2,800,800);
        primaryStage.setScene(escena);
        primaryStage.show();

    }
    public static VBox crearAlumno(String nombreImagen, String nombre) throws FileNotFoundException {

        RadioButton rd1 = new RadioButton("I");
        RadioButton rd2 = new RadioButton("J");
        RadioButton rd3 = new RadioButton("R");


        VBox vBox=new VBox();

        FileInputStream imagen = new FileInputStream(nombreImagen);
        Image imagenRe = new Image(imagen);
        ImageView foto = new ImageView(imagenRe);
        foto.setFitWidth(75);
        foto.setFitHeight(75);
        Label l1=new Label(nombre);
        vBox.setSpacing(10);



        ToggleGroup group = new ToggleGroup();
        rd1.setToggleGroup(group);
        rd2.setToggleGroup(group);
        rd3.setToggleGroup(group);

        HBox hBoxRadioButtons = new HBox(1);

        hBoxRadioButtons.getChildren().addAll(rd1, rd2, rd3);
        vBox.setSpacing(10);
        vBox.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll(foto, l1,hBoxRadioButtons);
        vBox.setMaxSize(100,100);
        vBox.setMinSize(100,100);
        return  vBox;
    }

}
