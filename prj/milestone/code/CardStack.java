

class CardStack{ 
  
  private CardStackNode top;
  private int depth; 

  CardStack(){
    depth = 0;
    top = null;
  }

  void push(Card card){
    CardStackNode newCard = new CardStackNode(card, top);
    newCard.setNext(top);
    top = newCard;
    depth++;
  }

  void pop(){
    if (depth > 0){
      top = top.getNext();
      depth--;
    }
  }

  Card peek(){
    return top.getCard();
  }

  boolean isEmpty(){
    return depth == 0;
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