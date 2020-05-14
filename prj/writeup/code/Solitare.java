import java.util.ArrayList;
import java.util.Scanner;
//import java.util.Math;
class Solitare{
  public static void main(String [] args ){
    Scanner input = new Scanner(System.in);
    
    // allocate memory for stacks
    ArrayList<Card> shuffler = new ArrayList<>();
    CardStack[] dealer = {new CardStack(), new CardStack()};
    ArrayList<ArrayList<Card>> hand = new ArrayList<ArrayList<Card>>();
    CardStack[] foundation = {new CardStack(), new CardStack(), new CardStack()
      , new CardStack()};
    for (int i=0; i < 7;i++){
      hand.add(new ArrayList<Card>());
    }
    
    System.out.println("Shuffling Deck...");
    // add new card objects to shuffler from input
    while (input.hasNext()){
      int value = input.nextInt();
      char suit = input.next().charAt(0);
      shuffler.add(new Card(value,suit));      
    }

    // shuffle deck 
    for (int i = 0; i < 200; i++){
      int ndx1 = (int)(Math.random() * 52);
      int ndx2 = (int)(Math.random() * 52);
      // swap 
      Card tmp = shuffler.get(ndx1);
      shuffler.set(ndx1, shuffler.get(ndx2));
      shuffler.set(ndx2, tmp);
    }
    // insert into deal stack
    for (Card c : shuffler){
      c.setColor();
      dealer[0].push(c);
    }
    // distribute deal stack to hand stacks
    for (int i = 0; i < hand.size(); i++){
      for (int j = 0; j <= i; j++){
        Card popper = dealer[0].pop();
        if (j != i )
          popper.changeVisibility();
        hand.get(i).add(popper);
      }
    }
    
    dealer[1].push(dealer[0].pop());
    printGame(dealer, hand, foundation);

    // start making moves
    int moves = 0;
    long startTime = System.nanoTime();
    // main game

    boolean playing = true;
    while(playing){
      // run through possibilities of moves between hand      
      for(int i =0;i<hand.size();i++){
        Card cur = hand.get(i).get(hand.get(i).size()-1);
        // check for ace 
        if(cur.getValue() == 1){
          char suit = cur.getSuit();
          hand.get(i).remove(cur);
          if(suit == 'S')
            foundation[0].push(cur);
          else if(suit == 'D')
            foundation[1].push(cur);
          else if(suit == 'H')
            foundation[2].push(cur);
          else
            foundation[3].push(cur);
        moves++;
        continue;
        }

      }
      // check for empty and kings
      for (int i = hand.size();i > 0;i--){
        Card cur = hand.get(i).get(hand.get(i).size()-1);

        if(cur.getValue() == 13 && cur.getVisibility()){
          for (int j = i;j>0;j--){
            if (hand.get(j).isEmpty()){

            }
          }
        }
      }


      // make top visible
      for (int i =0; i< hand.size();i++){
        Card vis = hand.get(i).get(hand.get(i).size() - 1);
        if(!(vis.getVisibility())){
          vis.changeVisibility();
        }
      }

      printGame(dealer, hand, foundation);
      System.out.println("Moves: " + moves);
      break;

    }

    // print results 

  }
  // end main



  /**
    * Static methods for driver class  
    * Displays current information for each array  
  **/

  // may need to pass the arrays
  static void printHand(ArrayList<ArrayList<Card>> hand){
    //- displays the card at top of stack with number of cards on stack
    System.out.println("______________________________________________");
    for (int i = 0; i < hand.size();i++){
      for(int j = 0; j <hand.get(i).size();j++){
        if (hand.get(i).isEmpty()){
          System.out.print(" |  | ");
        }else{
          hand.get(i).get(j).printCard();
        }
      }
      System.out.println();
    }
    System.out.println("\n______________________________________________");
  }

  static void printFoundation(CardStack[] foundation){
    //- displays top of stack for each suit
    System.out.println("\t\t\t  S    D    H    C");
    System.out.print("\t\t\t");
    for (int i = 0; i < foundation.length;i++){
      if (foundation[i].isEmpty()){
        System.out.print(" | | ");
      }else{
        foundation[i].peek().printCard();
      }
    }
    System.out.println();
  }

  static void printDealer(CardStack[] dealer){
    //- prints number of cards in deal stack and current available card

    System.out.print(dealer[0].getDepth()+ " ");
    if(dealer[1].isEmpty()){
      System.out.print("|  |\n");
    }else{
      dealer[1].peek().printCard();
      System.out.println();
    }
  }

  static void printGame(CardStack[] dealer, ArrayList<ArrayList<Card>> hand, CardStack[] found){
    System.out.println("***********************************************");
    printDealer(dealer);
    printFoundation(found);
    printHand(hand);
    System.out.println();
  }

}
