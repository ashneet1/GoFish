import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.collections.FXCollections;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import javafx.scene.control.TextField;
import java.util.ArrayList;

public class GoFishView extends Pane{
    int x = 10;
    int y = 10;
    int i = 0;
    public GoFishView(ArrayList<Cards> allCards){
        CardButton[] theCards = new CardButton[allCards.size()];
        for(Cards newCard: allCards){
            theCards[i] = new CardButton(newCard,x,y);x+=25;
            getChildren().add(theCards[i]);i+=1;
            if(x >480){ x = 10;y += 35;}
    }
        setPrefSize(500,500);}
}