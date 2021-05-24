package oop;

/**
 * OOP Assignment One
 * oop.CardOrder class keeps details of one card order
 * and provides methods to print a card
 * and determine the price
 */
public class CardOrder {
    private Name name;    //the name printed on the card
    private char border;    //the card border
    private int numCards;   //the number of cards to be printed
    private int TotalLength;

    private static final int CARD_LEN = 32;  //the length of the card in characters

    //initialises name from value in parameter
    //and sets other instance variables to suitable default values
    //you can create a oop.Name from a single string after L5
    //If you want to start before then, just write name = new oop.Name("A", "B", "C") in the constructor!
    public CardOrder(String fullName) {
        String splitName[] = fullName.split(" ");
        Name tmpName;
        if (splitName.length <= 2) {
            tmpName = new Name(splitName[0], "", splitName[1]);
        } else {
            tmpName = new Name(splitName[0], splitName[1], splitName[2]);
        }
        this.TotalLength = fullName.length();//TotalLength가 계속 쓰이기 때문에 선언
        this.name = tmpName;
        this.border = '*'; //초기 세팅은 *
        this.numCards = 0;
    }

    ///////////////////////////////////////////
    //accessor/mutator methods

    //returns the character used in the border
    public char getBorder() {
        return this.border;
    }

    //sets the character used in the border
    //to that provided in the parameter
    public void setBorder(char ch) {
        this.border = ch;
    }

    //returns the name
    public Name getName() {
        return this.name;
    }

    //sets the name used in the card
    //to that provided in the parameter
    public void setName(Name name) {
        this.name = name;
    }

    //returns the number of cards to be printed
    public int getNumCards() {
        return this.numCards;
    }

    //sets the number of cards to be printed
    //to that provided in the parameter
    public void setNumCards(int n) {
        this.numCards = n;
    }
    ///////////////////////////////////////////

    //returns a sample card, including a newline at the end of each line
    public String getSampleCard() {
        return getTopLine() + getBlankLine() + this.getLineWithName()
                + getBlankLine() + getTopLine();
    }

    //returns a String containing the top or bottom line
    //of a card, including a newline character at the end
    private String getTopLine() {
        //use this value until more code written
        String Topline = name.getInits();
        int TL = Topline.length();
        int DeleteLength = (TL == 2 ? TL + 2 : TL + 3); // 이니셜이 2글자인지 3글자인지에 따라 갯수가 달라진다.
        for (int i = 0; i < CARD_LEN - DeleteLength; i++) {
            Topline += getBorder();
        }
        Topline += name.getInits();
        return Topline + "\n";
    }

    //returns a String containing the blank line
    //of a card, with a border char at each end
    //and including the newline character
    private String getBlankLine() {
        //use this value until more code written
        String Blankline = "";
        Blankline += getBorder();
        for (int i = 0; i < CARD_LEN - 2; i++) {
            Blankline += " ";
        }
        Blankline += getBorder();
        return Blankline + "\n";
    }

    //returns a String containing the name line
    //of a card, including name, padding and border
    //and including the newline character
    private String getLineWithName() {
        //use this value until more code written
        String Nameline = "";
        String middleName = " ";
        Nameline += getBorder();
        int padding = CARD_LEN - TotalLength -2;
        boolean isMiddle = name.getMiddleName().length() >= 1 ? true : false;
        if (isMiddle) {
            middleName = " " + name.getMiddleName().charAt(0) + " "; //middleName이 존재하면
            padding += 2;
        }
        for (int i = 0; i < (padding % 2 == 1 ? padding / 2 + 1 : padding / 2); i++) {//홀수일 경우 짝수일 경우 blank의 길이가 다르다.
            Nameline += " ";
        }
        Nameline += name.getFirstName() + middleName + name.getLastName();
        for (int i = 0; i < padding / 2; i++) {
            Nameline += " ";
        }
        Nameline += getBorder();
        return Nameline + "\n";
    }

    //returns the price of one card
    //in pounds (i,e either 0.20 or 0.25)
    //based on the number of characters in the name to be printed
    //0.20 if <=12 otherwise 0.25
    public double getCardPrice() {
        //use this value until more code written
        double CardPrice;
        if (TotalLength >= 12) {
            CardPrice = 50;
        } else {
            CardPrice = 40;
        }
        return CardPrice;
    }

    //returns the final cost of the order
    //which is the number of cards multiplied by the card price
    //and reduced by 10% if >= 100 cards
    public double getFinalCost() {
        //use this value until more code written
        double TotalPrice;
        TotalPrice = numCards * getCardPrice();
        if (numCards >= 200) {
            TotalPrice = TotalPrice * 90 / 100;
        }
        return TotalPrice;
    }

    //returns true if number of cards < 100, false otherwise
    public boolean hasDiscount() {
        if (numCards >= 200) {
            return true;
        }
        return false;
    }
}
