/**
 * @Class: FibonacciSeries
 * @Author: Richard Park
 * @Course: ITEC 2140 - 04, Spring 2023
 * @Written: March 14, 2023
 * Description: Prints out the first 30 values in the Fibonacci series. A Fibonacci series begins with 0 and 1.
 *              The next number is then found by adding the previous two numbers.
 */

public class FibonacciSeries {
    public static void main(String[] args) {
        //Starting values for the Fibonacci series
        int a = 0;
        int b = 1;
        int c;
        System.out.print("The first 30 numbers in the Fibonacci series are: ");

        //For loop to print out the next set of numbers
        for(int i = 0; i < 30; i++) {
            System.out.print(a + " ");

            //updates the values a, b, and c
            c = a + b;
            a = b;
            b = c;
        }
    }
}
