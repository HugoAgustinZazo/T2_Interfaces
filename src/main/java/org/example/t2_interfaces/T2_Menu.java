package org.example.t2_interfaces;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class T2_Menu extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {

        MenuBar menuBar = new MenuBar();

        Menu menu1 = new Menu("Menu1");
        Menu menu2 = new Menu("Menu2");
        Menu menu3 = new Menu("Menu3");

        menuBar.getMenus().addAll(menu1,menu2,menu3);

        Menu menu11 = new Menu("menu11");
        MenuItem menuItem2 = new MenuItem("menu12");
        MenuItem menuItem3 = new MenuItem("menu13");
        MenuItem menuItem4 = new MenuItem("menu14");
        SeparatorMenuItem menuItem = new SeparatorMenuItem();
        menuItem2.setDisable(true);
        FileInputStream imagen = new FileInputStream("images.jpg");
        Image image = new Image(imagen);
        ImageView i1 = new ImageView(image);
        i1.setFitWidth(20);
        i1.setFitHeight(20);
        MenuItem menuItem33 = new MenuItem("Save   Ctrl+S");
        menuItem33.setGraphic(i1);
        MenuItem menuItem11 = new MenuItem("menu111");
        MenuItem menuItem22 = new MenuItem("menu122");
        menu11.getItems().addAll(menuItem11,menuItem22,menuItem33);

        menu1.getItems().addAll(menu11,menuItem2,menuItem3,menuItem,menuItem4);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(menuBar);

        Scene scene1 = new Scene(borderPane,500,500);
        primaryStage.setScene(scene1);
        primaryStage.setTitle("T2 10 Menús-ejercicio");
        primaryStage.show();
    }
}
