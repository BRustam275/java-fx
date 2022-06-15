package ru.gb.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Dialog;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application{
    static Stage mainStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        mainStage = primaryStage;
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("main-view.fxml")));
        primaryStage.setTitle("Сетевой чат 1.0.0");
        primaryStage.setScene(new Scene(root, 350, 700));
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
