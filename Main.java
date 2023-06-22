import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Tictactoe game = new Tictactoe();
		String player = "X";
		
		do {
			System.out.println(game.printTTT());
			System.out.println("enter row for " + player + ": ");
			int row = input.nextInt();
			System.out.println("enter column for " + player + ": ");
			int column = input.nextInt();
			game.makeMove(row,  column, player);
			if(game.winConditions()) {
				System.out.println(game.printTTT() + "\n" + player +" wins!");
				break;
			}
			if(player == "X") {
				player = "O";				
			}
			else {
				player = "X";
			}
		}while(true);
		System.out.println("Goodbye!..");

	}

}