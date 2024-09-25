package practice;

public class whilePractice {

	public static void main(String[] args) {
		int n = 10;
		int sum = 0;
		
		String str = "";
		
		
		while (n < 100) {
			sum += n;
			
			if (n < 94)
				str += n + " + ";
			else
				str += n + " = ";
			
			str += n +" + ";
			n+=7;
			
		
				}//end while
		
		
		//sum +=n;
		System.out.println (str + sum);
		

	}

}
