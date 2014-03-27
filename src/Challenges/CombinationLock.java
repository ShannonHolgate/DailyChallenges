package Challenges;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: shannonholgate
 * Date: 25/03/2014
 * Time: 21:09
 * To change this template use File | Settings | File Templates.
 */
public class CombinationLock {
    public static void main (String[]args) {
        String input = new Scanner(System.in).nextLine();
        String[] inputArray = input.split(" ");
        int[] intInputArray = new int[inputArray.length];

        for(int i = 0; i<inputArray.length;i++) {
            intInputArray[i] = Integer.parseInt(inputArray[i]);
        }

        ComboLock comboLock = new ComboLock(intInputArray[0]);
        comboLock.spin(2);
        comboLock.turnForward(intInputArray[1]);
        comboLock.spin();
        comboLock.turnBack(intInputArray[2]);
        comboLock.turnForward(intInputArray[3]);

        System.out.println(comboLock.getTurnsMade());

    }

}
interface wheel {
    public String wheelType();
}
interface key {
    public String keyType();
}

abstract class Lock {
    private final static int something;
    private int size;
    private int turnsMade = 0;
    private int currentPosition = 0;

    int getSize() {
        return size;
    }

    void setSize(int size) {
        this.size = size;
    }

    int getTurnsMade() {
        return turnsMade;
    }

    void setTurnsMade(int turnsMade) {
        this.turnsMade = turnsMade;
    }

    int getCurrentPosition() {
        return currentPosition;
    }

    void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    void spin() {
        this.setTurnsMade(getTurnsMade()+getSize());
    }

    void spin(int times) {
        for (int i=1;i<=times;i++) {
            this.setTurnsMade(getTurnsMade()+getSize());
        }
    }

    void turnForward(int position) {
        int currentPosition = this.getCurrentPosition();
        int turns = position-currentPosition;
        this.setTurnsMade((turns<0)?getTurnsMade()+getSize()+(turns*-1):getTurnsMade()+turns);
        this.setCurrentPosition(position);
    }

    void turnBack(int position) {
        int currentPosition = this.getCurrentPosition();
        int turns = currentPosition - position;
        this.setTurnsMade((turns<0)?getTurnsMade()+getSize()-(turns*-1):getTurnsMade()+turns);
        this.setCurrentPosition(position);
    }

    static() {
        something=5;
    }

    public Lock(int size) {
        setSize(size);
    }
}

class ComboLock extends Lock implements key{
    public ComboLock(int size) {
        super(size);
    }

    @Override
    public String keyType() {
        return "5 Barrel";
    }
}
