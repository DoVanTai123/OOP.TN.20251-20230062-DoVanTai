module com.hust.kstn.javafx.guiproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.hust.kstn.javafx.guiproject to javafx.fxml;
    exports com.hust.kstn.javafx.guiproject;
}