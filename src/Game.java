public class Game {

    // Class game will be used to store all the necessary parts of the game.
    // Will contain a checkGameState method, and will contain a board.

    boolean gameIsOver;
    int turns;

    Game(Board myBoard){
        this.gameIsOver = false;
        int turns = 0;

        System.out.println("Game created!");
    }


}
