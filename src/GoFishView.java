import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import java.util.ArrayList;
import java.util.Random;

public class GoFishView extends Pane {
    boolean containsX;
    boolean containsY;
    private int b = 20;
    private int y=0;
    private int c = 0;
    private Button[] theCards;
    private Label points, chances, pointsLb, chancesLb, winLabel, loseLabel;
    public ArrayList<Integer> xCoordinates;
    public ArrayList<Integer> yCoordinates;
    public GoFishView(GoFish model){
        containsX = true;
        containsY = true;
        Random rand = new Random();
        xCoordinates = new ArrayList<Integer>();
        for(int j = 0; j<3;j++) {
            for (int i = 0; i < 480; i = i + 70) {
                xCoordinates.add(i);
            }
        }
        yCoordinates = new ArrayList<Integer>();

        for(int k = 0; k<190;k+=60) {
            for (int l = 0; l < 7; l++) {
                yCoordinates.add(k);
            }
        }

        pointsLb = new Label("Points");
        pointsLb.relocate(25,325);
        points = new Label(String.valueOf(model.getPlayer().get_points()));
        points.relocate(30,350);
        points.setPrefSize(200,25);

        chancesLb = new Label("Chances");
        chancesLb.relocate(85,325);
        chances = new Label(String.valueOf(model.getPlayer().get_chances()));
        chances.relocate(90,350);
        chances.setPrefSize(110,25);

        winLabel = new Label("You Win!");
        winLabel.relocate(120,325);
        winLabel.setPrefSize(200,200);
        winLabel.setVisible(false);

        loseLabel = new Label("You Lose :(");
        loseLabel.relocate(120,325);
        loseLabel.setPrefSize(200,200);
        loseLabel.setVisible(false);

        getChildren().addAll(pointsLb,points,chancesLb,chances, winLabel,loseLabel);

        setPrefSize(500,500);
        theCards = new Button[model.getAllCards().size()];
        for(Cards newCard: model.getAllCards()){
            containsX = true;
            containsY = true;
            //randomizes location of cards
            theCards[c] = new Button();
            theCards[c].setPrefSize(60,50);
            int rando = rand.nextInt(0,b);
            theCards[c].relocate(xCoordinates.get(rando),yCoordinates.get(rando));
            xCoordinates.remove(rando);
            yCoordinates.remove(rando);
            b-=1;
            getChildren().add(theCards[c]);
            c+=1;
        }
    }

    public void update(GoFish model) {
        if(model.getUp1() != -1 & model.getUp2() != -1) {
            if (theCards[model.getUp1()].getText() == theCards[model.getUp2()].getText()) {
                model.getPlayer().add_points();
                System.out.print(" Points: "+model.getPlayer().get_points());
                theCards[model.getUp1()].setDisable(true);
                theCards[model.getUp2()].setDisable(true);
                model.setUp1(-1);
                model.setUp2(-1);
                points.setText(String.valueOf(model.getPlayer().get_points()));
                chances.setText(String.valueOf(model.getPlayer().get_chances()));
            }else{
                //need to fix this
                System.out.print("Card up: " + theCards[model.getUp1()].getText());
                System.out.print("Card up: " + theCards[model.getUp2()].getText());
                System.out.print(" Points: "+model.getPlayer().get_points());
                model.getPlayer().decrease_chances();
                theCards[model.getUp1()].setText("");
                theCards[model.getUp2()].setText("");
                model.setUp1(-1);
                model.setUp2(-1);
                points.setText(String.valueOf(model.getPlayer().get_points()));
                chances.setText(String.valueOf(model.getPlayer().get_chances()));
            }
        }
        if(model.getPlayer().get_chances() == 0){
            System.out.println(" Points: "+model.getPlayer().get_points());
            System.out.println("Game has ended!");
            for(Button card: theCards){
                card.setDisable(true);
            }
            loseLabel.setVisible(true);
        }else if(model.getPlayer().get_points() >= 10){
            for(Button card: theCards){
                card.setDisable(true);
            }
            winLabel.setVisible(true);
        }
    }
    public Button[] getTheCards(){
        return theCards;}
}
