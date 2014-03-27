import java.io.*;
public class IntsFromFile {
	public static void main(String[]args) throws Exception{
		BufferedReader reads = new BufferedReader(new FileReader("intInput.txt"));
		String line = new String();
		long total = 0;

		while((line = reads.readLine())!= null) {
			try {
				total+=Long.parseLong(line);
			} catch (NumberFormatException ne) {
				ne.printStackTrace();
			}
		}
		System.out.println(total);
	}
}