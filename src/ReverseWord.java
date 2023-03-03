/**
 * @Class: ReverseWord
 * @Author: Richard Park
 * @Course: ITEC 2140 - 04, Spring 2023
 * @Written: March 14, 2023
 * Description: The program will ask for a string and display the reverse of that value
 */
import java.util.Scanner;
public class ReverseWord {
    public static void main(String[] args) {
        //input a string value
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str1 = sc.nextLine();
        String reverse = "";

        //Reverse the string Backward
        for(int i = str1.length()-1; i >= 0; i--) {
            reverse = reverse + str1.charAt(i);
        }
        //Prints out the word in reverse
        System.out.print("Reversed String is: ");
        System.out.println(reverse);

        //checks if the two strings are equal
        if(str1.equals(reverse)) {
            System.out.println("The two strings are equal to each other");
        }
        else {
            System.out.println("The two strings are not equal to each other");
        }
    }
}
