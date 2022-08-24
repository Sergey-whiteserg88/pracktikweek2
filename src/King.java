public class King extends ChessPiece{


    public King(String color) {
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
            if (Math.abs(toLine-line) == 1 && Math.abs(toColumn-column) == 1  && line!=toLine && column!=toColumn ||
                    Math.abs(toLine-line)==1 && toColumn==column ||
                    Math.abs(toColumn-column) ==1 && toLine==line) return true;
            else return false;
        }else return false;
    }

    public boolean isUnderAttack(ChessBoard board, int line, int column){
        if (board.board[line][column] != null)
        return board.board[line][column].check;
        else return false;
    }
    @Override
    public String getSymbol() {
        return "K";
    }
}
