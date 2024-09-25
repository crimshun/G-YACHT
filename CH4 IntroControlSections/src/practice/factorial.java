package practice;




import java.util.Scanner;




public class factorial {

	public static void main(String[] args) {
		Scanner sept = new Scanner(System.in);
		
		System.out.print("{Enter Number: ");
		int n = sept.nextInt();
		
		int product = 1;
		String str = n+"! = ";
		
		
		while(n >= 1) {
			
			product *= n;
			
			str += n + " * ";
			n--;
			
			
			
			
			System.out.println("\n" + str + product);
		}

	}

}
