/**
 * Program: JavaFX14_3 
 * File: JavaFX14_3.java 
 * Summary: Displays images of 3 random cards from a deck of cards
 * Author: Evan W Wilson 
 * Date: November 18, 2017
 **/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;
import java.util.ArrayList;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class JavaFX14_3 extends Application {

    @Override // Overrides the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a list of card numbers
        ArrayList <Integer> deck = getDeck();

        // Create a GridPane
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(10);
        pane.setVgap(10);

        // Add the first 3 cards as nodes to pane in first row
        for (int i = 0; i < 3; i++) {
            pane.add(new ImageView(new Image("image/card/"
               + deck.get(i) + ".png")), i, 0);
        }

        //creates a button to get new cards and adds to the pane in second row, second column
        Button button = new Button("New Cards");
        button.setOnAction(e -> start(primaryStage));
        pane.add(button, 1, 1);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("3 Random Cards"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
    
    //Returns an ArrayList with 1 through 52 in random order    
    private ArrayList <Integer> getDeck() {
        ArrayList <Integer> deck = new ArrayList<>();
        for (int i = 0; i < 52; i++) {
            deck.add(i + 1);
        }
        java.util.Collections.shuffle(deck);

        return deck;
    }
}
