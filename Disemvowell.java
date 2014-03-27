import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Shannon
 * Date: 24/03/2014
 * Time: 22:21
 */
public class Disemvowell {

    public static void main(String[]args) {
        String input = new Scanner(System.in).nextLine();
        char[] vowels = {'a','e','i','o','u', ' '};
        ArrayList<Character> removed = new ArrayList<Character>();
        for (char vowel : vowels) {
            String tempInput = input.toLowerCase().replaceAll(""+vowel,"");
            for (int i = 0; i<input.length()-tempInput.length();i++) {
                removed.add(vowel);
            }
            input = tempInput;
        }

        System.out.println(input);
        for(Character vowell : removed) {
            System.out.print(vowell);
        }
    }
}
