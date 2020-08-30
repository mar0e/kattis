import java.util.Scanner;

public class Carrots {
	static Scanner sc = new Scanner(System.in);
	static int first = 0;
	static int second = 0;
	
	// execute program
	public static void main(String[] args) {
		giveCarrots();
	}
	// modify input
	public static void giveCarrots() {
		readCarrots();
		System.out.println(second);
	}
	// take input
	public static void readCarrots() {
		
		while (sc.hasNextInt()) {
			String[] split = sc.nextLine().split(" ");
			first = Integer.parseInt(split[0]);
			second = Integer.parseInt(split[1]);
			break;
		}
		
		int counter = 0;
		while (sc.hasNextLine() & first > 0) {
			sc.nextLine();
			counter++;
			if (counter == first) { break; }
		}
	}
}
