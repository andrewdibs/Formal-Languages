# Klondike Solitare NFA

A Nondeterministic Finite Automata(NFA) is anything that can be described as having a defined number of states with a final accepting state as the end goal. Now any card game has an infinite number of possibilities depending on the shuffling of the alphabet in this game being the 52 cards in a full deck. Since this is the case I am going to abstract a NFA from the game of Solitaire and validate if the set of cards has a potential NFA based on the algorithm I created. Having an alphabet of 52 cards would make the NFA almost impossible to create; instead there will be three states and the alphabet will still be the cards but the diagram won’t depict each individual card moving from state to state. Considering Solitaire is not easy to win, I have created my algorithm to follow basic strategy rules and if a game is won it will return the number of moves and the time it took to finish from a sample of differently shuffled decks. A shuffled deck will be considered a NFA if each suit is ordered from ace to king in the foundation state.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

Make sure you have java JRE & JDK installed on your machine. 

```
java -version
javac -version
```

### Installing

Open a Command Line
Clone the repository

```
git clone https://github.com/andrewdibs/cmpt440dibella.git
```

Change directory path to

```
cd cmpt440dibella/writeup/code
```
Compile all java files 
```
javac <filename>.java
```
## Running the tests
Run Program with deck txt file 
~note the program automatically shuffles input file so the 1 deck will suffice
```
java Solitare < deck1.txt
```

Also note the Project isnt fully complete therefore it won't run fully


## Authors

* **Andrew DiBella** - *Initial work* - [andrewdibs](https://github.com/andrewdibs)


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Thanks for the great semester for both Formal & Algorithms Pablo :) 