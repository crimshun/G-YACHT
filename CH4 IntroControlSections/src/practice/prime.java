package practice;



import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
		Scanner chase = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int n = chase.nextInt();
		
		
		int i;
		
		for(int i = 2; n <= n/2; n++) {
			
			if (i % i == 0)
				break;
			
		}
			if (i < n/2)
				System.out.println("not prime");
			else 
				System.out.println("prime");
		
				
}}



