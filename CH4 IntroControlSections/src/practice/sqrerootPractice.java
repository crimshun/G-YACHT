package practice;

public class sqrerootPractice {

	public static void main(String[] args) {
		int n = 25;
		
		while (n >= 0) {
			
			int n = 25;
			String str = "";
			
			while (n >= 0) {
				
				str += Math.sqrt(n) + "\n";
				n-=5;
				
				System.out.println(str);
			}
		}
	}

}
