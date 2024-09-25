package textFiles;

import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class luckySeven {

	public static void main(String[] args)throws IOException {
		
		Scanner reader = new Scanner(System.in);
		Random generator = new Random();
	
		PrintWriter pw = new PrintWriter(new File("luckyseven.txt"));
		
		
	int die1, die2,
		dollars,
		count,
		maxDollars,
		countAtMax;
		
	System.out.print("How many dollars do you have? ");
	dollars = reader.nextInt();
	
	maxDollars = dollars;
	countAtMax = 0;
	count = 0;
	
	pw.write("turn" + "\tDie #1" +"\tDie #2")
	
	
	while (dollars > 0) {
		count++;
		
		die1 = generator.nextInt (6) + 1;
		die2 = generator.nextInt (6) + 1;
	if (die1 + die2 == 7)
		dollars += 4;
	else
		dollars -= 1;
	
	if (count < 10)
		pw.write(count + ". \t\t" + die1 + "\t\t" + die2 + "\t\t" + dollars+ "\n");
	else
		pw.write(count + ". \t\t" + die1 + "\t\t" + die2 + "\t\t" + dollars+ "\n");
	
	
	if (dollars > maxDollars) {
		maxDollars = dollars;
		countAtMax = count;
		
	System.out.println("You are broke after " + count + "rolls.\n" + "You should have quit after " + countAtMax + " rolls when you had $" + maxDollars + ".");
	
	pw.close();

	}
		
	}
		
		
	
		
		
		
	}

	private static Writer (String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
