package textFiles;

import java.util.Scanner;
import java.io. *;

public class warmUpRoster {

	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		File javaPd1 = new File("roster.txt");
		
		
		PrintWriter pw = new PrintWriter(javaPd1);
		
		
		
		
		while(true) {
			System.out.print("\nEnter name: ");
			String nm = reader.nextLine();
			
			if(nm.equals("")) break;
			
			
			pw.write(nm + "\n");
		}
	reader.close(); pw.close();
	
	
	}
	

}
