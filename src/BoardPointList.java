public class BoardPointList {

    BoardPoint[][] myBoard;

    BoardPointList(int width, int length){
        myBoard = new BoardPoint[width][length];
        for(int i=0;i<width;i++){
            for(int j=0;j<length;j++){
                myBoard[i][j] = new BoardPoint(0);
            }
        }


    }

    // Will return a BoardPoint object from a specific index.
    BoardPoint getBoardPointFromIndex(int indexRow, int indexColumn) {
        //System.out.println(" " + indexColumn + " " + indexColumn);
        return myBoard[indexRow][indexColumn];
    }

    void setBoardPoint(int indexRow, int indexColumn, int valueToSet){
        myBoard[indexRow][indexColumn].setValue(valueToSet);
    }
}
