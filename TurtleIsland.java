import java.util.ArrayList;
import java.util.Scanner;

public class TurtleIsland {
	
	Scanner sc = new Scanner(System.in);
	int cases = 0;
	
	public ArrayList<Integer> takeInput() {
		
		ArrayList<Integer> turtleAmounts = new ArrayList<>();
		
		while (sc.hasNextInt()) {
			cases = Integer.parseInt(sc.nextLine());
			break;
			
		}
		
		for (int i=0; i<cases; i++) {
			
			int prev = -1;
			int curr = 1;
			int sum = 0;
			
			while (sc.hasNextLine() & curr > 0) {
			
				if (prev < 0) {
					prev = sc.nextInt();
				}	
			
				curr = sc.nextInt();
			
				if ((prev * 2) < curr) {
					sum += curr - (prev * 2);
				}
			
				prev = curr;
			
			}
			
			turtleAmounts.add(sum);
		
		}
		
		return turtleAmounts;
		
	}
}
