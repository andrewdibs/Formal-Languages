
class Card{
  private final int ACE = 1;
  private final int JACK = 11;
  private final int QUEEN = 12;
  private final int KING = 13;
  private int value;
  private char color;
  private char suit;

  Card(char color, char suit, int value){
    this.color = color;
    this.suit = suit;
    this.value = value;
  }

  int getValue(){ return this.value;}
  char getColor(){ return this.color;}
  char getSuit(){ return this.suit;}


}