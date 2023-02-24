/**
 * @Class: StudentGrades
 * @Author: Richard Park
 * @Course: ITEC 2140 - 04, Spring 2023
 * @Written: February 28, 2023
 * Description: This program will prompt the user for student grades, calculate
 *              and displays the average in the class
 */

import java.util.Scanner;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //The number of students in the class
        System.out.println("Please enter the number of students: ");
        int students = sc.nextInt();

        // Input the students grade and the sum of the students grade
        int count = 1;
        double sum = 0;
        while(count <= students){
            System.out.println("Please enter the student grade: ");
            double grade = sc.nextDouble();
            sum = sum + grade;
            count++;
        }

        //The average grade of the class
        System.out.println("The class average is " + sum / students);
    }
}
