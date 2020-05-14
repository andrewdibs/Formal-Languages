class CardStack{ 
  
  private CardStackNode top;
  private int depth; 

  CardStack(){
    depth = 0;
    top = null;
  }

  void push(Card c){
    CardStackNode newCard = new CardStackNode(c, top);
    newCard.setNext(top);
    top = newCard;
    depth++;
  }

  void push(CardStackNode card){
    card.setNext(top);
    top = card;
    depth++;
  }

  Card pop(){
    if (depth > 0){
      Card popper = top.getCard();
      top = top.getNext();
      depth--;
      return popper;
    }
    return null;
  }

  Card peek(){
    return top.getCard();
  }

  boolean isEmpty(){
    return depth == 0;
  }
  int getDepth(){
    return depth;
  }

}

class CardStackNode{
  private Card card;
  private CardStackNode nextCard;
  
  CardStackNode(Card card, CardStackNode next){
    this.card = card;
    this.nextCard = next;
  }

  Card getCard(){
    return this.card;
  }

  CardStackNode getNext(){
    return this.nextCard;
  }

  void setNext(CardStackNode next){
    this.nextCard = next;
  }

}