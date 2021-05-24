package oop;/*
 * OOP Assignment 1
 * Contains methods for interaction with user
 */

import java.util.Scanner;

public class CardInteraction {
    private Scanner scanner;
    private CardOrder card;

    public CardInteraction() {
        scanner = new Scanner(System.in);
    }

    //runs the program as follows:
    //Gets details of card name from user
    //Displays card
    //Repeatedly, until user responds ok
    //	Asks the user if they would like to change the border
    //	If so, change the border and print the new card
    //Print the price of the order
    //print whether a discount is applicable or not
    public void run() {
        //Alter this gradually to add more details
        //oop.CardOrder order = new oop.CardOrder("Jane Black");
        //System.out.print(order.getSampleCard());
        System.out.print("Enter name:");
        String input = getNameFromUser();
        card = new CardOrder(input);
        while (true) {
            System.out.println("\nHere is a sample card:\n");
            System.out.println(card.getSampleCard());
            System.out.print("Enter \"OK\" if this card is ok, otherwise enter an alternative border character:");
            String user = scanner.next();
            if (user.contains("OK")) {
                break;
            } else {
                card.setBorder(user.charAt(0));
            }
        }
        System.out.print("\nHow many cards would you like?");
        int getNumberFromUser = getNumberFromUser();
        card.setNumCards(getNumberFromUser);
        System.out.println("\nThe price of " + card.getNumCards() + " cards is " + card.getFinalCost());
        if (card.hasDiscount()) {
            System.out.println("10% discount applied");
        } else {
            System.out.println("No discount given");
        }
    }

    //repeatedly requests and reads name from user
    //until valid (i.e. <=28 chars and contains at least one space
    //finally returns the valid text
    private String getNameFromUser() {
        //use this value until more code written
        String NameFromUser;
        while (true) {
            NameFromUser = scanner.nextLine();
            if (NameFromUser.length() > 28 || !NameFromUser.contains(" ")) {
                System.out.println("error 다시입력");
            } else {
                break;
            }
        }
        return NameFromUser;
    }

    //repeatedly requests and reads number from user
    //until valid number entered i.e. between 1 and 1000
    //finally returns the valid number
    private int getNumberFromUser() {
        //use this number until more code written
        int NumberFromUser;
        while(true) {
            NumberFromUser = scanner.nextInt();
            if (NumberFromUser < 1 || NumberFromUser > 1000) {
                System.out.println("error 다시입력");
            }else{
                break;
            }
        }
        return NumberFromUser;
    }


}


