package org.example.t2_interfaces;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class T2_InterfazInbtellij extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {

        MenuBar menuBar = new MenuBar();

        Menu menu1 = new Menu("File");
        Menu menu2 = new Menu("Edit");
        Menu menu3 = new Menu("View");
        Menu menu4 = new Menu("Navigate");
        Menu menu5 = new Menu("Code");
        Menu menu6 = new Menu("Refactor");
        Menu menu7 = new Menu("Build");
        Menu menu8 = new Menu("Run");
        Menu menu9 = new Menu("Tools");
        Menu menu10 = new Menu("VCS");
        Menu menu11 = new Menu("Window");
        Menu menu12 = new Menu("Help");

        menuBar.getMenus().addAll(menu1,menu2,menu3,menu4, menu5, menu6, menu7, menu8, menu9, menu10, menu11,menu12);

        Menu nuevo = new Menu("_New");
        MenuItem menuItem2 = new MenuItem("O_pen");
        Menu menuItem3 = new Menu("R_ecent Projects");
        MenuItem menuItem4 = new MenuItem("Close Projects");
        MenuItem menuItem5 = new MenuItem("Close All Projects");
        MenuItem menuItem6 = new MenuItem("Close Other Projects");
        SeparatorMenuItem menuItem = new SeparatorMenuItem();
        MenuItem ajuste = new MenuItem("Settings");
        ajuste.setAccelerator(KeyCombination.keyCombination("Ctrl+Alt+S"));
        MenuItem struct = new MenuItem("Project Structure");
        struct.setAccelerator(KeyCombination.keyCombination("Ctrl+Alt+shift+S"));
        Menu prop = new Menu("File Propierties");
        SeparatorMenuItem menuItemSep = new SeparatorMenuItem();
        Menu local = new Menu("LocalHistory");
        SeparatorMenuItem menuItemSep2 = new SeparatorMenuItem();
        MenuItem menuItem51 = new MenuItem("Save All");
        menuItem51.setAccelerator(KeyCombination.keyCombination("Ctrl+S"));
        MenuItem menuItem61 = new MenuItem("Reload All from Disk");
        menuItem61.setAccelerator(KeyCombination.keyCombination("Ctrl+ALt+Y"));
        MenuItem nuevo2 = new MenuItem("Repair IDE");
        MenuItem menuItem23 = new MenuItem("Invalidate Caches...");
        SeparatorMenuItem menuItemSep3 = new SeparatorMenuItem();
        Menu menuItem31 = new Menu("Manage IDE Settings ");
        Menu menuItem41 = new Menu("New Projects Setup");
        MenuItem menuItem52 = new MenuItem("Save File as Template...");
        SeparatorMenuItem menuItemSep4 = new SeparatorMenuItem();
        Menu menuItem62 = new Menu("Export");
        MenuItem menuItem63 = new MenuItem("Print...");
        SeparatorMenuItem menuItemSep5 = new SeparatorMenuItem();
        MenuItem menuItem632 = new MenuItem("Power Save Mode");
        SeparatorMenuItem menuItemSep6 = new SeparatorMenuItem();
        MenuItem menuItem631 = new MenuItem("Exit");
        /////////////////////////////////////////////////////////////////
        MenuItem menuItem48 = new MenuItem("Project...");
        MenuItem menuItem58 = new MenuItem("Project from Existing Sources...");
        MenuItem menuItem68 = new MenuItem("Projects from Version Control...");
        MenuItem menuItem46 = new MenuItem("Module...");
        MenuItem menuItem55 = new MenuItem("Module from Existings Sources...");
        MenuItem menuItem69 = new MenuItem("Java Class");
        MenuItem menuItem45 = new MenuItem("Kotlin Class/File");
        MenuItem menuItem59 = new MenuItem("File");
        MenuItem menuItem66 = new MenuItem("Scratch File");
        menuItem66.setAccelerator(KeyCombination.keyCombination("Ctrl+Alt+shift+Insertar"));
        MenuItem menuItem44 = new MenuItem("Package");
        MenuItem menuItem54 = new MenuItem("FXML File");
        MenuItem menuItem65 = new MenuItem("JavaFX Application");
        MenuItem menuItem43 = new MenuItem("package-info.java");
        MenuItem menuItem56 = new MenuItem("module-info.java");
        menuItem56.setDisable(true);
        MenuItem menuItem67 = new MenuItem("HTML File");
        MenuItem menuItem42 = new MenuItem("Resource Bundle");
        MenuItem menuItem50 = new MenuItem("Editor Config File");
        Menu menuItem60 = new Menu("Swing UI Designer");
        MenuItem menuItem70 = new MenuItem("GUI Form");
        MenuItem menuItem71 = new MenuItem("Create Dialog Class");
        SeparatorMenuItem menuItemSep8 = new SeparatorMenuItem();
        SeparatorMenuItem menuItemSep9 = new SeparatorMenuItem();
        SeparatorMenuItem menuItemSep10 = new SeparatorMenuItem();

        imagen(menuItem2,"carpeta.jpg");
        imagen(ajuste,"ajustes.jpg");
        imagen(struct,"carpeta.jpg");
        imagen(menuItem51,"guardar.jpg");
        imagen(menuItem61,"recargar.jpg");
        imagen(menuItem63,"impresora.jpg");
        imagen(menuItem42,"ajustes.jpg");
        imagen(menuItem50,"ajustes.jpg");
        imagen(menuItem60,"ventana.jpg");
        imagen(menuItem44,"carpeta.jpg");
        imagen(menuItem70,"ventana.jpg");
        imagen(menuItem71,"ventana.jpg");
        imagen(menuItem69,"c.jpg");
        imagen(menuItem45,"kot.jpg");
        imagen(menuItem59,"ar.jpg");
        imagen(menuItem66,"ar.jpg");
        imagen(menuItem65,"c.jpg");
        imagen(menuItem54,"eti.jpg");
        imagen(menuItem67,"ht.jpg");
        imagen(menuItem56,"taza.jpg");
        imagen(menuItem43,"taza.jpg");




        menuItem60.getItems().addAll(menuItem70,menuItem71);
        nuevo.getItems().addAll(menuItem48 , menuItem58 ,menuItem68 ,menuItemSep8, menuItem46, menuItem55,menuItemSep9 , menuItem69 ,menuItem45 , menuItem59 , menuItem66 ,menuItem44 ,menuItem54 , menuItem65, menuItem43 , menuItem56,menuItemSep10 ,menuItem67 ,menuItem42 , menuItem50 , menuItem60);

        menu1.getItems().addAll(nuevo,menuItem2,menuItem3,menuItem4,menuItem5,menuItem6,menuItem,ajuste,struct ,prop , menuItemSep ,local , menuItemSep2 , menuItem51, menuItem61,nuevo2 , menuItem23, menuItemSep3, menuItem31 ,menuItem41 , menuItem52 , menuItemSep4, menuItem62,menuItem63 , menuItemSep5,menuItem632,menuItemSep6, menuItem631);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(menuBar);

        Scene scene1 = new Scene(borderPane,800,800);
        primaryStage.setScene(scene1);
        primaryStage.setTitle("T2 10 Menús-ejercicio");
        primaryStage.show();
    }
    public static void imagen(MenuItem menuItem, String imagen) throws FileNotFoundException {
        FileInputStream imagen2 = new FileInputStream(imagen);
        Image image2 = new Image(imagen2);
        ImageView i12 = new ImageView(image2);
        i12.setFitWidth(20);
        i12.setFitHeight(20);
        menuItem.setGraphic(i12);
    }
}
