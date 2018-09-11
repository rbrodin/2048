public class Main {

    public static void main(String args[]){

        System.out.println("Test!");


        // This is my second attempt at coding 2048. I need to come up with an interesting algorithm for this.
        Board testBoard = new Board();
        testBoard.spawnNumber(0, 3);
        testBoard.spawnNumber(0, 1);
        PrintBoard.printBoard(testBoard.myBoard);
        testBoard.shift('r');
        System.out.println("\n");
        PrintBoard.printBoard(testBoard.myBoard);

    }

}
