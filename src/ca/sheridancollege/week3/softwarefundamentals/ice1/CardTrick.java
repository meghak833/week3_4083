package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author Mohamad Hamadeh
 */
import java.util.Scanner;
public class CardTrick {
    public static void main(String[] args) {
        int cardVal;
        String cardSuit;
        Card[] magicHand = new Card[7];
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            magicHand[i] = c;
            c.setValue((int) ((Math.random() * 13) + 1));
            c.setSuit(Card.SUITS[((int) (Math.random() * 3))]);
            System.out.println(magicHand[i].getValue() + " " + magicHand[i].getSuit());
        }
        //insert code to ask the user for Card value and suit, create their card
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a card value: ");
        cardVal = input.nextInt();
        System.out.print("Enter a card suit: ");
        cardSuit = input.next();
        // and search magicHand here
        Card magicCard = new Card();
        magicCard.setSuit(cardSuit);
        magicCard.setValue(cardVal);
        //Then report the result here
         if (cardVal == 1) {
            System.out.println("Your card is Ace of " + cardSuit);
        }else if (cardVal == 11) {
            System.out.println("Your card is Jack of " + cardSuit);
        } else if (cardVal == 12) {
            System.out.println("Your card is Queen of " + cardSuit);
        }else if (cardVal == 13) {
            System.out.println("Your card is King of " + cardSuit);
        } else {
            System.out.println("Your card is " + cardVal + " of " + cardSuit);
        }

    }

}