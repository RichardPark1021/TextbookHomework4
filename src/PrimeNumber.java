/**
 * @Class: PrimeNumber
 * @Author: Richard Park
 * @Course: ITEC 2140 - 04, Spring 2023
 * @Written: March 14, 2023
 * Description: This program will prompt the user for an integer and displays
 *              if the provided integer is a prime number or nut
 */

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Prompts the user to enter a number
        System.out.print("Please enter a number: ");
        int num = sc.nextInt();

        //Checks if the number is prime
        int count = 1;
        int num2 = 0;
        while(num % count == 0) {
            num2 = num2 + 1;
            count++;
        }

        //Prints if the number is prime or not prime
        if(num2 == 1) {
            System.out.println(num + " is a prime number");
        }
        else {
            System.out.println(num + " is not a prime number");
        }
    }
}
