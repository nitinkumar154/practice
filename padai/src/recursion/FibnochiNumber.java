package recursion;

public class FibnochiNumber {
	
	public static void main(String[] args) {
	System.out.println(	fib(2));
		
	}
	
	public static int fib(int n ) {
		
		// base condition
		if(n==0 || n==1 )
			return n;
		
		
		return fib(n-1)+fib(n-2);
	}

}
