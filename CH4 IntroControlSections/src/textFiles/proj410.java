package textFiles;

import java.util.Scanner;
import java.io.*;


public class proj410 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		PrintWriter pw = new PrintWriter(new File("schedule.txt"));
		
		double salary = 0.0, rate = 0.0;
		int yrs = 0;
		
		while(true) {
			System.out.print("Enter initial salary: $");
			salary = input.nextDouble();
			
			if (salary > 0) break;
			else System.out.print("try again");
			
		}
	
	
	while(true){
		System.out.print("Enter");
	}
	
	}
	
	

}
