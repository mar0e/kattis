import java.util.Scanner;

public class CookingShow {
	static int winnerID = 1;
	static int counter = 1;
	static int[] scores = new int[5];
	static int winnerScore = 0;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		leaderboard();
		System.out.println(winnerID + " " + scores[winnerID-1]);
		sc.close();
	}
	
	public static void leaderboard() {
		
		int maxScore = 0;
		int currentScore = 0;
		counter = 1;
		
		// iterates over all scores and saves max score plus the unique ID for winner
		for (int i=0; i<5; i++) {
			currentScore = runShow();
			if (currentScore > maxScore) {
				winnerID = counter;
				maxScore = currentScore;
			}
			counter++;
		}
	}
	
	public static int addGrades(int[] grades) {
		
		// add all grades from an array and return a score
		int sum = 0;
		for (int g : grades) {
			sum += g;
		}
		return sum;
	}
	
	public static int runShow() {
		//Scanner sc = new Scanner(System.in);
		
		// take input from a line and parse to int
		String[] strings = null;
		
		while (sc.hasNextLine()) {
			if (strings == null)
				strings = sc.nextLine().split(" ");
			if (strings.length == 4) { break; }
		}
		
		int[] grades = new int[4];
		
		int c = 0;
		for (String s : strings) {
			grades[c] = Integer.parseInt(s);
			c++;
		}
		
		// add all grades to a score and add to array
		int score = addGrades(grades);
		scores[counter-1] = score;
		
		return score;
	}
}
