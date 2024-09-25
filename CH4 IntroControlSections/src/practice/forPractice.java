package practice;



import java.util.Scanner;
public class forPractice {

	public static void main(String[] args) {
		Scanner feshal = new Scanner(System.in);
		int sum = 0;
		String str = "";
		
		System.out.print("Enter initial: ");
		int inital = feshal.nextInt();
		System.out.print("\nEnter Terminal: ");
		int term = feshal.nextInt();
		
		for (int n = init; n <= term; n++) {
			sum+=n;
			if(n < term)
				str += n + " + ";
			else
				str += n " = " +sum;
			System.out.println(str);
			
		
		/* for(int i = 20 ; i <= 100; i+=3) {
			
			sum  += i;
			if (i < 107)
				str = i + " + ";
			else
				str = i + " = " + sum;
			
			System.out.println(str );
	*/
		}
			
	}

}
