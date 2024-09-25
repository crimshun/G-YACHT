package practice;



import java.util.Scanner;
public class properDivisors {

	public static void main(String[] args) {
		Scanner chase = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int n = chase.nextInt();
		
		String str = n + ": ";
		
		for(int i = 2; n <= n/2; n++) {
		
				if(n%i == 0);
				str += i + ", ";
				
		}
				System.out.println("\n"+str);
}}
