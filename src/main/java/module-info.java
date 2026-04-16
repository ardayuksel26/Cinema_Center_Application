module com.group15.project_3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires kernel;
    requires layout;
    requires io;
    requires javafx.swing;

    opens com.group15 to javafx.fxml;
    exports com.group15;
    exports com.group15.controllers;
    opens com.group15.controllers to javafx.fxml;
}