package Challenges;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: shannonholgate
 * Date: 25/03/2014
 * Time: 19:58
 * To change this template use File | Settings | File Templates.
 */
public class Pangrams {

    static HashMap<Character,Integer> charCount = new HashMap<Character, Integer>();
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[]args) {
        createList();
        int noOfEntries = keyboard.nextInt();
        String[] sentence = new String[noOfEntries];

        for(int i = 0; i< noOfEntries; i++) {
            sentence[i] = keyboard.next();
        }

        for (String word : sentence) {
            String lowerWord  = word.toLowerCase();
            for (char letter : lowerWord.toCharArray()) {
                charCount.put(letter,charCount.get(letter)+1);
            }
        }

        System.out.println(!charCount.containsValue(0));
        for (char letter : charCount.keySet()) {
            System.out.print(letter + ": " + charCount.get(letter) + " ");
        }
    }

    private static void createList() {
        for (int i=(int)'a';i<=(int)'z';i++) {
            charCount.put((char)i,0);
        }
    }
}
