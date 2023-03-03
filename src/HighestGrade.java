/**
 * @Class: HighestGrade
 * @Author: Richard Park
 * @Course: ITEC 2140 - 04, Spring 2023
 * @Written: March 14, 2023
 * Description: The program will prompt the user for student grades and display the highest and
 *              lowest grades in the class
 */
import java.util.Scanner;
public class HighestGrade {
    public static void main(String[] args) {
        //Input the number of students
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int student = sc.nextInt();

        double lowestGrade;
        double highestGrade;

        System.out.print("Enter the student's grade: ");
        double currentGrade = sc.nextDouble();

        lowestGrade = currentGrade;
        highestGrade = currentGrade;
        for(int i = 1; i <= student-1; i++) {
            // input the student's grade
            System.out.print("Enter the student's grade: ");
            double grade = sc.nextDouble();

            // updates the highest and lowest grades
            if(grade > highestGrade) {
                highestGrade = grade;
            }
            else if(grade < lowestGrade) {
                lowestGrade = grade;
            }
        }

        //prints out the highest and lowest grades
        System.out.println("Highest student grade is " + highestGrade);
        System.out.println("Lowest student grade is " + lowestGrade);
    }
}
