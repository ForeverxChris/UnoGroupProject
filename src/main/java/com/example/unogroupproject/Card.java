package com.example.unogroupproject;

public class Card {
    /**
     * Card object used to contain aspects of each uno card
     * */
    private int cardNum;
    private String cardAction;
    private String cardColor;

    // constructor for regular card
    Card(String cardColor, int cardNum, String cardAction) {
        this.cardNum = cardNum;
        this.cardColor = cardColor;
        this.cardAction = cardAction;
    }

    // getter functions for cards
    public int getCardNum() {
        return cardNum;
    }

    public String getCardAction() {
        return cardAction;
    }

    public String getCardColor() {
        return cardColor;
    }

    // setter functions for cards
    public void setCardAction(String cardAction) {
        this.cardAction = cardAction;
    }

    public void setCardColor(String cardColor) {
        this.cardColor = cardColor;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }

    // returns the link to the png file of each card
    public String getImageLink() {
        return getCardNum() + "_" + getCardColor() + ".png";
    }

    // checks if a card can be played on another
    public boolean canBePlayedOn(Card otherCard) {
        if (this.cardColor == "Wild" || otherCard.cardColor == "Wild"
                || this.cardColor == "Wild_Draw4" || otherCard.cardColor == "Wild_Draw4"
                || this.cardColor == otherCard.cardColor || this.cardNum == otherCard.cardNum) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return getCardNum() + "_" + getCardColor();
    }
}
