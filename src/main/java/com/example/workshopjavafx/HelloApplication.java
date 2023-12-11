package com.example.workshopjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        ScrollPane scrollPane = fxmlLoader.load();
        Scene mainScene = new Scene(scrollPane);

        scrollPane.setFitToHeight(true);
        scrollPane.setFitToWidth(true);

        stage.setTitle("Hello!");
        stage.setScene(mainScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}