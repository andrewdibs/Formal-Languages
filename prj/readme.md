# Klondike Solitare NFA

A Nondeterministic Finite Automata(NFA) is anything that can be described as having a defined number of states with a final accepting state as the end goal. Now any card game has an infinite number of possibilities depending on the shuffling of the alphabet in this game being the 52 cards in a full deck. Since this is the case I am going to abstract a NFA from the game of Solitaire and validate if the set of cards has a potential NFA based on the algorithm I created. Having an alphabet of 52 cards would make the NFA almost impossible to create; instead there will be three states and the alphabet will still be the cards but the diagram won’t depict each individual card moving from state to state. Considering Solitaire is not easy to win, I have created my algorithm to follow basic strategy rules and if a game is won it will return the number of moves and the time it took to finish from a sample of differently shuffled decks. A shuffled deck will be considered a NFA if each suit is ordered from ace to king in the foundation state.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

Make sure you have java JRE & JDK installed on your machine. 

```
java -version
```
javac -version
```

### Installing

A step by step series of examples that tell you how to get a development env running

Say what the step will be

```
Give the example
```

And repeat

```
until finished
```

End with an example of getting some data out of the system or using it for a little demo

## Running the tests

Explain how to run the automated tests for this system

### Break down into end to end tests

Explain what these tests test and why

```
Give an example
```

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [ROME](https://rometools.github.io/rome/) - Used to generate RSS Feeds

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc