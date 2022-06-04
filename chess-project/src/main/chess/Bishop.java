package chess;
import java.lang.Math;

public class Bishop extends Piece{
	public Bishop(PieceColour pc){
		if (pc.equals(PieceColour.WHITE)){
			this.colour=PieceColour.WHITE;
			this.setSymbol("♗");
		}
		else if (pc.equals(PieceColour.BLACK)){
			this.colour=PieceColour.BLACK;
			this.setSymbol("♝");
		}
	}

	@Override
	public boolean isLegitMove(int i0, int j0, int i1, int j1) {
		if (Board.hasPiece(i1, j1) && colour == Board.getPiece(i1, j1).getColour()) {
			return false;
		}
		if (Math.abs(i1-i0) == Math.abs(j1-j0)) {
			int x = 1;
			int y = 1;
			if (i1 - i0 > 0 && j1 - j0 < 0) {
				y = -1;
			} else if (i1 - i0 < 0 && j1 - j0 < 0) {
				x = -1;
				y = -1;
			} else if (i1 - i0 < 0 && j1 - j0 > 0) {
				x = -1;
			}
			for (int c = 1; c < Math.abs(i1 - i0); c++) {
				if (Board.hasPiece(i0 + (c * x), j0 + (c * y))) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}
}
