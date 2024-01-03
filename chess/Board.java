package chess;


//This class is partially implemented
public class Board {
	private static Square [][] board = new Square[8][8];

	//This method should not be edited
	public static void initialiseBoard(){
		for (int i=0; i<board[0].length; i++){
			for (int j=0; j<board[1].length; j++)
					board[i][j]=new Square();
		}		
	}
    
	//This method requires your input	
	public static void initialisePieces(){

		for (int n = 0; n < 8; n += 7){ 
			Rook rook = new Rook(PieceColour.BLACK);
			rook.setSymbol("♜");
			Board.setPiece(0,n,rook);
		}
		for (int n = 1; n < 7; n += 5){ 
			Knight knight = new Knight(PieceColour.BLACK);
			knight.setSymbol("♞");
			Board.setPiece(0,n,knight);
		}
		for (int n = 2; n < 6; n += 3){ 
			Board.setPiece(0,n,new Bishop(PieceColour.BLACK));
		}
		for (int n = 0; n < 8; n++){ 
			Board.setPiece(1,n,new Pawn(PieceColour.BLACK));
		}

		Board.setPiece(0,4,new King(PieceColour.BLACK));
		Board.setPiece(0,3,new Queen(PieceColour.BLACK));

		for (int n = 0; n < 8; n += 7){ 
			Rook rook = new Rook(PieceColour.WHITE);
			rook.setSymbol("♖");
			Board.setPiece(7,n,rook);
		}
		for (int n = 1; n < 7; n += 5){ 
			Knight knight = new Knight(PieceColour.WHITE);
			knight.setSymbol("♘");
			Board.setPiece(7,n,knight);
		}
		for (int n = 2; n < 6; n += 3){ 
			Board.setPiece(7,n,new Bishop(PieceColour.WHITE));
		}
		for (int n = 0; n < 8; n++){ 
			Board.setPiece(6,n,new Pawn(PieceColour.WHITE));
		}

		Board.setPiece(7,3,new King(PieceColour.WHITE));
		Board.setPiece(7,4,new Queen(PieceColour.WHITE));
	}
	
	//This method requires your input	
	public static void printBoard(){
		System.out.print("\n  a b c d e f g h \n");
		System.out.print("  -----------------\n");		
		for (int i=0; i<board[0].length; i++){
			int row=i+1;
				for (int j=0; j<board[1].length; j++){
					if ((j==0) && Board.hasPiece(i,j))
						System.out.print(row+" "+Board.getPiece(i,j).getSymbol());	
					else if ((j==0) && !Board.hasPiece(i,j))
						System.out.print(row+"  " );
					else if (Board.hasPiece(i,j))					
						System.out.print("|"+Board.getPiece(i,j).getSymbol());					
					else					
						System.out.print("| ");		
				}				
				System.out.print("  "+row+"\n");
		}
		System.out.print("  -----------------");
		System.out.print("\n  a b c d e f g h \n");	
	}
	
	//This method requires your input	
	public static boolean movePiece(int i0, int j0, int i1, int j1, Piece p){
		
		setPiece(i1,j1,p);
		setPiece(i0,j0,null);
		return false;
	}

	//This method requires your input
	public static void setPiece(int iIn, int jIn, Piece p){
		if (p == null){
			board[iIn][jIn].removePiece();

		}else{
			board[iIn][jIn].setPiece(p);
		}
	}
	
	//This method requires your input
	public static Piece getPiece(int iIn, int jIn){
		return board[iIn][jIn].getPiece();
	}
	
	//This method requires your input
	public static boolean hasPiece(int i, int j){		
		if(board[i][j].hasPiece()){
			return true;
		}else{
			return false;
		}
	}


}
