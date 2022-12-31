import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.event.*;
//to do:
//need to fix system of the cards
//need to add instructions to help view

public class GoFishApp extends Application {
    GoFish model;
    HelpView helpView;
    GoFishView goFishView;
    MainPageView mainPageView;


    public GoFishApp(){
        model = new GoFish();
        mainPageView = new MainPageView();
        helpView = new HelpView();
        model.make_cards();
        goFishView = new GoFishView(model);

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
            public void handle(ActionEvent actionEvent) {
                goFishView.update(model);
                if(model.getUp1() == -1 & model.getUp2()==-1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[0].setText(model.getAllCards().get(0).toString());
                    model.setUp1(0);
                }else if(model.getUp1() != 0 & model.getUp2() == -1){
                    System.out.print(1);
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[0].setText(model.getAllCards().get(0).toString());
                    model.setUp2(0);
                }

            }
        });

        goFishView.getTheCards()[1].setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                goFishView.update(model);
                if(model.getUp1() == -1 & model.getUp2()==-1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[1].setText(model.getAllCards().get(1).toString());
                    model.setUp1(1);
                }else if(model.getUp1() != 1 & model.getUp2() == -1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[1].setText(model.getAllCards().get(1).toString());
                    model.setUp2(1);
                }

            }
        });
        goFishView.getTheCards()[2].setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                goFishView.update(model);
                if(model.getUp1() == -1 & model.getUp2()==-1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[2].setText(model.getAllCards().get(2).toString());
                    model.setUp1(2);

                }else if(model.getUp1() != 2 & model.getUp2() == -1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[2].setText(model.getAllCards().get(2).toString());
                    model.setUp2(2);
                }
            }
        });
        goFishView.getTheCards()[3].setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                goFishView.update(model);
                if(model.getUp1() == -1 & model.getUp2()==-1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[3].setText(model.getAllCards().get(3).toString());
                    model.setUp1(3);

                }else if(model.getUp1() != 3 & model.getUp2() == -1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[3].setText(model.getAllCards().get(3).toString());
                    model.setUp2(3);
                }
            }
        });
        goFishView.getTheCards()[4].setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                goFishView.update(model);
                if(model.getUp1() == -1 & model.getUp2()==-1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[4].setText(model.getAllCards().get(4).toString());
                    model.setUp1(4);

                }else if(model.getUp1() != 4 & model.getUp2() == -1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[4].setText(model.getAllCards().get(4).toString());
                    model.setUp2(4);
                }
            }
        });
        goFishView.getTheCards()[5].setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                goFishView.update(model);
                if(model.getUp1() == -1 & model.getUp2()==-1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[5].setText(model.getAllCards().get(5).toString());
                    model.setUp1(5);

                }else if(model.getUp1() != 5 & model.getUp2() == -1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[5].setText(model.getAllCards().get(5).toString());
                    model.setUp2(5);
                }
            }
        });
        goFishView.getTheCards()[6].setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                goFishView.update(model);
                if(model.getUp1() == -1 & model.getUp2()==-1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[6].setText(model.getAllCards().get(6).toString());
                    model.setUp1(6);

                }else if(model.getUp1() != 6 & model.getUp2() == -1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[6].setText(model.getAllCards().get(6).toString());
                    model.setUp2(6);
                }
            }
        });
        goFishView.getTheCards()[7].setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                goFishView.update(model);
                if(model.getUp1() == -1 & model.getUp2()==-1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[7].setText(model.getAllCards().get(7).toString());
                    model.setUp1(7);

                }else if(model.getUp1() != 7 & model.getUp2() == -1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[7].setText(model.getAllCards().get(7).toString());
                    model.setUp2(7);
                }
            }
        });
        goFishView.getTheCards()[8].setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                goFishView.update(model);
                if(model.getUp1() == -1 & model.getUp2()==-1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[8].setText(model.getAllCards().get(8).toString());
                    model.setUp1(8);
                }else if(model.getUp1() != 8 & model.getUp2() == -1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[8].setText(model.getAllCards().get(8).toString());
                    model.setUp2(8);
                }
            }
        });
        goFishView.getTheCards()[9].setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                goFishView.update(model);
                if(model.getUp1() == -1 & model.getUp2()==-1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[9].setText(model.getAllCards().get(9).toString());
                    model.setUp1(9);

                }else if(model.getUp1() != 9 & model.getUp2() == -1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[9].setText(model.getAllCards().get(9).toString());
                    model.setUp2(9);
                }
            }
        });
        goFishView.getTheCards()[10].setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                goFishView.update(model);
                if(model.getUp1() == -1 & model.getUp2()==-1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[10].setText(model.getAllCards().get(10).toString());
                    model.setUp1(10);

                }else if(model.getUp1() != 10 & model.getUp2() == -1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[10].setText(model.getAllCards().get(10).toString());
                    model.setUp2(10);
                }
            }
        });
        goFishView.getTheCards()[11].setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                goFishView.update(model);
                if(model.getUp1() == -1 & model.getUp2()==-1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[11].setText(model.getAllCards().get(11).toString());
                    model.setUp1(11);

                }else if(model.getUp1() != 11 & model.getUp2() == -1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[11].setText(model.getAllCards().get(11).toString());
                    model.setUp2(11);
                }
            }
        });
        goFishView.getTheCards()[12].setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                goFishView.update(model);
                if(model.getUp1() == -1 & model.getUp2()==-1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[12].setText(model.getAllCards().get(12).toString());
                    model.setUp1(12);

                }else if(model.getUp1() != 12 & model.getUp2() == -1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[12].setText(model.getAllCards().get(12).toString());
                    model.setUp2(12);
                }goFishView.update(model);
            }
        });
        goFishView.getTheCards()[13].setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                goFishView.update(model);
                if(model.getUp1() == -1 & model.getUp2()==-1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[13].setText(model.getAllCards().get(13).toString());
                    model.setUp1(13);

                }else if(model.getUp1() != 13 & model.getUp2() == -1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[13].setText(model.getAllCards().get(13).toString());
                    model.setUp2(13);
                }goFishView.update(model);
            }
        });
        goFishView.getTheCards()[14].setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                goFishView.update(model);
                if(model.getUp1() == -1 & model.getUp2()==-1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[14].setText(model.getAllCards().get(14).toString());
                    model.setUp1(14);

                }else if(model.getUp1() != 14 & model.getUp2() == -1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[14].setText(model.getAllCards().get(14).toString());
                    model.setUp2(14);
                }goFishView.update(model);
            }
        });
        goFishView.getTheCards()[15].setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                goFishView.update(model);
                if(model.getUp1() == -1 & model.getUp2()==-1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[15].setText(model.getAllCards().get(5).toString());
                    model.setUp1(15);

                }else if(model.getUp1() != 15 & model.getUp2() == -1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[15].setText(model.getAllCards().get(5).toString());
                    model.setUp2(15);
                }goFishView.update(model);
            }
        });
        goFishView.getTheCards()[16].setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                goFishView.update(model);
                if(model.getUp1() == -1 & model.getUp2()==-1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[16].setText(model.getAllCards().get(5).toString());
                    model.setUp1(16);

                }else if(model.getUp1() != 16 & model.getUp2() == -1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[16].setText(model.getAllCards().get(5).toString());
                    model.setUp2(16);
                }goFishView.update(model);
            }
        });
        goFishView.getTheCards()[17].setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                goFishView.update(model);
                if(model.getUp1() == -1 & model.getUp2()==-1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[17].setText(model.getAllCards().get(5).toString());
                    model.setUp1(17);

                }else if(model.getUp1() != 17 & model.getUp2() == -1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[17].setText(model.getAllCards().get(17).toString());
                    model.setUp2(17);
                }goFishView.update(model);
            }
        });
        goFishView.getTheCards()[18].setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                goFishView.update(model);
                if(model.getUp1() == -1 & model.getUp2()==-1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[18].setText(model.getAllCards().get(18).toString());
                    model.setUp1(18);

                }else if(model.getUp1() != 18 & model.getUp2() == -1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[18].setText(model.getAllCards().get(18).toString());
                    model.setUp2(18);
                }goFishView.update(model);
            }
        });
        goFishView.getTheCards()[19].setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                goFishView.update(model);
                if(model.getUp1() == -1 & model.getUp2()==-1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[19].setText(model.getAllCards().get(19).toString());
                    model.setUp1(19);

                }else if(model.getUp1() != 19 & model.getUp2() == -1){
                    goFishView.setStyle("-fx-base: rgb(250,250,250); -fx-text-fill: rgb(0,0,0);");
                    goFishView.getTheCards()[19].setText(model.getAllCards().get(19).toString());
                    model.setUp2(19);
                }
            }
        });
        primaryStage.setTitle("GO FISH");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
