public class Pawn extends ChessPiece{


    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (getColor().equals("White")){
            if (line == 1 && toLine == 3 && column==toColumn && chessBoard.board[2][column] == null ||
                    toLine == line+1 && column==toColumn && chessBoard.board[toLine][column] == null ||
                    toLine == line+1 && toColumn==column+1 && chessBoard.board[toLine][toColumn] != null && !getColor().equals(chessBoard.board[toLine][toColumn].getColor()) ||
                    toLine == line+1 && toColumn==column-1 && chessBoard.board[toLine][toColumn] != null && !getColor().equals(chessBoard.board[toLine][toColumn].getColor())) return true;
            else return false;
        }else {
                if (line == 6 && toLine == 4 && column==toColumn && chessBoard.board[5][column] == null  ||
                        toLine == line-1 && column==toColumn && chessBoard.board[toLine][column] == null ||
                        toLine == line-1 && toColumn==column+1 && chessBoard.board[toLine][toColumn] != null && !getColor().equals(chessBoard.board[toLine][toColumn].getColor()) ||
                        toLine == line-1 && toColumn==column-1 && chessBoard.board[toLine][toColumn] != null && !getColor().equals(chessBoard.board[toLine][toColumn].getColor())) return true;
                else return false;
            }

    }


    @Override
    public String getSymbol() {
        return "P";
    }
}
