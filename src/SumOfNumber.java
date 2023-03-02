/**
 * @Class: SumOfNumber
 * @Author: Richard Park
 * @Course: ITEC 2140 - 04, Spring 2023
 * @Written: March 14, 2023
 * Description: The program will accept an integer from the user and display
 *              the sum of the digits of the provided integer
 */

import java.util.Scanner;
public class SumOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input for digit
        System.out.print("Please enter a positive integer: ");
        int num = sc.nextInt();

        //Checks if the number is not negative and prints the sum of the digit
        if(num >= 0) {
            int sum = 0;
            while(num != 0) {
                sum += num % 10;
                num /= 10;
            }
            System.out.println("The sum of the digits: " + sum);
        }
        else {
            System.out.println("Invalid input. Please enter a positive integer.");
        }
    }
}
