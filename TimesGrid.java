public class TimesGrid {
	public static void main(String []args) {
		int number = 12;
		for (int i=1;i<=number;i++) {
			for(int j=1;j<=number;j++) {
				System.out.print(j*i +" ");
			}
			System.out.println();
		}
	}
}