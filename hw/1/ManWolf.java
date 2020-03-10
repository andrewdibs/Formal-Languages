class ManWolf{  

  private static final int q0  = 0;
  private static final int q1  = 1;
  private static final int q2  = 2;
  private static final int q3  = 3;
  private static final int q4  = 4;
  private static final int q5  = 5;
  private static final int q6  = 6;
  private static final int q7  = 7;
  private static final int q8  = 8;
  private static final int q9  = 9;
  private static final int qe = 10;

  private static int state;
  private static int[][] delta = {
    //    | q0 | q1 | q2 | q3 | q4 | q5 | q6 | q7 | q8 | q9 | q10 |
    /*g*/ { q1 , q0 , qe , q4 , q3 , q6 , q5 , qe , q9 , q8 , qe },
    /*w*/ { qe , qe , q3 , q2 , qe , qe , q7 , q6 , qe , qe , qe },
    /*c*/ { qe , qe , q5 , qe , q7 , q2 , qe , q4 , qe , qe , qe },
    /*n*/ { qe , q2 , q1 , qe , qe , qe , qe , q8 , q7 , qe , qe },
  };
  ManWolf(){
    state = 0;
  }
  // checks wether the dfa reached the accepting state
  boolean isAccepted(){
    return state == q9;
  }

  void process(String str){
    for (int i = 0; i < str.length(); i++){
      char c = str.charAt(i);
      if(c == 'g'){
        state = delta[0][state];
      }else if (c == 'w'){
        state = delta[1][state];
      }else if (c == 'c'){
        state = delta[2][state];
      }else if (c == 'n'){
        state = delta[3][state];
      }else{ 
        state = qe;
      }
    }
  }
}