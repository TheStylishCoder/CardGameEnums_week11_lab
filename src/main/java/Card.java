public class Card {

    private SuitType suit; //instance variable - no longer type string its SuitType
    private RankType rank;

    public Card(SuitType suit, RankType rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public SuitType getSuit() {
        return suit;
    }

    public RankType getRank() {
        return rank;
    }

    public int getValueFromEnum(){
        return this.rank.getValue();
    }

//    public Card[] createDeckOfCards() {
//        Card[] cards = new Card[52];
//        int index = 0;
//        for(SuitType suit : SuitType.values()){
//            this.suit = suit;
//            for(RankType rank : RankType.values()){
//                this.rank = rank;
//                cards[index] = new Card(suit, rank);
//                System.out.println(cards[index].rank + " " + cards[index].suit);
//                index ++;
//
//
//            }
//        }
//
//        return cards;
//    }
}
