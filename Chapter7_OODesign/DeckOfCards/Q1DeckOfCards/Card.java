package Chapter7OODesign.DeckOfCards.Q1DeckOfCards;

enum Suit{
    SPADE(0), DIAMOND(1), CLUB(2), HEART(3);
    private int value;

    Suit(int v) {
        value = v;
    }

    public int getValue() {
        return value;
    }

    public Suit suitFromValue(int value){
        switch(value) {
            case 0:
                return Suit.SPADE;
            case 1:
                return Suit.DIAMOND;
            case 2:
                return Suit.CLUB;
            case 3:
                return Suit.HEART;
            default:
                return null;
        }

    }

};
enum Rank{ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING };

public class Card {
    private Suit suit;
    private Rank rank;

    protected Card(Suit s, Rank r){
        this.suit = s;
        this.rank = r;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

}
