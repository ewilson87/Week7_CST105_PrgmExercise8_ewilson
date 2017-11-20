/**
 * Program: JavaFX14_4 
 * File: JavaFX14_4.java 
 * Summary: Displays 5 nodes of text "JAVA" vertically in random colors
 * Author: Evan W Wilson 
 * Date: November 18, 2017
 **/

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JavaFX14_4 extends Application {

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a GridPane
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(20, 20, 20, 20));
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(10);
        pane.setVgap(10);

        // Add text to GridPane
        for (int i = 0; i < 5; i++) {
            // Crate a Text
            Text text = new Text("Java");
            text.setFont(Font.font("Times Roman", FontWeight.BOLD,
                    FontPosture.ITALIC, 22));
            //rotates text 90 degrees
            text.setRotate(90);

            // Set a random color and opacity
            text.setFill(new Color(Math.random(), Math.random(),
                    Math.random(), Math.random()));
            pane.add(text, i, 0);
        }

        //creates a button to randomize
        Button button = new Button("Randomize");
        button.setOnAction(e -> start(primaryStage));
       // button.setRotate(90);
        pane.add(button, 5, 0);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 450, 100);
        primaryStage.setTitle("Java is FUN"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}
