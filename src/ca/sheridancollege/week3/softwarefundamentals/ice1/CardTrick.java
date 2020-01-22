/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha Patel
 * modifier Nadia Mensah 991383559
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner k = new Scanner(System.in);
        
         //insert code to ask the user for Card value and suit, create their card
        System.out.println("Enter the number of your card");
        int userValue = k.nextInt();      
        Card user = new Card();
        user.setValue(userValue);
        
        System.out.println("Enter the suit: Clubs, Diamonds, Spades, or Hearts");
        String userSuit = k.next();
        user.setSuit(userSuit);
        
        

        for(int i = 0; i < magicHand.length; i++)
        {
            
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int) (Math.random()*13 + 1));
            
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random()*3)]);
            
            System.out.println(c.getValue()+c.getSuit());
            
            if(c.getSuit().equalsIgnoreCase(userSuit)){
                if(c.getValue()==userValue)
                        System.out.println("You Matched!!");
            }
                
           
            else
                System.out.println(" ");
        }
        
  
    }
    
}
