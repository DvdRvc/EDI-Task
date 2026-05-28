package org.example.core;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Screen;
import javafx.stage.Stage;



public class GuiJavaFx extends Application {

    @Override
    public void start(Stage stage) {

        Label label = new Label("Aplikacija radi");

        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();


        Scene scene = new Scene(label, screenBounds.getWidth()/1.5, screenBounds.getHeight()/1.5);


        stage.setScene(scene);
        stage.setTitle("EDI-Task");

        stage.show();
    }
}
