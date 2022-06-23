import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.event.*;

import java.awt.event.ActionListener;

public class GoFishApp extends Application {
    GoFish model;
    HelpView helpView;
    GoFishView goFishView;
    MainPageView mainPageView;

    public GoFishApp(){
        model = new GoFish();
        mainPageView = new MainPageView();
        helpView = new HelpView();
        goFishView = new GoFishView(model.make_cards());
        }
    public void start(Stage primaryStage) {
        Pane mainPane = new Pane();
        mainPane.getChildren().add(mainPageView);
        Scene sceneMain = new Scene(mainPane);

        Pane helpPane = new Pane();
        helpPane.getChildren().add(helpView);
        Scene sceneHelp = new Scene(helpPane);

        Pane goFishPane = new Pane();
        goFishPane.getChildren().add(goFishView);
        Scene sceneFish = new Scene(goFishPane);

        primaryStage.setScene(sceneMain);
        mainPageView.getHelpButton().setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                primaryStage.setScene(sceneHelp);
            }
        });
        helpView.getBackButton().setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                primaryStage.setScene(sceneMain);
            }
        });
        mainPageView.getStartButton().setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                    primaryStage.setScene(sceneFish);
            }
        });
        goFishView.getTheCards()[0].setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent){

            }
        });



        primaryStage.setTitle("GO FISH");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
