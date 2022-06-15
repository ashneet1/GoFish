

public class Cards {
    String type;
    Boolean showingType;
     public Cards(String initType){
         type = initType;
         showingType = false;
     }
     public void set_show(boolean show){showingType = show;}
    public String toString() {
        return type;
    }
}
