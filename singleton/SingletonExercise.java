package singleton;
/*
 * 컴퓨터공학과 2018112021 최은지
 *
 * singleton 패턴을 적용하기 위해 Deck class 내에 인스턴스를 선언하였으며
 * 생성자를 private으로 변경하였다.
 * 외부에서 Deck을 사용하기 위해서는 getDeck이라는 메소드를 이용해 return 하여 사용가능하다.
 * 이는 syncronized를 통해 메소드 동기화를 수행하였다.
 *
 * */
import java.util.*;

enum Suit {
    SPADES,
    HEARTS,
    CLUBS,
    DIAMONDS
}

class Card {
    public Card(Suit s, int n) {
        suit = s;
        if ((n < 2) || (n > 14)) {
            throw new IllegalArgumentException();
        }
        number = n;
    }

    public void print() {
        switch (number) {
            case 11:
                System.out.print("Jack");
                break;
            case 12:
                System.out.print("Queen");
                break;
            case 13:
                System.out.print("King");
                break;
            case 14:
                System.out.print("Ace");
                break;
            default:
                System.out.print(number);
                break;
        }
        System.out.print(" of ");
        switch (suit) {
            case SPADES:
                System.out.println("spades.");
                break;
            case HEARTS:
                System.out.println("hearts.");
                break;
            case CLUBS:
                System.out.println("clubs.");
                break;
            case DIAMONDS:
                System.out.println("diamonds.");
                break;
        }
    }

    private Suit suit;
    private int number;
}

class Deck {
    private static Deck deck = null; //추가
    public synchronized static Deck getDeck(){ //메서드 동기화
        if(deck == null){ // null일 경우에만 생성
            deck = new Deck();
        }
        return deck;
    }

    private Deck() { //private 으로 변경
        cards = new ArrayList<Card>();
// build the deck
        Suit[] suits = {Suit.SPADES, Suit.HEARTS, Suit.CLUBS, Suit.DIAMONDS};
        for (Suit suit : suits) {
            for (int i = 2; i <= 14; i++) {
                cards.add(new Card(suit, i));
            }
        }
// shuffle it!
        Collections.shuffle(cards, new Random());
    }
    public void print() {
        for (Card card : cards) {
            card.print();
        }
    }
    private List<Card> cards;
}

public class SingletonExercise {
    public static void main(String args[]) {
        Deck deck = Deck.getDeck(); //getDeck 으로 변경
        deck.print();
    }
}

