import java.util.Scanner;

// https://open.kattis.com/problems/qaly
public class QualityOfLife {
	static double quality = 0;
	static int quantity = 0;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		quality = addResults();
		System.out.println(quality);
	}
	
	public static double addResults() {
		double[] results = readData();
		double sum = 0;
		
		for (double d : results) {
			sum += d;
		}
		return sum;
	}
	
	public static double[] readData() {
		
		while (sc.hasNextInt()) {
			quantity = sc.nextInt();
			sc.nextLine();
			break;
		}
		
		double[] results = new double[quantity];
		double result = 0;
		
		for (int i=0; i<quantity; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			result = x * y;
			results[i] = result;
		}
		
		return results;
	}
}
