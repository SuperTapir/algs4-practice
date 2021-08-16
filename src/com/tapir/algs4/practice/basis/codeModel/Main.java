package com.tapir.algs4.practice.basis.codeModel;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Main {
    // 1.1.3
    static void isThreeNumberEqual() {
        double[] arr = new double[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = StdIn.readDouble();
        }
        if (arr[0] == arr[1] && arr[1] == arr[2]) {
            StdOut.println(true);
        } else {
            StdOut.println(false);
        }
    }

    // 1.1.5
    static void isBetweenOneToZero() {
        double x = StdIn.readDouble();
        double y = StdIn.readDouble();
        if ((x > 0 && x < 1) && (y > 0 && y < 1)) {
            StdOut.println(true);
        } else {
            StdOut.println(false);
        }
    }

    // 1.1.6 简易的斐波那契序列
    static void fibonacci() {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }

    // 1.1.7
    static void foo() {
        double t = 9.0;

        while (Math.abs(t - 9.0 / t) > .001)
            t = (9.0 / t + t) / 2.0;

        StdOut.printf("%.5f\n", t);
    }

    static void foo2() {
        int sum = 0;
        // (1000 * 999) / 2 = 499500
        // 等差数列求和 (n * (n -1)) / 2
        for (int i = 1; i < 1000; i++)
            for (int j = 0; j < i; j++)
                sum++;
        StdOut.println(sum);
    }

    static void foo3() {
        int sum = 0;
        for (int i = 1; i < 1000; i *= 2)
            for (int j = 0; j < 1000; j++)
                sum++;
        StdOut.println(sum);
    }

    // 1.1.9
    static void toBinaryStr(int N) {
        String s = "";
        for (int n = N; n > 0; n /= 2) {
            s = (n % 2) + s;
        }
        StdOut.println(s);
    }

    // 1.1.11
    static void print2DBooleanArray() {
        Boolean[][] array = {
                {true, false, false},
                {true, true, true},
                {false, false, true},
        };
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                String result = array[x][y] ? "* " : "  ";
                StdOut.print(result);
            }
            StdOut.println();
        }
    }

    // 1.1.12
    static void foo4() {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = 9 - i;
        for (int i = 0; i < 10; i++)
            a[i] = a[a[i]];
        for (int i = 0; i < 10; i++)
            System.out.print(a[i]);
    }

    // 1.1.13
    static void swap2dArray(int[][] array, int w, int h) {
        int[][] result = new Ar
    }

    public static void main(String[] args) {
        foo4();
    }
}
