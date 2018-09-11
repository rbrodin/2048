public class PrintBoard {
    // Will print out the board

    public static void printBoard(BoardPointList boardPointList){

            for(int i = 0; i < 4; i++){
                for(int j = 0; j < 4; j++){
                    System.out.print(boardPointList.getBoardPointFromIndex(i, j).value);

                }
                System.out.print("\n");

            }
    }
}
