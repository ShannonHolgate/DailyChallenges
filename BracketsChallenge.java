/**
 * Created with IntelliJ IDEA.
 * User: Shannon
 * Date: 24/03/14
 * Time: 16:57
 */
public class BracketsChallenge {

    public static void main(String [] args) {
        String input = "[can {and it(it (mix) up ) } look silly]";

        String[] inputHeadSplit = input.split("[\\(\\[\\{]");
        String[] inputTailSplit = inputHeadSplit[inputHeadSplit.length-1].split("[\\)\\]\\}]");

        for(int i=0;i<inputTailSplit.length;i++) {
            System.out.print(inputTailSplit[i].concat(" " + inputHeadSplit[inputTailSplit.length-1-i] + " "));
        }
    }
}
