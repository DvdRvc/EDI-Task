package org.example.core;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.media.AudioClip;
import javafx.stage.Screen;
import javafx.stage.Stage;



public class GuiJavaFx extends Application {

    @Override
    public void start(Stage stage) {

        Label label = new Label("Aplikacija radi");

        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();


        Scene scene = new Scene(label, screenBounds.getWidth()/1.5, screenBounds.getHeight()/1.5);

        Image icon = new Image(getClass().getResourceAsStream("/images/Picture1.png"));
        stage.getIcons().add(icon);




        String soundPath = getClass()
                .getResource("/sounds/soundStart.mp3")
                .toExternalForm();

        AudioClip clip = new AudioClip(soundPath);
        clip.play();



        stage.setScene(scene);
        stage.setTitle("EDI-Task");

        stage.show();
    }
}
