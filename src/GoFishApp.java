import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.event.*;

public class GoFishApp extends Application {
    GoFish model;
    GoFishView helpView;
    public GoFishApp(){model = new GoFish();}
    public void start(Stage primaryStage) {
        Pane aPane = new Pane();

        helpView = new GoFishView(model.make_cards(10));
        aPane.getChildren().add(helpView);

        primaryStage.setTitle("GO FISH");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(aPane));
        primaryStage.show();
    }
}
