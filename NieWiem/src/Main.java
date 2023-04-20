import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = 10;
        int ileRazy = 100;

        System.out.println("for " + ileRazy);
        long startTime;
        startTime = System.nanoTime();
        for (int i = 0; i < ileRazy; i++) {
            Silnia.Rek(n);
        }
        System.out.println("silnia rek  " + n + "! zajelo " + (System.nanoTime() - startTime) + " nanosekund");

        startTime = System.nanoTime();
        for (int i = 0; i < ileRazy; i++) {
            Silnia.Iter(n);
        }
        System.out.println("silnia iter " + n + "! zajelo " + (System.nanoTime() - startTime) + " nanosekund");

        startTime = System.nanoTime();
        for (int i = 0; i < ileRazy; i++) {
            Fibonaci.Rek(n);
        }
        System.out.println("fib rek     " + n + "! zajelo " + (System.nanoTime() - startTime) + " nanosekund");

        startTime = System.nanoTime();
        for (int i = 0; i < ileRazy; i++) {
            Fibonaci.Iter(n);
        }
        System.out.println("fib iter    " + n + "! zajelo " + (System.nanoTime() - startTime) + " nanosekund");
    }

}