package chess;

public class Knight extends Piece{
	public Knight (PieceColour p){
		super();
        this.colour = p;
	}
	@Override
	public boolean isLegitMove(int i0, int j0, int i1, int j1){
        int lenghti = i1-i0;
        int lenghtj = j1-j0;
        int squared_distance = (lenghti)*(lenghti)+(lenghtj)*(lenghtj);
        if (Board.hasPiece(i1,j1)){
            if (Board.getPiece(i1,j1).colour != colour && squared_distance == 5){
                return true;
            }else{
                return false;
            }
        }else{
            if (squared_distance == 5){
                return true;
            }else{
                return false;
            }
        }
    }
}
