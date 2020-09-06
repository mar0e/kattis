import java.util.Scanner;

public class HeartRate {
	static Scanner sc = new Scanner(System.in);
	static int caseAmount = 0;
	
	public static void main(String[] args) {
		readInput();
	}
	
	public static void readInput() {
		float[] cases = takeInput();
		int caseCounter = 0;
		
		for (int i=0; i<caseAmount; i++) {
			System.out.print(cases[caseCounter] + " "); caseCounter++;
			System.out.print(cases[caseCounter] + " "); caseCounter++;
			System.out.println(cases[caseCounter]); caseCounter++;
		}
	}
	
	public static float[] takeInput() {
		
		while (sc.hasNextInt()) {
			
			String s = sc.nextLine();
			caseAmount = Integer.parseInt(s);
			break;
			
		}
		
		final int DATA_PER_CASE = 3;
		int iterations = 0;
		int counter = 0;
		float[] cases = new float[caseAmount * DATA_PER_CASE + 2];
		float beats = 0;
		float seconds = 0;
		float bpm = 0;
		float abpmMin = 0;
		float abpmMax = 0;
		
		while (sc.hasNextLine() & caseAmount > 0) {
	
			String[] strings = sc.nextLine().split(" ");
			beats = Float.parseFloat(strings[0]);
			seconds = Float.parseFloat(strings[1]);
			
			bpm = (beats * 60) / seconds;
			
			abpmMin = bpm - (60 / seconds);
			
			abpmMax = bpm + (60 / seconds);
			
			cases[counter] = abpmMin; counter++;
			cases[counter] = bpm; counter++;
			cases[counter] = abpmMax; counter++;

			iterations++;
			if (iterations == caseAmount) { break; }
			
		}
		return cases;
	}
}
