public enum RankType {
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10); //semi colon after last when using a value

    private final int value; //final because it wont change, value is the name

    RankType(int value){
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    SuitType[] suits = SuitType.values(); //can get all the values nd loop through them in an array
}
