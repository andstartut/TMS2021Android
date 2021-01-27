import java.util.Random;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        System.out.println(operation(1));
        System.out.println(operation(0));
        foobar(6);
        foobar(10);
        foobar(15);
        printMatrix();
        printPrimeNumbers();
    }

    /**
     * Method should perform some operation with int "number" based on some conditions:
     * - if number is positive - increase it by 1
     * - if number is negative - decrease it by 2
     * - if number is equal to zero - replace it with 10
     * return number value after operation
     */
    public static int operation(int number) {
        if (number == 0) {
            return 10;
        } else if (number < 0) {
            return number - 2;
        } else {
            return ++number;
        }
    }

    /**
     * Method should print different strings in console based on some conditions:
     * - if remainder of the division number by 3 is zero - print "foo" (example of number - 6)
     * - if remainder of the division number by 5 is zero - print "bar" (example of number - 10)
     * - if remainder of the division number by both 3 and 5 is zero 0  and - print "foobar" (example of number - 15)
     */
    public static void foobar(int number) {
        if (number % 3 == 0 & number % 5 != 0) {
            System.out.println("foo");
        } else if (number % 3 != 0 & number % 5 == 0) {
            System.out.println("bar");
        } else if (number % 3 == 0 & number % 5 == 0) {
            System.out.println("foobar");
        }
    }

    /**
     * Steps to implement:
     * - Read two ints from console
     * - Create a two-dimensional int array (use ints that you read from console height and width)
     * - Fill array with random values (under 100)
     * - Print in console matrix with given size, but:
     * - If remainder of the division array element by 3 is zero - print "+" sign instead of array element value
     * - If remainder of the division array element by 7 is zero - print "-" sign instead of array element value
     * - Print "*" otherwise
     * <p>
     * Example:
     * - Values from console -  2 and 3
     * - Array will look like this (values be different because it's a random)
     * 6 11 123
     * 1 14 21
     * - For this values output in console should be:
     * <p>
     * + * *
     * * - +
     * <p>
     * Note that 21 % 3 == 0 and 21 % 7 = 0, but output is not +-, but +
     */
    public static void printMatrix() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int height = scanner.nextInt();
        int width = scanner.nextInt();
        if (height > 0 & width > 0) {
            int[][] matrix = new int[height][width];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = 21/*random.nextInt(100)*/;
                }
            }
            for (int[] row : matrix) {
                for (int element : row) {
                    if ((element % 3 == 0 & element % 7 == 0) || element % 3 == 0) {
                        System.out.print("+ ");
                    } else if (element % 7 == 0) {
                        System.out.print("- ");
                    } else {
                        System.out.print("* ");
                    }
                }
                System.out.print("\n");
            }
        } else {
            System.out.println("unavailable values");
        }
    }

    /**
     * (optional)
     * Method should print all prime numbers < 1000
     */
    public static void printPrimeNumbers() {
        for (int i = 2; i < 1000; i++) {
            int count = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count < 2) {
                System.out.print(i + " ");
            }
        }
    }
}
