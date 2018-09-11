public class Board {

    // Will be used to store the board.
    // Board will be made up of boardpoint objects (if I could come up with a better name) -> boardpiece will have one value.
    BoardPointList myBoard;
    public static int boardIndexCheck;
    Board(){
        myBoard = new BoardPointList(4, 4);
        //System.out.println(myBoard.getBoardPointFromIndex(0, 0).value);
    }

    void spawnNumber(int i, int j){

        myBoard.setBoardPoint(i, j, 2);

    }
    // public method shift will shift the board over, based on the numbers inside the board point.
    // [0 (0, 0), 0 (0, 1), 0, 0]
    // [0 (1, 0), 0 (1, 1), 0, 0]
    // -1 is no options, anything otherwise it returns the new value.
    void shift(char direction) {

        if (direction == 'r' || direction == 'l') {
            // Need some way to go through rows or columns

            // I HATE DEBUGGING -> THE ISSUE WAS THE FOR LOOP THE ENTIRE TIME, it was counting up instead of down.
            for(int i = 0; i <= 0; i++) {
                boardIndexCheck = 3;

                if (boardIndexCheck >= 0) {
                    // Issue is when boardIndexCheck is zero. Easiest thing to do is to add a conditional
                    //if(boardIndexCheck != 0) {
                        // Could add some tricks to make it so that I would only need one loop for both left and right.
                        System.out.println(boardIndexCheck);
                        BoardPoint pointOne = myBoard.getBoardPointFromIndex(i, boardIndexCheck);
                        BoardPoint pointTwo = myBoard.getBoardPointFromIndex(i, boardIndexCheck - 1);
                        int[] shiftCheckValue = ShiftCheck.shiftCheck(pointOne, pointTwo, direction);

                        // Finally, the new value is set to what the shiftCheck method returns.
                        pointOne.setValue(shiftCheckValue[0]);

                        pointTwo.setValue(shiftCheckValue[1]);
                        PrintBoard.printBoard(myBoard);

                    //}
                    /*
                    else{
                        if(myBoard.getBoardPointFromIndex(i, boardIndexCheck).value == 0){
                            boardIndexCheck-=1;
                        }

                    }
*/

                }
            }
        } else if (direction == 'd' || direction == 'u') {


        }

    }
}
