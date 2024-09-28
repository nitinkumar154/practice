package recursion;

public class SumofDigits {

	public static void main(String[] args) {
		
		
		int num = 12345;
		int sum = sum(num);
		System.out.println(sum);

	}

	private static int sum(int num) {
		if (num==0) {
			return 0;
			
		}
		
		int lastDigit = num%10;
		int remender = num/10;
		
		return lastDigit+sum(remender);
	}

}
