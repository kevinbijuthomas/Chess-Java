package chess;

public class Pawn extends Piece{
	public Pawn(PieceColour pc){
		if (pc.equals(PieceColour.WHITE)){
			this.colour=PieceColour.WHITE;
			this.setSymbol("♙");
		}
		else if (pc.equals(PieceColour.BLACK)){
			this.colour=PieceColour.BLACK;
			this.setSymbol("♟");
		}
	}

	@Override
	public boolean isLegitMove(int i0, int j0, int i1, int j1) {
		int iChange = i1 - i0;
		int jChange = j1 - j0;
		int changeLegal = 1;
		int firstLegal = 2;
		int start = 1;
		if (this.colour.equals(PieceColour.WHITE)) {
			changeLegal = -1;
			firstLegal = -2;
			start = 6;
		}
		if (iChange == changeLegal) {
			if ((jChange == 0) && Board.hasPiece(i1, j1) == false) {
				return true;
			} else if ((jChange == -1) || (jChange == 1)) {
				if (Board.hasPiece(i1, j1) && (Board.getPiece(i1, j1).getColour() != this.getColour())) {
					return true;
				}
			}
		} else if ((i0 == start) && (iChange == firstLegal)) {
			return true;
		}
		return false;
	}
}
