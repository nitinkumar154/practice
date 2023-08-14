package recursion;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 43782;
		int res = reverse(num, 0);
		System.out.println(res);
		

	}

	private static int reverse(int num,  int val) {
		
		if (num==0) {
			return val;
		}
		int lastDigit = num%10;
		int remender = num/10;
		val=  val*10+lastDigit;
				
		return reverse(remender, val);
		
	}

}
