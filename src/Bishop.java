public class Bishop extends ChessPiece{


    public Bishop(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (chessBoard.board[toLine][toColumn] ==null ||
                chessBoard.board[toLine][toColumn] !=null &&
                        !chessBoard.board[toLine][toColumn].getColor().equals(getColor())) {
            if (Math.abs(toLine - line) == Math.abs(toColumn - column) && line != toLine && column != toColumn){
                boolean b = true;
                if (toLine>line+1 && toColumn>column+1){
                    for (int i = line+1; i <= toLine-line; i++){
                        if (chessBoard.board[i][column+=1] != null) {
                            b = false;
                        }
                    }
                }
                if (toLine>line+1 && toColumn<column-1){
                    for (int i = line+1; i <= toLine-line; i++){
                        if (chessBoard.board[i][column-=1] != null) {
                            b = false;
                        }
                    }
                }
                if (toLine<line-1 && toColumn>column+1){
                    for (int i = line-1; i > toLine; i--){
                        if (chessBoard.board[i][column+=1] != null) {
                            b = false;
                        }
                    }
                }
                if (toLine<line-1 && toColumn<column-1){
                    for (int i = line-1; i > toLine; i--){
                        if (chessBoard.board[i][column-=1] != null) {
                            b = false;
                        }
                    }
                }

                return b;
            }

            else return false;
        }else return false;

    }

    @Override
    public String getSymbol() {
        return "B";
    }
}
