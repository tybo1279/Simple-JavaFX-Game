import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.application.Platform;
import javafx.geometry.Pos;
import java.util.Random;

public class DessertGame extends Application {

  private int score;
  
    @Override
    public void start(final Stage stage) {
        // Step 1 & 2
        this.score = 0;
        BorderPane borderPane = new BorderPane();
        Scene scene = new Scene(borderPane, 640, 480);
        stage.setTitle("Dessert in the Desert JavaFX Game");
        
        // Step 3
        Label scoreLabel = new Label("Score: 0");
        borderPane.setTop(scoreLabel);
        BorderPane.setAlignment(scoreLabel, Pos.TOP_LEFT);

        Button exitButton = new Button("Exit");
        exitButton.setOnAction(event -> {
            Platform.exit();
        });
        borderPane.setBottom(exitButton);
        BorderPane.setAlignment(exitButton, Pos.BOTTOM_RIGHT);
        
        // Step 4
        Button[] array = new Button[8];
        Button dessert = new Button("Dessert");
        array[0] = dessert;
        Button desert1 = new Button("Desert");
        array[1] = desert1;
        Button desert2 = new Button("Desert");
        array[2] = desert2;
        Button desert3 = new Button("Desert");
        array[3] = desert3;
        Button desert4 = new Button("Desert");
        array[4] = desert4;
        Button desert5 = new Button("Desert");
        array[5] = desert5;
        Button desert6 = new Button("Desert");
        array[6] = desert6;
        Button desert7 = new Button("Desert");
        array[7] = desert7;
        dessert.setOnMouseClicked(event -> { 
          randomizeButtonPositions(new Random(), array);
          score += 1;
          Label scoreLabelNew = new Label("Score: " + score);
          borderPane.setTop(scoreLabelNew);
          BorderPane.setAlignment(scoreLabelNew, Pos.TOP_LEFT);
          exitButton.requestFocus();
          });
        desert1.setOnMouseClicked(event -> { 
          randomizeButtonPositions(new Random(), array);
          score -= 1;
          Label scoreLabelNew = new Label("Score: " + score);
          borderPane.setTop(scoreLabelNew);
          BorderPane.setAlignment(scoreLabelNew, Pos.TOP_LEFT);
          exitButton.requestFocus();
          });
        desert2.setOnMouseClicked(event -> { 
          randomizeButtonPositions(new Random(), array);
          score -= 1;
          Label scoreLabelNew = new Label("Score: " + score);
          borderPane.setTop(scoreLabelNew);
          BorderPane.setAlignment(scoreLabelNew, Pos.TOP_LEFT);
          exitButton.requestFocus();
          });
        desert3.setOnMouseClicked(event -> { 
          randomizeButtonPositions(new Random(), array);
          score -= 1;
          Label scoreLabelNew = new Label("Score: " + score);
          borderPane.setTop(scoreLabelNew);
          BorderPane.setAlignment(scoreLabelNew, Pos.TOP_LEFT);
          exitButton.requestFocus();
          });
        desert4.setOnMouseClicked(event -> { 
          randomizeButtonPositions(new Random(), array);
          score -= 1;
          Label scoreLabelNew = new Label("Score: " + score);
          borderPane.setTop(scoreLabelNew);
          BorderPane.setAlignment(scoreLabelNew, Pos.TOP_LEFT);
          exitButton.requestFocus();
          });
        desert5.setOnMouseClicked(event -> { 
          randomizeButtonPositions(new Random(), array);
          score -= 1;
          Label scoreLabelNew = new Label("Score: " + score);
          borderPane.setTop(scoreLabelNew);
          BorderPane.setAlignment(scoreLabelNew, Pos.TOP_LEFT);
          exitButton.requestFocus();
          });
        desert6.setOnMouseClicked(event -> { 
          randomizeButtonPositions(new Random(), array);
          score -= 1;
          Label scoreLabelNew = new Label("Score: " + score);
          borderPane.setTop(scoreLabelNew);
          BorderPane.setAlignment(scoreLabelNew, Pos.TOP_LEFT);
          exitButton.requestFocus();
          });
        desert7.setOnMouseClicked(event -> { 
          randomizeButtonPositions(new Random(), array);
          score -= 1;
          Label scoreLabelNew = new Label("Score: " + score);
          borderPane.setTop(scoreLabelNew);
          BorderPane.setAlignment(scoreLabelNew, Pos.TOP_LEFT);
          exitButton.requestFocus();
          });
        Pane pane = new Pane(dessert, desert1, desert2, desert3, desert4, desert5, desert6, desert7);
        borderPane.setCenter(pane);
        BorderPane.setAlignment(pane, Pos.CENTER);
        
        stage.setScene(scene);
        randomizeButtonPositions(new Random(), array);
        exitButton.requestFocus();
        stage.show();
    }
    
    private void randomizeButtonPositions(Random rand, Button[] buttons) {
      for (int i = 0; i < buttons.length; ++i) {
        buttons[i].setLayoutX(rand.nextInt(600));
        buttons[i].setLayoutY(rand.nextInt(400));
      }
    }

    public static void main(String[] args) {
        Application.launch();
    }
}
