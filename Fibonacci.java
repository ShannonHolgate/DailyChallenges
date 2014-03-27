public class Fibonacci {
	public static void main(String[]args) {
		long input = Long.parseLong(args[0]);

		/**for(long i=1; i<=input;i++) {
			System.out.println(fibonacci(i) + " ");
		}**/
		fibonacciIter(input);
	}

	static long fibonacci(long n) {
		if (n==1||n==2) return 1;
		return fibonacci(n-1) + fibonacci(n-2);
	}

	static void fibonacciIter(long n) {
		long previousOne = 0, previousTwo = 1;
		for (long i=1;i<n;i++) {
			long calc = previousOne + previousTwo;
			System.out.println(calc);
			previousOne = previousTwo; previousTwo = calc;
		}
	}
}