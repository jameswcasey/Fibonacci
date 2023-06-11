import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        fibonacci();
        fibonacciRecursive();
    }

    static void fibonacci() {
        int numberOne = 0;
        int numberTwo = 1;
        int numberThree = 0;
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        long startTime = System.nanoTime();
        while (input > numberThree) {
            numberThree = numberOne + numberTwo;
            numberOne = numberTwo;
            numberTwo = numberThree;
        }
        System.out.println("number: " + numberThree);
        System.out.println("Runtime: " + (System.nanoTime() - startTime));
    }

    static void fibonacciRecursive() {
        int numberOne = 0;
        int numberTwo = 1;
        int numberThree = 0;
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        long startTime = System.nanoTime();
        printSequence(input, numberOne, numberTwo, numberThree, startTime);

    }

    static void printSequence(int input, int numberOne, int numberTwo, int numberThree, long startTime ) {
        if (input > numberThree) {
            numberThree = numberOne + numberTwo;
            numberOne = numberTwo;
            numberTwo = numberThree;
            printSequence(input, numberOne, numberTwo, numberThree, startTime);
        } else {
            System.out.println("number: " + numberThree);
            System.out.println("Runtime: " + (System.nanoTime() - startTime));
        }
    }
}