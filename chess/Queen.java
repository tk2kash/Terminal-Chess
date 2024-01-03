package chess;

public class Queen extends Piece{
	public Queen (PieceColour p){
		super();
		this.colour = p;
		if (p.toString() == "BLACK") {
			setSymbol("♛");
		}else{
			if (p.toString() == "WHITE") {
				setSymbol("♕");
			}
		}
	}
	@Override
	public boolean isLegitMove(int i0, int j0, int i1, int j1){
    int x = i1-i0;
    int y = j1-j0;
    int poscheckx = Math.abs(x);
    int poschecky = Math.abs(y);
    if(poschecky == poscheckx){
	    if (Board.hasPiece(i1,j1)){
	    	if(Board.getPiece(i1,j1).colour != colour){
		        if (y < 0 && x < 0){
		            int step = Math.abs(x);
		            for (int n = 1; n < step ; n ++){
		                
		                if (Board.hasPiece(i0 - n , j0 - n)){
		                    return false ;
		                }
		            }    
		            return true;
		        }
		        if (y > 0 && x > 0){
		            int step = Math.abs(x);
		            for (int n = 1; n < step ; n ++){
		                
		                if (Board.hasPiece(i0 + n , j0 + n)){
		                    return false ;
		                }
		            }    
		            return true;
		        }	        
		        if (x > 0 && y < 0){
		            int step = Math.abs(y);
		            for (int n = 1; n < step ; n ++){
		                
		                if (Board.hasPiece(i0 + n , j0 - n)){
		                    return false ;
		                }
		            }    
		            return true;
		        }
		        if (x < 0 && y > 0){
		            int step = Math.abs(y);
		            for (int n = 1; n < step ; n ++){
		                
		                if (Board.hasPiece(i0 - n , j0 + n)){
		                    return false ;
		                }
		            }    
		            return true;	
		        }
		    }         
	        if (Board.getPiece(i1,j1).colour == colour){return false;}
	        if (y == 0 && x  == 0){return false;}


		}else{
			if (y < 0 && x < 0){
			            int step = Math.abs(x);
			            for (int n = 1; n < step ; n ++){
			                
			                if (Board.hasPiece(i0 - n , j0 - n)){
			                    return false ;
			                }
			            }    
			            return true;
			        }
			        if (y > 0 && x > 0){
			            int step = Math.abs(x);
			            for (int n = 1; n < step ; n ++){
			                
			                if (Board.hasPiece(i0 + n , j0 + n)){
			                    return false ;
			                }
			            }    
			            return true;
			        }	        
			        if (x > 0 && y < 0){
			            int step = Math.abs(y);
			            for (int n = 1; n < step ; n ++){
			                
			                if (Board.hasPiece(i0 + n , j0 - n)){
			                    return false ;
			                }
			            }    
			            return true;
			        }
			        if (x < 0 && y > 0){
			            int step = Math.abs(y);
			            for (int n = 1; n < step ; n ++){
			                
			                if (Board.hasPiece(i0 - n , j0 + n)){
			                    return false ;
			                }
			            }    
			            return true;	
			        }
		} 
    }

    if (Board.hasPiece(i1,j1)){
        if (Board.getPiece(i1,j1).colour != colour && y == 0 && x < 0){
            int posx = Math.abs(x);
            for (int n = 1; n < posx ; n ++){
                
                if (Board.hasPiece(i0 - n , j0)){
                    return false ;
                }
            }    
            return true;
        }else{
            if (Board.getPiece(i1,j1).colour != colour && y == 0 && x > 0){
                int posx = Math.abs(x);
                for (int n = 1; n < posx ; n ++){
                    
                    if (Board.hasPiece(i0 + n , j0)){
                        return false ;
                    }
                }    
                return true;
            }
        }
        if (Board.getPiece(i1,j1).colour != colour && x == 0 && y < 0){
            int posy = Math.abs(y);
            for (int n = 1; n < posy ; n ++){
                
                if (Board.hasPiece(i0  , j0 -n)){
                    return false ;
                }
            }    
            return true;
        }else{
            if (Board.getPiece(i1,j1).colour != colour && x == 0 && y > 0){
                int posy = Math.abs(y);
                for (int n = 1; n < posy ; n ++){
                    
                    if (Board.hasPiece(i0 , j0 + n)){
                        return false ;
                    }
                }    
                return true;
            }
        }
        if (Board.getPiece(i1,j1).colour == colour){return false;}
        if (y == 0 && x  == 0){return false;}
    }else{
        if (y == 0 && x < 0){
            int posx = Math.abs(x);
            for (int n = 1; n < posx ; n ++){
                
                if (Board.hasPiece(i0 - n , j0)){
                    return false ;
                }
            }    
            return true;
        }else{
            if (y == 0 && x > 0){
                int posx = Math.abs(x);
                for (int n = 1; n < posx ; n ++){
                    
                    if (Board.hasPiece(i0 + n , j0)){
                        return false ;
                    }
                }    
                return true;
            }
        }
        if (x == 0 && y < 0){
            int posy = Math.abs(y);
            for (int n = 1; n < posy ; n ++){
                
                if (Board.hasPiece(i0 , j0-n)){
                    return false ;
                }
            }    
            return true;
        }else{
            if (x == 0 && y > 0){
                int posy = Math.abs(y);
                for (int n = 1; n < posy ; n ++){
                    
                    if (Board.hasPiece(i0 , j0 + n)){
                        return false ;
                    }
                }    
                return true;
            }
        }        

        } 
    
return false;
}
}