package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Sukhmanmeet Singh
 * @author Sukhmanmeet Singh May 26, 2023 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(generateRandomValue());
            card.setSuit(generateRandomSuit());
                    hand[i]=card;
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }
    }
    private static String generateRandomSuit() {
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        Random random = new Random();
        return suits[random.nextInt(suits.length)]; // Choose a random suit from the array
    }

    private static int generateRandomValue() {
        Random random = new Random();
        return random.nextInt(13) + 1;
    }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
// I am done
    public static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        
        
        System.out.println("My name is Sukhmanmeet Singh, but you can call me Sukhman, Sukh ");
       
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active in life");
        System.out.println("-- become a good coder!");
		

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- gaming");
        System.out.println("-- Watching TV");
        System.out.println("-- Riding my G-Wagon");


        
    
}

}
