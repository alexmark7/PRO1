package session17_javafx.yourfirstbutton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RunApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label = new Label("Hello, World!");

        Button moonButton = new Button("Set Moon!");
        moonButton.setOnAction(event -> label.setText("Hello, Moon!"));

        Button sunButton = new Button("Set Sun!");
        sunButton.setOnAction(event -> label.setText("Hello, Sun!"));

        VBox box = new VBox(label, moonButton, sunButton);
        Scene scene = new Scene(box);
        primaryStage.setScene(scene);
        primaryStage.setHeight(400);
        primaryStage.setWidth(400);

        primaryStage.setMinWidth(400);
        primaryStage.setMinHeight(300);
        primaryStage.setTitle("My Application");
        primaryStage.setOnCloseRequest(event -> System.exit(0));

        primaryStage.show();
    }
}
