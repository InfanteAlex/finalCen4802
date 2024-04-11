package org.example;


import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scan.nextInt();
        System.out.print("The " + n + "th " + "term in the fibonacci sequence is " + fibonacciRecurse(n));

    }


    public static int fibonacciRecurse(int n) {
        if (n <= 1) {
            return n;
        } else {
             return(fibonacciRecurse(n - 1) + fibonacciRecurse(n - 2));
        }

    }
}