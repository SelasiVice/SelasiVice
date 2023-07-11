module com.example.selasivice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.selasivice to javafx.fxml;
    exports com.example.selasivice;
    exports com.example.selasivice.controller;
    opens com.example.selasivice.controller to javafx.fxml;
}