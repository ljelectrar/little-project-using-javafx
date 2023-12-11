module com.example.workshopjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.workshopjavafx to javafx.fxml;
    exports com.example.workshopjavafx;
}