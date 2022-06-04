package chess;
import java.lang.Math;

public class King extends Piece{
	public King(PieceColour pc){
		if (pc.equals(PieceColour.WHITE)){
			this.colour=PieceColour.WHITE;
			this.setSymbol("♔");
		}
		else if (pc.equals(PieceColour.BLACK)){
			this.colour=PieceColour.BLACK;
			this.setSymbol("♚");
		}
	}

	@Override
	public boolean isLegitMove(int i0, int j0, int i1, int j1) {
		if (Board.hasPiece(i1, j1) && colour == Board.getPiece(i1, j1).getColour()) {
			return false;
		}
		if (Math.abs(i1 - i0) == 1 || Math.abs(j1 - j0) == 1) {
			return true;
		}
		return false;
	}
}
