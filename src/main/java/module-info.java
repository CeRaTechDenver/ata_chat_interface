module com.ceratech.chatserver {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ceratech.chatserver to javafx.fxml;
    exports com.ceratech.chatserver;
}