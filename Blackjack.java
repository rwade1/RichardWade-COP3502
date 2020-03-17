/***********************************************************************************************************************
 * Title : Blackjack.java
 * Author: Richard Wade (assisted by Ciara Chiampou)
 * Date: 2/6/2020
 **********************************************************************************************************************/

import java.util.Scanner;
public class Blackjack {
    public static void main(String[] args) {
        P1Random rng = new P1Random();
        Scanner scnr = new Scanner(System.in);


        String menu = "1. Get another card \n2. Hold hand \n3. Print statistics \n4. Exit";
        int playerChoice = 1;
        int card;
        int playerHand = 0;
        int winCount = 0;
        int gameCount = 1;
        int dealerWinCount = 0;
        int dealerCard;
        int tieCount = 0;

        while (playerChoice != 4) {
            System.out.println("START GAME #" + gameCount);
            System.out.println("");
            playerHand = 0;
            card = rng.nextInt(13) + 1;
            if ((card > 1) && (card < 11)) {
                System.out.println("Your card is a " + card + "!");
                playerHand = playerHand + card;
            } else if (card == 1) {
                System.out.println("Your card is a ACE!");
                playerHand = playerHand + 1;
            } else if (card == 11) {
                System.out.println("Your card is a JACK!");
                playerHand = playerHand + 10;
            } else if (card == 12) {
                System.out.println("Your card is a QUEEN!");
                playerHand = playerHand + 10;
            } else if (card == 13) {
                System.out.println("Your card is a KING!");
                playerHand = playerHand + 10;
            }
            System.out.println("Your hand is: " + playerHand);
            System.out.println("");

            do {
                System.out.println(menu);
                System.out.println("");
                System.out.print("Choose an option: ");
                System.out.println("");
                playerChoice = scnr.nextInt();
                if (playerChoice == 1) {
                    card = rng.nextInt(13) + 1;
                    if ((card > 1) && (card < 11)) {
                        System.out.println("Your card is a " + card + "!");
                        playerHand = playerHand + card;
                    } else if (card == 1) {
                        System.out.println("Your card is a ACE!");
                        playerHand = playerHand + 1;
                    } else if (card == 11) {
                        System.out.println("Your card is a JACK!");
                        playerHand = playerHand + 10;
                    } else if (card == 12) {
                        System.out.println("Your card is a QUEEN!");
                        playerHand = playerHand + 10;
                    } else if (card == 13) {
                        System.out.println("Your card is a KING!");
                        playerHand = playerHand + 10;
                    }
                    System.out.println("Your hand is: " + playerHand);
                    System.out.println("");
                    if (playerHand == 21) {
                        System.out.println("BLACKJACK! You win!");
                        System.out.println("");
                        winCount ++;
                        gameCount ++;
                    }
                    if (playerHand > 21) {
                        System.out.println("You exceeded 21! You lose.");
                        System.out.println("");
                        dealerWinCount ++;
                        gameCount ++;
                    }
                }
                else if (playerChoice == 2) {
                    dealerCard = rng.nextInt(11) + 16;
                    System.out.println("Dealer's hand: " + dealerCard);
                    System.out.println("Your hand is: " + playerHand);
                    System.out.println("");
                    if (dealerCard > 21) {
                        System.out.println("You win!");
                        System.out.println("");
                        winCount ++;
                    }
                    else if (dealerCard > playerHand) {
                        System.out.println("Dealer wins!");
                        System.out.println("");
                        dealerWinCount ++;
                    }
                    else if (dealerCard < playerHand) {
                        System.out.println("You win!");
                        System.out.println("");
                        winCount ++;
                    }
                    else {
                        System.out.println("It's a tie! No one wins!");
                        System.out.println("");
                        tieCount ++;
                    }
                    gameCount ++;

                }
                else if (playerChoice == 3) {
                    System.out.println("Number of Player wins: " + winCount);
                    System.out.println("Number of Dealer wins: " + dealerWinCount);
                    System.out.println("Number of tie games: " + tieCount);
                    System.out.println("Total # of games played is: " + (gameCount-1));
                    System.out.print("Percentage of Player wins: ");
                    double percentOfWins = 100.0 * (winCount / (double)(gameCount-1));
                    System.out.format("%.1f", percentOfWins);
                    System.out.println("%");
                    System.out.println("");
                }
                else if (playerChoice == 4) {
                    break;
                }
                else {
                    System.out.println("Invalid input!");
                    System.out.println("Please enter an integer value between 1 and 4.");
                    System.out.println("");
                }

            }while ((playerHand < 21) && (playerChoice != 2) && (playerChoice != 4));
        }





    }
}
