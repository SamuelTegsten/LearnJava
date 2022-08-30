package Course1027.Task1;

import Course1027.Föreläsning2.Card;

public class ECard {

    public enum Rank {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, BISHOP, QUEEN, KING};
    public enum Suit {HEARTS, SPADES, DIAMONDS, CLUBS};


    private Rank rank;
    private Suit suit;

    public ECard(Rank rank , Suit suit){
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank.ordinal();
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return " ECard { " +
                " suit = " + suit +
                ", rank = " + rank +
                '}';
    }
}
