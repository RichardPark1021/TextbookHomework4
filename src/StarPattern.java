/**
 * @Class: StarPattern
 * @Author: Richard Park
 * @Course: ITEC 2140 - 04, Spring 2023
 * @Written: February 28, 2023
 * Description: This program will create a pattern of stars
 */
public class StarPattern {
    public static void main(String[] args) {

        for(int i = 1; i <= 6; i++) {
            for(int j = i; j <= 6; j++){
                //Print out the stars for each row
                System.out.print("*");
            }
            //skip to the next set of rows
            System.out.println();
        }
    }
}
