public class Tictactoe {
	private String[][] board;
	private static final int ROWS = 3;
	private static final int COLUMNS = 3;
	private String regex = "\\s{3}";
	
	//Tictactoe constructor
	public Tictactoe() {
		board = new String[ROWS][COLUMNS];
		this.makeBoard();
	}
   
   //makes the player's move
	public void makeMove(int i,int j,String player) {
			board[i][j] = " "+player+" ";
	}
	
	//makes the board and fills it with empty spaces	
	public void makeBoard() {
		for(int i=0;i<ROWS;i++) {
			for(int j=0;j<COLUMNS;j++) {
				board[i][j]="   ";
			}
		}
	}
	
   // checking win conditions
	public boolean winConditions() {
		//checking diagonals
    	if(!board[0][0].matches(regex) && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]))
    		return true;
    	if(!board[0][2].matches(regex) && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]))
    		return true;
      //checking rows
    	for(int i=0;i<ROWS;i++) {
    		if(!board[i][0].matches(regex) && board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])) {    			
    			return true; 
    		}   			 			
    	}
      //checking columns
     	for(int j=0;j<COLUMNS;j++) {    		
    		if(!board[0][j].matches(regex) && board[0][j].equals(board[1][j]) && board[1][j].equals(board[2][j])) 
    			return true;  			
    	}
      // if nobody won
    	return false;
	}
	
   //prints the tic tac toe board 
	public String printTTT() {
		String strBoard = "";
		for(int i = 0; i < ROWS; i++) {
			for(int j = 0; j < COLUMNS; j++) {
				if(j == COLUMNS-1)
					strBoard += board[i][j];
				else
					strBoard += board[i][j] + "|";
			}
			if(i != ROWS-1)
				strBoard += "\n---+---+---\n";
		}
		return strBoard;
	}

}























