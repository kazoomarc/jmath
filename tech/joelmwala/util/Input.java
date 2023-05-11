package tech.joelmwala.util;

import java.util.Scanner;

/**
 * @author Joel Mwala
 * @version 1.0
 */
public class Input {
    private static final Scanner in = new Scanner(System.in);

    // it works
    public static String input(String prompt) {
        System.out.print(prompt);
        return in.nextLine();
    }

    // get integer from stdin
    public static int getInt(String prompt) {
        try {
            System.out.print(prompt);
            return Integer.parseInt(in.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input! <Integer> Required");
            return Integer.MIN_VALUE;
        }
    }

    // get a Double from stdin
    public static double getDouble(String prompt) {
        try {
            System.out.print(prompt);
            return Double.parseDouble(in.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input! <Double> Required");
            return Double.MIN_VALUE;
        }
    }

    // get a String from stdin
    public static String getString(String prompt) {
        System.out.print(prompt);
        return in.nextLine();
    }

    // get a Double from stdin
    public static boolean getBoolean(String prompt) {
        try {
            System.out.print(prompt);
            return Boolean.parseBoolean(in.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input! <Boolean> Required");
            return false;
        }
    }

    // get a Double from stdin
    public static char getChar(String prompt) {
        try {
            System.out.print(prompt);
            return (in.nextLine()).charAt(0);
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input! <Character> Required");
            return Character.MIN_VALUE;
        }
    }

    // todo: String getLine()
    public static String getLine(String prompt) {
        return input(prompt);
    }
    // todo: int getIntInRange()
    // todo: int getIntList()
    // todo: char getCharInList()
    // todo: char getCharList()
    // todo: float getFloatInRange()
    // todo: getPassword()
    // todo: Date getDate()
    // todo: int[] getIntArray()
    // todo: List getStringList()

    // todo: Evaluate()
    /**
     * input(FormatSpecifier(s) x)
     * work like scanf() of c
     */

    /**
     * int eval(expression)
     * like thato of python language
     */
}