
public class Main {
	// main for KattisScore
	public static void main(String[] args) {
		
		KattisScore ks = new KattisScore();
		
		int students = ks.takeInput();
		double gs = ks.findGroupScore(students, ks.getScores());
		
		System.out.println(gs);
		
		double avg = ks.findAverage();
		
		System.out.println(avg);
	}
}
