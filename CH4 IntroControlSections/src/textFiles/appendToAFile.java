package textFiles;

import java.io.BufferedWriter;
import java.util.Scanner;

public class appendToAFile {

	public static void main(String[] args) throws IOException {
		
		
		Scanner reader = new Scanner(System.in);
		FileWriter fwriter = new FileWriter(new File("sample.txt"),true);
		BufferedWriter bf = new BufferedWriter(fwriter);
		
		
		while(true) {
			System.out.print("Enter number: ");
			int num = reader.nextInt();
			if (num == -1) break;
			
			bf.write(num + "\n");
		}
	
	bf.close(); reader.close();
	
	}
	
	

}
