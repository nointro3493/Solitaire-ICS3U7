import java.util.Arrays;
import java.util.List;


public class CardObject {
	private String CardFace;
	private String CardSuit;

	public CardObject(String CardFace1, String CardCardSuit1) {
		CardFace = CardFace1;
		CardSuit = CardCardSuit1;
	}

	public String getCardFace() {
		return CardFace;
	}

	public static List<String> getValidCardFaces(){
		return Arrays.asList("2", "3", "4", "5", "6", "7","8", "9", "10", "jack", "queen", "king", "ace");
	}
	
	//Not detecting Valid CardFaces for some reason

	public void setCardFace(String CardFace) {
        List<String> validCardFaces = getValidCardFaces();
        CardFace = CardFace.toLowerCase();

        if (validCardFaces.contains(CardFace))
            this.CardFace = CardFace;
        else
            throw new IllegalArgumentException("Valid face names are: "+
                            validCardFaces);
    }

	public String getCardSuitName() {
		return CardSuit;
	}
	
	public static List<String> getValidCardSuitNames(){
		return Arrays.asList("Hearts", "Spades", "Clovers", "Diamonds");
	}
	
	public void setCardSuit(String CardSuit) {
        List<String> validCardSuits = getValidCardSuitNames();
        CardSuit = CardSuit.toLowerCase();

        if (validCardSuits.contains(CardSuit))
            this.CardSuit = CardSuit;
        else
            throw new IllegalArgumentException("valid CardSuits are: " + validCardSuits);
	}

	public String toString() {
		return String.format("%s of %s", CardFace, CardSuit);
	}

}
