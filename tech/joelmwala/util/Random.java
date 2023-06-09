package tech.joelmwala.util;

public class Random {
    // todo - works like a normal random

    // todo - power of the range

    public static double random(int n) {
        return xrandom(0, n);
    }

    public static double xrandom(int n) {
        return (Math.random() * (n));
    }

    public static double irandom(int n) {
        return (Math.random() * (n + 1));
    }

    public static double xrandom(int start, int end) {
        return start + (Math.random() * (end - start));
    }

    public static double ibrandom(int start, int end) {
        return start + (Math.random() * (end - start - 1));
    }

    public static double ierandom(int start, int end) {
        return (start + 1) + (Math.random() * (end - start));
    }

    // todo - normal random returns an int
    public static int randomInt(int n) {
        return (int) random(n);
    }

    public static int xrandomInt(int n) {
        return (int) xrandom(0, n);
    }

    public static int irandomInt(int n) {
        return (int) (Math.random() * (n + 1));
    }

    public static int xrandomInt(int start, int end) {
        return (int) xrandom(start, end);
    }

    public static int ibrandomInt(int start, int end) {
        return (int) (start + Math.random() * (start - end - 1));
    }

    public static int ierandomInt(int start, int end) {
        return (int) (start + Math.random() * (start - end));
    }
}
