/**
 * Program: JavaFX14_6 
 * File: JavaFX14_6.java 
 * Summary: Displays a checkerboard
 * Author: Evan W Wilson 
 * Date: November 18, 2017
 **/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;

public class JavaFX14_6 extends Application {

    @Override // Override the start method in the application class
    public void start(Stage primaryStage) {
        
        // Create a GridPane
        GridPane pane = new GridPane();

        // Create 64 squares and add to the pane in rows of 8
        int count = 0;
        for (int i = 0; i < 8; i++) {
            count++;
            for (int j = 0; j < 8; j++) {
                Rectangle square = new Rectangle(75, 75, 75, 75);
                
                //sets colors
                if (count % 2 == 0)
                    square.setFill(Color.WHITE);
                else square.setFill(Color.BLACK);
                
                pane.add(square, i, j);
                count++;
            }
        }

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Checkerboard"); // Set the stage title
        primaryStage.setScene(scene); // Place scene in the stage
        primaryStage.show(); // Display the stage;
    }
}
