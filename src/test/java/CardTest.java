import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card; //instance variable of type Card called card

    @Before
    public void  before(){
        card = new Card(SuitType.HEARTS, RankType.QUEEN);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS, card.getSuit()); //can't compare to string anymore
    }

    @Test
    public void canGetRank(){
        assertEquals(RankType.QUEEN, card.getRank());
    }

    @Test
    public void queenHasValue10(){
        assertEquals(10, card.getValueFromEnum());
    }

//    @Test
//    public void checkCardsList(){
//        assertEquals(52, card.createDeckOfCards());
//    }

//    @Test
//    public void suitCanBeMisspelled(){
//        card = new Card("Heeaarts");
//        assertEquals("Heeaarts", card.getSuit());
//    }
//
//    @Test
//    public void suitCanBeBananas(){
//        card = new Card("Bananas");
//        assertEquals("Bananas", card.getSuit());
//    }
}
