public class ShiftCheck {

    // ShiftCheck can be used to check if a shift is possible.

    // Will check if a shift can occur, given two points.
    // boardPoint one will always be the first point, regardless of direction. [2, 1], where 1 is the first boardPoint (it can be confusing)
    public static int[] shiftCheck(BoardPoint boardPointOne, BoardPoint boardPointTwo, char direction) {

        int[] returnList = new int[2];
        returnList[0] = boardPointOne.value;
        returnList[1] = boardPointTwo.value;

        // valueToSet is used as the value to default back to in the case of
        int valueToSet;
        if (direction == 'r' || direction == 'u') {
            valueToSet = 3;
        } else {
            valueToSet = 0;
        }

        if (boardPointOne.value == 0) {
            // Moves the next point in line to the first point, since it is zero.
            Board.boardIndexCheck = valueToSet;
            System.out.println("1d");
            // Sets the first value equal to the second, and the second equal to zero.
            returnList[0] = boardPointTwo.value;
            returnList[1] = 0;
            return returnList;
// TODO: Having an issue regarding the conditionals in the ShiftCheck class. I think part of the issue is the program not registering if the second number is a zero.
        } else if (boardPointOne.value == boardPointTwo.value) {
            // Adds the two points together and returns that value. This is used for combining points!
            Board.boardIndexCheck = valueToSet;
            System.out.println("2d");
            returnList[0] = (boardPointOne.value * 2);
            returnList[1] = 0;
            return returnList;
        } else if (boardPointTwo.value == 0) {
            Board.boardIndexCheck = Board.boardIndexCheck - 1;
            System.out.println("g");
        }
            // Otherwise, -1 is returned to signal that nothing can be shifted.
            Board.boardIndexCheck = Board.boardIndexCheck - 1;
            //System.out.println("3");
            // returnList defaults to keeping the same values, meaning that the program assumes that the shift will not happen.
            return returnList;
        }
}