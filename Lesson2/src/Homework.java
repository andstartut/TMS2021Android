import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
        System.out.println(max(50, 49));
        System.out.println(average(new int[]{1, 2, 3, 4, 5}));
        System.out.println(max(new int[]{1, 2, 3, 4, 5, 100, 99}));
        System.out.println(calculateHypotenuse());
    }

    /**
     * 1. Method should return sum of "a" and "b"
     * 2. (optional) if sum of a and b is more then int can store -- return -1;
     **/
    public static int sum(int a, int b) {
        return ((long)a + b > Integer.MAX_VALUE ? -1 : a + b);
    }

    /**
     * Method should return larger of two numbers ("a" and "b")
     * <p>
     * Example1:
     * a = 4,
     * b = 5
     * <p>
     * Method should return 5
     * Example2:
     * a = 10,
     * b = 10
     * <p>
     * Method should return 10
     */
    public static int max(int a, int b) {
        return (a >= b ? a : b);
    }

    /**
     * Method should return avg. value of given array (sum of all elements of array divided by array length).
     * <p>
     * Example:
     * array = {1,2,3,4,5}
     * Method should return 3
     */
    public static double average(int[] array) {
        double sumValues = 0;
        for (double element : array) {
            sumValues += element;
        }
        return sumValues / array.length;
    }

    /**
     * (optional)
     * Method should return max element of array. For example if array = {1,2,10,3} then method should return 10;
     **/
    public static int max(int[] array) {
        int maxElement = array[0];
        for (int element : array) {
            if (element > maxElement) {
                maxElement = element;
            }
        }
        return maxElement;
    }

    /**
     * (optional)
     * 1. Read two ints from console
     * 2. Using the Pythagorean theorem calculate value of hypotenuse if value of two given ints -- value of triangle legs
     * Example1:
     * Console input:
     * 3
     * 4
     * Method should return 5
     * <p>
     * Example2:
     * Console input:
     * 12
     * 16
     * Method should return 20
     */
    public static double calculateHypotenuse() {
        Scanner consoleIn = new Scanner(System.in);
        return Math.hypot(consoleIn.nextDouble(), consoleIn.nextDouble());
    }
}
