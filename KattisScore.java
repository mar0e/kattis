import java.util.ArrayList;
import java.util.Scanner;

// https://open.kattis.com/problems/schoolspirit
public class KattisScore {
	Scanner sc = new Scanner(System.in);
	int students = 0;
	ArrayList<Integer> scores;
	
	public double findAverage() {
		
		double[] averages = new double[students];
		ArrayList<Integer> newScores = new ArrayList<>();
		
		if (scores.size() > 1) {
			
			int removed = -1;
			
			for (int i=0; i<students; i++) {
				
				if (removed >= 0) { newScores.add(i-1, removed); }
				
				newScores = scores;
				
				removed = newScores.get(i);
				
				newScores.remove(i);
				
				averages[i] = findGroupScore(students-1, newScores);
		
			}
		}
		
		double sum = 0;
		
		if (averages.length > 0) {
			
			for (double d : averages) {
				sum += d;
			}
		}
		
		double s = (double) students;
		
		return (sum / s);
		
	}
	
	public double findGroupScore(int newStudents, ArrayList<Integer> newScores) {
		
		double[] sumsBeforeDivision = new double[newStudents];
		
		if (newScores.size() > 0) {
			
			sumsBeforeDivision[0] = newScores.get(0);
			
			if (newStudents > 1) {
				
				for (int i=1; i<newStudents; i++) {
					
					sumsBeforeDivision[i] = (Math.pow(4, i)) / (Math.pow(5, i)) * newScores.get(i);
					
				}
			}
		}
		
		double finalSum = 0;
		
		if (sumsBeforeDivision.length > 1) {
			
			for (double sum : sumsBeforeDivision) {
				
				finalSum += sum;
			}
			
			finalSum *= (1.0 / 5.0);
		}
		
		else if (sumsBeforeDivision.length == 1) {
			
			finalSum = (sumsBeforeDivision[0] * (1.0 / 5.0));
		}
		
		return finalSum;
	}
	
	public ArrayList<Integer> getScores() {
		return scores;
	}
	
	public int takeInput() {
		
		while (sc.hasNextInt()) {
			students = Integer.parseInt(sc.nextLine());
			break;
		}
		
		scores = new ArrayList<>();
		
		if (students > 1) {
			
			for (int i=0; i<students; i++) {
				
				scores.add(Integer.parseInt(sc.nextLine()));
			}
		}
		
		return students;
	}
}
