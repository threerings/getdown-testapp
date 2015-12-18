package com.threerings.testapp;

import java.io.File;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import com.threerings.getdown.util.LaunchUtil;

public class TestApp extends Application {

    public static void main (String[] args) {
        // if we have our appdir, launch a background thread that checks whether to upgrade getdown
        if (args.length > 0) {
            final File appdir = new File(args[0]);
            new Thread() {
                @Override public void run () {
                    LaunchUtil.upgradeGetdown(new File(appdir, "getdown-old.jar"),
                                              new File(appdir, "getdown.jar"),
                                              new File(appdir, "getdown-new.jar"));
                }
            }.start();
        }

        // launch the main JavaFX app
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
