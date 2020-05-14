class Card{
  private final int ACE = 1;
  private final int JACK = 11;
  private final int QUEEN = 12;
  private final int KING = 13;
  private int value;
  private char suit;
  private boolean visible;
  private char color; 

  Card(int value, char suit){
    this.suit = suit;
    this.value = value;
    this.color = 'R';
    this.visible = true;
  }

  int getValue(){ return this.value;}
  char getSuit(){ return this.suit;}
  boolean getVisibility(){ return this.visible;}

  void changeVisibility(){
    if (visible)
      visible = false;
    else
      visible = true;
  }

  void setColor(){
    if(suit == 'C' || suit == 'S') color = 'B';
  }

  public void printCard(){
    if(visible){
      if (value < 10 && value > 1){
        System.out.print(" |" + value + suit + "| ");
      }else{
        if (value == 10)
          System.out.print(" |" + 'T' + suit + "| ");
        else if (value == 11)
          System.out.print(" |" + 'J' + suit + "| ");
        else if (value == 12)
          System.out.print(" |" + 'Q' + suit + "| ");
        else if (value == 13)
          System.out.print(" |" + 'K' + suit + "| ");
        else
          System.out.print(" |" + 'A' + suit + "| ");
      }
    }else{
      System.out.print(" |$&| ");
    }
  }

}