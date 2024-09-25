package textFiles;


import java.util.Scanner;
import java.io.*;




public class evenOdd {

	public static void main(String[] args) throws IOException{
		Scanner reader = new Scanner (new File("EvenOdd.txt"));
		
		int countEven = 0, countOdd = 0, max = 0;
		
		while(reader.hasNext()) {
			int number = reader.nextInt();
			
			if(number % 2 ==0)
				countEven++;
			else
				countOdd++;
			
			if(number > max)
				max = number;
		}
	System.out.println("Total even # " + countEven);
	System.out.println("Total odd # " + countOdd);
	System.out.println("Max # " + max);
	
	
	reader.close();
	
	
	}

}
