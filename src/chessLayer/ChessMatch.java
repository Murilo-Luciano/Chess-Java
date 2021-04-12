package chessLayer;

import boardLayer.Board;
import boardLayer.Position;
import chessLayer.pieces.King;
import chessLayer.pieces.Rook;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i=0; i<board.getRows(); i++) {
			for(int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	public void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(7, 0));//wRook initial position
		board.placePiece(new King(board, Color.BLACK), new Position(0, 4));//bKing initial position
		board.placePiece(new King(board, Color.WHITE), new Position(7, 4));//wKing initial position
	}

}
