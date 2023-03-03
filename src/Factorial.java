/**
 * @Class: Factorial
 * @Author: Richard Park
 * @Course: ITEC 2140 - 04, Spring 2023
 * @Written: March 14, 2023
 * Description: This program would ask the user to enter a number, and the program would find the factorial
 */

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        //input a number
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = sc.nextInt();
        int count = 1;

        //for loop to find the factorial of the number
        for(int i = 1; i <= num; i++) {
            count = count * i;
        }
        System.out.println("Factorial of " + num + " is " + count);
    }
}
