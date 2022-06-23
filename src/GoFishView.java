import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import java.util.ArrayList;

public class GoFishView extends Pane {
    private int x = 10;
    private int y = 10;
    private int i = 0;
    private Button[] theCards;
    public GoFishView(ArrayList<Cards> allCards){
        theCards = new Button[allCards.size()];
        for(Cards newCard: allCards){
            theCards[i] = new Button();
            theCards[i].setPrefSize(60,50);
            theCards[i].relocate(x,y);
            theCards[i].setStyle("-fx-base: rgb(0,0,0); -fx-text-fill: rgb(0,0,0);");

            x+=80;
            getChildren().add(theCards[i]);i+=1;
            if(x >480){ x = 10;y += 55;}

    }
        setPrefSize(500,500);
    }
    public Button[] getTheCards(){
        return theCards;}

}
