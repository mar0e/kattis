import java.util.Scanner;

public class SimonSays {
	
	static Scanner sc = new Scanner(System.in);
	static int commandAmount;
	static String[] commands;
	
	public static void main(String[] args) {
		readInput();
	}
	
	public static void readInput() {
		
		takeInput();
		for (String command : commands) {
			System.out.println(command);
		}
		
	}
	
	public static void takeInput() {
		
		while (sc.hasNextInt()) {
			commandAmount = Integer.parseInt(sc.nextLine());
			break;
		}
		
		commands = new String[commandAmount];
		
		if (commandAmount > 0) {
			
			String[] lines;
			String line;
			int commandCounter = 0;
			
			while (sc.hasNextLine()) {
				
				for (int i=0; i<commandAmount; i++) {
				
					lines = sc.nextLine().split(" ");
					line = "";
				
					if (lines.length > 1) {
						if (lines[0].equals("Simon") & lines[1].equals("says")){
							for (int j=2; j<lines.length; j++) {
								line += lines[j] + " ";
							}
						}
					} 
				
					commands[commandCounter] = line;
					commandCounter++;
				}
				
				break;

			}
		}
	}
	
}
