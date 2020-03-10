/*
 *  Author: Andrew DiBella
 *  ManWolfCabbage  DFA 
 *  Driver reads from plain text input 
 *  
 *  Command line: java driverDFA <string: g,w,c,n>
 *  ManWolf.java requried 
 *  
 *  If input string is a valid sequence for the Man Wolf problem
 *  System prints if is a correct solution. 
 */

import java.io.IOException;
class driverDFA{
  public static void main(String [] args) throws IOException{
    try{
      ManWolf dfa = new ManWolf();
      String sequence = args[0];
      sequence = sequence.toLowerCase();

      // checks input for valid sequence
      dfa.process(sequence);
      if(dfa.isAccepted()){
        System.out.println("This is a solution.");
      } else{
        System.out.println("This is not a solution.");
      }
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Enter string with: g w c n characters."); 
    }
  }
}