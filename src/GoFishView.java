import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import java.util.ArrayList;

public class GoFishView extends Pane {
    private int x = 10;
    private int y = 10;
    private int i = 0;
    private Button[] theCards;
    private Label points, chances;
    public GoFishView(GoFish model){
        points = new Label(String.valueOf(model.getPlayer().get_points()));
        points.relocate(30,350);
        points.setPrefSize(200,25);

        chances = new Label(String.valueOf(model.getPlayer().get_chances()));
        chances.relocate(90,350);
        chances.setPrefSize(110,25);
        getChildren().addAll(points,chances);


        setPrefSize(500,500);
        theCards = new Button[model.getAllCards().size()];
        for(Cards newCard: model.getAllCards()){
            //need to randomize location of cards
            theCards[i] = new Button();
            theCards[i].setPrefSize(60,50);
            theCards[i].relocate(x,y);

            x+=80;
            getChildren().add(theCards[i]);i+=1;
            if(x >480){ x = 10;y += 55;}
        }
    }


    public void update(GoFish model) {
        x = 10;
        y = 10;
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
        }
    }
    public Button[] getTheCards(){
        return theCards;}

}
