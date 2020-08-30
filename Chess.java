import java.util.Scanner;

public class Chess {

	public static void main(String[] args) {
		readOutput();
	}
	
	public static int[] fixPieces(int kings, int queens, int rooks, int bishops, int knights, int pawns){
		
		int finalKings = 0;
		int finalQueens = 0;
		int finalRooks = 0;
		int finalBishops = 0;
		int finalKnights = 0;
		int finalPawns = 0;
		
		//  checking kings
		finalKings = (finalKings + 1) - kings;

		// checking queens
		finalQueens = (finalQueens + 1) - queens;

		// checking rooks
		finalRooks = (finalRooks + 2) - rooks;
		
		// checking bishops
		finalBishops = (finalBishops + 2) - bishops;
		
		// checking knights
		finalKnights = (finalKnights + 2) - knights;
		
		// checking pawns
		finalPawns = (finalPawns + 8) - pawns;
		
		int[] output = {finalKings, finalQueens, finalRooks, finalBishops, finalKnights, finalPawns};
		
		return output;
	}
	
	public static void readOutput() {
		Scanner sc = new Scanner(System.in);
		int kings = sc.nextInt();
		int queens = sc.nextInt();
		int rooks = sc.nextInt();
		int bishops = sc.nextInt();
		int knights = sc.nextInt();
		int pawns = sc.nextInt();
		
		int[] output = fixPieces(kings, queens, rooks, bishops, knights, pawns);
		for (int i : output) {
			System.out.print(i + " ");
		}
	}
	
}
