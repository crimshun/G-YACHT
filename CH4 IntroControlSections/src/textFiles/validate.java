package textFiles;

import java.util.Scanner;


public class validate {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		int number = 0;
		while(true) {
			
			System.out.print("Enter number: ");
			number = input.nextInt();
			
			if(number > 0) break;
			else System.out.println("must enter positive #'s");
			
			
			
			
		}
	}

}
