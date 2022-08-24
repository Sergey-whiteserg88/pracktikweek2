public class Rook extends ChessPiece{


    public Rook(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {

                if (line!=toLine && column==toColumn ||
                        column!=toColumn && line==toLine) {
                    if (chessBoard.board[toLine][toColumn] ==null ||
                            chessBoard.board[toLine][toColumn] !=null &&
                                    !chessBoard.board[toLine][toColumn].getColor().equals(getColor())){
                        boolean b = true;
                        if (line!=toLine && toLine>line+1){
                            for (int i = line+1; i < toLine; i++){
                                if (chessBoard.board[i][toColumn] != null) {
                                    b = false;
                                }
                            }
                        }
                        if (line!=toLine && toLine<line-1){
                            for (int i = line-1; i > toLine; i--){
                                if (chessBoard.board[i][toColumn] != null) {
                                    b = false;
                                }
                            }
                        }
                        if (column!=toColumn && toColumn>column+1){
                            for (int i = column+1; i < toColumn; i++){
                                if (chessBoard.board[toLine][i] != null) {
                                    b = false;
                                }
                            }
                        }
                        if (column!=toColumn && toColumn<column-1){
                            for (int i = column-1; i > toColumn; i--){
                                if (chessBoard.board[toLine][i] != null) {
                                    b = false;
                                }
                            }
                        }
                        return b;
                    }
                    else return false;

                }
                else return false;




    }

    @Override
    public String getSymbol() {
        return "R";
    }
}
