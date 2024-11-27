module org.example.t2_interfaces {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.t2_interfaces to javafx.fxml;
    exports org.example.t2_interfaces;
}