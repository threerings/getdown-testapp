package com.threerings.testapp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TestApp extends Application {

    public static void main (String[] args) {
        launch(args);
    }

    @Override public void start (Stage primaryStage) {
        primaryStage.setTitle("Getdown Test App");
        Button btn = new Button();
        btn.setText("Hello Test App");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle (ActionEvent event) {
                System.out.println("Hello programmer!");
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 640, 480));
        primaryStage.show();
    }
}
