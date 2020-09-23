package org.openjfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

/**
 * JavaFX App
 */
public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws IOException {
        URL a=Main.class.getResource("interf.fxml");
        System.out.println(a);
        FXMLLoader loader = new FXMLLoader(a);
        System.out.println(loader);
        AnchorPane root = loader.load();
        Scene scene = new Scene(root, 750, 450);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }


}
