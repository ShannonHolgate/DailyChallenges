public class Factorial {
	public static void main(String[]args) {
		long input = Long.parseLong(args[0]);
		System.out.println(input);
		System.out.println(factorialIter(input));
	}

	static long factorial(long n) {
		if (n==1) return (long)1;
		return n * factorial(n-1);
	}

	static long factorialIter(long n) {
		long bigVAL = n;
		for(long i=n-1;i>0;i--) {
			bigVAL*=i;
		}
		return bigVAL;
	}
}