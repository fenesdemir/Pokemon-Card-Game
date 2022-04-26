
# Problem definition
What was required of me in this project is to program a simple pokemon card game with interface. With the end Goal being to use OOP concepts like inheritance, encapsulation etc.

# Requirements

We were expected to design an interface where the game and the cards in the hands of the players can be seen and followed.

- There must be 10 Pokemon cards in the deck.

- The player takes three random cards from the deck.

- The computer picks three random cards from the deck.

- The player and the computer choose one of the three cards in their hand and reveal it face down. The computer performs the selection randomly. Here, the user will not know which card the computer has chosen (However, during the presentation, the cards must be shown so that the game can be checked for correct operation).

- The one with the larger damage points will win.

- Cards that have been played will not be used again. After each move, a card is taken from the deck by the user and the computer, and the above operations continue until there are no pokemon cards left in the middle and in the hand.

- The player with the highest score wins the game.

- The user should options to play as player versus computer and computer versus computer.

# Required Classes

**Pokemon Class**

The class definition should include:
- Constructor methods (with and without parameters). Parameters must be pokemonName and pokemonType.
- In order to show the damage score of the Pokemon, the damageScoreGoster() method should be written.

**Pokemon Subclasses**

Each of the required pokemons will be defined as a class.

The definitions and requierements:

- It will inherit from the Pokemon class.

- Constructor methods (with and without parameters). To assign pokemonName and pokemonType properties in the Pokemon class super() will be used.
- DamagePoints attribute will be kept in these classes and the damagePuaniGoster() method will be overridden and customized for each pokemon.
- The Boolean data type cardUsed information will be used to prevent used cards from being used again in the game.

**Player Class**

There will be two players playing the game, either computer or user. These two players have both different and same features. The Player base class will be created to represent the same properties. Player base class will be Abstract class.
Features and functions that should be in this class:
- Constructor methods (with and without parameters). Parameters should be playerID, playerName and Score.
- With the CardList feature, the cards in the hands of the players will be kept in the list.
- The scores of the players will be displayed with the ScoreShow() function.
- The cardSec() function should be written, but it should be noted that this function will work in differently for the computer and the user.

**Computer class**

- Will inherit from the player class.
- Constructor methods (with and without parameters). Super() will be used to assign the playerID, playerName and Score properties in the player class.
- The cardSec() method in the player class will be overridden. The computer will reveal it by choosing a random card among the 3 cards.

**User Class**

- Will inherit from the player class.
- Constructor methods (with and without parameters). Super() will be used to assign the playerID, playerName and Score properties in the player class.
- The cardSec() method in the player class will be overridden. The user will reveal the card he/she wants by choosing the card from among the cards received randomly.

**Encapsulation, Inheritance, Polymorphism, Abstraction structures (all) in the project
must be used.**

**Constructor methods (at least two with and without parameters) will be written.**

**Get, set methods will be defined for all properties.**

# Ease of Use 

- When you run the program, you are expected to choose the game mode from the menu that appears.

- In player vs computer mode, players are first given three cards each. Here you choose the card to play. When the first three cards in your hand are exhausted, you will be automatically given 2 new cards.

- Computer vs. Computer mode, you don't need to take any action. The computer will play automatically.

- At the end of the game, the scores will be compared and the win, loss, draw situation will be announced.
