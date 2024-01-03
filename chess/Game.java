package chess;
import java.io.Console;

public class Game {
	private static boolean gameEnd=false;

	//This method requires your input
	public static void play(){
		Console console = System.console();
		String originIn,destinationIn;
		String convertJ = "abcdefgh";
		CheckInput checker = new CheckInput();
		Piece p;

		while (!gameEnd){
			for(PieceColour c: PieceColour.values()){
				int i0 = 0;
				int j0 = 0;
				int i1 = 0;
				int j1 = 0;
				while(true){
					System.out.printf("\n ------ %s move ------ \n", c.toString());
					originIn =console.readLine("> Enter origin:");
					if(checker.checkCoordinateValidity(originIn)){
						i0 = Integer.parseInt(String.valueOf(originIn.charAt(0)))-1;
						j0 = convertJ.indexOf(originIn.charAt(1));
						p=Board.getPiece(i0,j0);
						if(!(Board.hasPiece(i0,j0) && String.valueOf(c) == String.valueOf(p.getColour()))){
							System.out.printf("\n Please pick a piece of colour %s \n", c.toString());
							continue;
						}
					}else{
						if((originIn.toUpperCase()).equals("END")){
							gameEnd=true;
							break;
						}
						System.out.println("\n Invalid input, choose a number from 1 to 8 followed by a letter from 'a' to 'h' \n");
						continue;
					}

					destinationIn =console.readLine("> Enter destination:");
					if(checker.checkCoordinateValidity(destinationIn)){
						i1 = Integer.parseInt(String.valueOf(destinationIn.charAt(0)))-1;
						j1 = convertJ.indexOf(destinationIn.charAt(1));
					}else{
						if((originIn.toUpperCase()).equals("END")){
							gameEnd=true;
							break;
						}
						System.out.println("\n Invalid input, choose a number from 1 to 8 followed by a letter from 'a' to 'h' \n");
						continue;
					}	
					if (p.isLegitMove(i0,j0,i1,j1)){
						if (Board.movePiece(i0,j0,i1,j1,p)){
							gameEnd=true;
						}
						Board.printBoard();
						break;
					}else{
						System.out.println("\n This is not a legitimate move, try again. \n");
						continue;
					}
				}
				if (gameEnd){
					break;

				}
			}
		}
	}		
	//This method should not be edited
	public static void main (String args[]){
		Board.initialiseBoard();
		Board.initialisePieces();
		Board.printBoard();
		Game.play();	}
}
