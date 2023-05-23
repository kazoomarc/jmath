package tech.joelmwala.util;

public class Random {
    // todo - works like a normal random

    public static double random(int n) {
        return (Math.random() * n);
    }

    public static double xrandom(int n) {
        return (Math.random() * n);
    }

    public static double irandom(int n) {
        return (Math.random() * n);
    }

    public static double xrandom(int start, int end) {
        return 0.0;
    }

    public static double ibrandom(int start, int end) {
        return 0.0;
    }

    public static double ierandom(int start, int end) {
        return 0.0;
    }

    // todo - normal random returns an int
    public static int randomInt(int n) {
        return (int) (Math.random() * n);
    }

    public static int xrandomInt(int n) {
        return (int) (Math.random() * n);
    }

    public static int irandomInt(int n) {
        return (int) (Math.random() * n);
    }

    public static int xrandomInt(int start, int end) {
        return 0;
    }

    public static int ibrandomInt(int start, int end) {
        return 0;
    }

    public static int ierandomInt(int start, int end) {
        return 0;
    }
}
