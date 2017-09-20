package Chapter7_OODesign.Q1DeckOfCards;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck;

    protected Deck(){
        deck = new ArrayList<>();
        for(Suit s : Suit.values()){
            for(Rank r : Rank.values()){
                deck.add(new Card(s,r));
            }
        }
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public void print(){
        for(Card card : deck){
            System.out.println(card);
        }
    }

    public void shuffle(){
        Collections.shuffle(deck);
    }


}
