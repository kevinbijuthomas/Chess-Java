package chess;
import java.lang.Math;

public class Rook extends Piece{
	public Rook(PieceColour pc){
		if (pc.equals(PieceColour.WHITE)){
			this.colour=PieceColour.WHITE;
			this.setSymbol("♖");
		}
		else if (pc.equals(PieceColour.BLACK)){
			this.colour=PieceColour.BLACK;
			this.setSymbol("♜");
		}
	}

	public boolean isLegitMove(int i0, int j0, int i1, int j1) {
		if (Board.hasPiece(i1, j1) && Board.getPiece(i0, j0).getColour() == Board.getPiece(i1, j1).getColour()) {
			return false;
		}
		if (i0 == i1) {
			int min = Math.min(j0, j1);
			int max = Math.max(j0, j1);
			for (int i = min + 1; i < max; i++) {
				if (Board.hasPiece(i0, i)) {
					return false;
				}
			}
			return true;
		} else if (j0 == j1) {
			int min = Math.min(i0, i1);
			int max = Math.max(i0, i1);
			for (int i = min + 1; i < max; i++) {
				if (Board.hasPiece(i, j0)) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
}
