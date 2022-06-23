import java.util.ArrayList;

public class GoFish {

    private ArrayList<Cards> allCards;
    private String[] typeCard;
    private Player one;
    private int cardsUp;

    public GoFish() {
        allCards = new ArrayList<Cards>();
        typeCard = new String[]{ "King","Queen","Jack","1","2","3","4","5","6","7","8","9","10" };
        one = new Player("Name");
        cardsUp = 0;
    }
    public ArrayList<Cards> make_cards(){
        for (int i = 0; i < 10; i++) {
            int no = (int) Math.floor(Math.random() * typeCard.length);
            Cards aCard = new Cards(typeCard[no]);
            Cards bCard = new Cards(typeCard[no]);
            allCards.add(aCard);
            allCards.add(bCard);
        }
        return allCards;
    }
    public void addCardsUpp(){ cardsUp +=1;}
    public void setCardsUp(){ cardsUp= 0;}
    public int getCardsUp(){return cardsUp;}

    public Player getPlayer(){ return one;}


}
