import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;
    private Card card;

    @Before
    public void before(){
        deck = new Deck();
        card = new Card(SuitType.HEARTS, RankType.QUEEN);
    }

    @Test
    public void checkIfDeckIsEmpty(){
        assertEquals(0, deck.getSizeOfDeck());
    }


    @Test
    public void checkCanAddSingleCardToDeck(){
        deck.addCardToDeck(card);
        assertEquals(1, deck.getSizeOfDeck());
    }

    @Test
    public void checkIfDeckIsPopulated(){
        deck.populateDeckOfCards();
        assertEquals(52, deck.getSizeOfDeck());
    }

    @Test
    public void checkIfDeckIsShuffled(){
        deck.populateDeckOfCards();
        assertEquals(true, deck.shuffleCards());
    }
}
