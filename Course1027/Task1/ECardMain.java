package Course1027.Task1;

import Course1027.Föreläsning2.Card;

public class ECardMain {
    public static void main(String[] args){

        ECard c1 = new ECard(ECard.Rank.KING, ECard.Suit.CLUBS);
        ECard c2 = new ECard(ECard.Rank.TWO, ECard.Suit.CLUBS);

        System.out.println(c1.toString());
        System.out.println(c2.toString());

        if (c1.getRank() > c2.getRank()) {
            System.out.println(c1.toString()
                    + " has higher rank than " + c2.toString());
        } else {
            System.out.println(c2.toString()
                    + " has higher rank than " + c1.toString());
        }

        boolean isEqual = c1.equalsTo(c2);
        System.out.println("The cards are considered equal: " + isEqual);
        boolean isSameInstance = c1 == c2;
        System.out.println("The cards are considered the same: " + isSameInstance);
    }
}
