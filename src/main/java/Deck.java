import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    private ArrayList<Card> deck;
//    private Array

    public Deck() {
        this.deck = new ArrayList<Card>();
    }

    public int getSizeOfDeck() {
        return this.deck.size();
    }

    public void addCardToDeck(Card card) {
        this.deck.add(card);
    }

    public void populateDeckOfCards() {
        for (SuitType suit : SuitType.values()) {
            for (RankType rank : RankType.values()) {
                Card card = new Card(suit, rank);
                addCardToDeck(card);
            }
        }
    }

    public boolean shuffleCards(){
        populateDeckOfCards();
        ArrayList<Card> unshuffledDeck = deck;
        String unshuffledCardOne = deck.get(0).toString();
        String unshuffledCardTwo = deck.get(51).toString();
        System.out.println(unshuffledCardOne);
        System.out.println(unshuffledCardTwo);
        Collections.shuffle(deck, new Random(3));
        String shuffledCardOne = deck.get(0).toString();
        String shuffledCardTwo = deck.get(51).toString();
        System.out.println(shuffledCardOne);
        System.out.println(shuffledCardTwo);
        System.out.println(unshuffledDeck);
        if(unshuffledCardOne != shuffledCardOne && unshuffledCardTwo != shuffledCardTwo){
//        if(deck.get(0) != unshuffledDeck.get(0) && deck.get(51) != unshuffledDeck.get(51)){
            return true;
        }
        return false;
    }

//    public void populateDeckOfCards(Card card) {
//        Card[] tempDeck = card.createDeckOfCards();
//        for(int cardCount = 0; cardCount < tempDeck.length ; cardCount ++){
//            deck.add(tempDeck[cardCount]);
//        }
////        deck.add(card.createDeckOfCards())
//    }
//    SuitType[] suits = SuitType.values();
//public Bedroom findBedroom(int roomNumber) {
//    Bedroom foundRoom = null;
//    for (Bedroom bedroom : this.bedrooms) {
//        if (bedroom.getRoomNumber() == roomNumber) {
//            foundRoom = bedroom;
//        }
//    }
//    return foundRoom;
//}
}

