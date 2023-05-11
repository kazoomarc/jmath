package tech.joelmwala.util;

import java.util.Scanner;

/**
 * @author Joel Mwala
 * @version 1.0
 */
public class Input {
    private static final Scanner in = new Scanner(System.in);

    //
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
        }
        return NULL;
    }

    // get a Double from stdin
    public static double getDouble(String prompt) {
        try {
            System.out.print(prompt);
            return Double.parseDouble(in.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input! <Double> Required");
        }
        return NULL;
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
        }
        return NULL;
    }

    // get a Double from stdin
    public static char getChar(String prompt) {
        try {
            System.out.print(prompt);
            return (in.nextLine()).charAt(0);
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input! <Character> Required");
        }
        return NULL;
    }

    // todo: String getLine()
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