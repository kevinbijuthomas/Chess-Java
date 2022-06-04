package chess;

public class Knight extends Piece{
 	public Knight(PieceColour pc){
		if (pc.equals(PieceColour.WHITE)){
			this.colour=PieceColour.WHITE;
			this.setSymbol("♘");
		}
		else if (pc.equals(PieceColour.BLACK)){
			this.colour=PieceColour.BLACK;
			this.setSymbol("♞");
		}
	}

	@Override
	public boolean isLegitMove(int i0, int j0, int i1, int j1) {
	if (Board.hasPiece(i1, j1)) {
		if (Board.getPiece(i1, j1).getColour().equals(getColour())) {
			return false;
		}
	}
	int iChange = i1 - i0;
	int jChange = j1 - j0;
	if (iChange != 0 && jChange != 0 && iChange != jChange) {
		switch (iChange + jChange) {
			case 3:
			case 1:
			case -1:
			case -3: return true;
		}
	}
	return false;
	}
}
