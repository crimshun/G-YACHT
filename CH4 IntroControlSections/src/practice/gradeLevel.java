package practice;

import java.util.Scanner;
import java.util.Random;



public class gradeLevel {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		Random gen = new Random();
		
		while(true) {
			
			System.out.print("\nEnter grade level");
			int grd = reader.nextInt();
			
			if (grd == -1) break;
			
			else if (grd < 9)  
				System.out.println("try again...");
			
			
			else if (grd > 12)  
				System.out.println("try again...");
			
			else {
			reader.nextLine();
			System.out.print("Enter name: ");
			String nm = reader.nextLine();
			
			int yr;
			
			int salary = gen.nextInt(99999 - 50000 + 1) + 50000;
			if (grd == 9) yr = 2028;
			else if (grd == 10) yr = 2027;
			else if (grd == 11) yr = 2026;
			else  yr = 2025;
			
			System.out.print("\n********************\n");
			System.out.print("\t" + nm + " graduates in " + yr + " with a salary of $" + salary);
			}
		
		
		}
	}
}
