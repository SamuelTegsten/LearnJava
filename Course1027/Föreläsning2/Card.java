package Course1027.Föreläsning2;

public class Card {

    public enum Rank {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, BISHOP, QUEEN, KING};
    public enum Suit {HEARTS, SPADES, DIAMONDS, CLUBS};

    private Rank rank;
    private Suit suit;

    public Card(Rank rank ,Suit suit){
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return " Card { " +
                " suit = " + suit +
                ", rank = " + rank +
                '}';
    }
}
