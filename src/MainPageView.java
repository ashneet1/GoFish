import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.collections.FXCollections;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import javafx.scene.control.TextField;

public class MainPageView extends Pane {
    private Label label1, label2;
    private Button start, help;
    private TextField no;

    public MainPageView(){
        label1 = new Label("GO FISH");
        label1.setStyle("-fx-font: 40 arial;");
        label1.relocate(155,180);

        start = new Button("START");
        start.setStyle("-fx-font: 12 arial;");
        start.relocate(270,300);
        start.setPrefSize(100,50);

        help = new Button("HELP");
        help.setStyle("-fx-font: 12 arial;");
        help.relocate(100,300);
        help.setPrefSize(100,50);

        getChildren().addAll(label1,start,help);
        setPrefSize(500,500);

}
public Button getStartButton(){ return start;}
public Button getHelpButton() {return help;}
public int getPairs(){ // need to check if text can be an int
        return Integer.parseInt(no.getText());}



}
