package day10forloopwhileloop;

import java.util.Scanner;

public class NestedForLoop {

    public static void main(String[] args) {

        //1.Example: Type 3 times Hello1 , Type 3 times Hello2 , Type 3 times Hello3 , Type 3 times Hello4 ,
        for (int i = 1; i <= 4 ; i++) {

            for (int k = 1; k < 4; k++) {
                System.out.println("Hello" +i);

            }

        }

        /*
        2.Example: Type code to get the output Like
        Week:1
        Day:1
        Day:2
        Day:3
        .....
         Week:2
        Day:1
        Day:2
        Day:3
        .....
         Week:3
        Day:1
        Day:2
        Day:3
        .....
         */

        for (int i = 0; i < 3; i++) {
            System.out.println("Week" + (i+1));


            for (int j = 0; j < 3; j++) {
                System.out.println("Day:" + (j+1));
            }
            System.out.println(".....");
        }

        /*
        Write a Java Program to Print Rectangle Star Pattern using For Loop
        ****
        ****
        ****
        Note: Get the number of rows and columns from user
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = scan.nextInt();
        System.out.println("Enter the number of columns");
        int columns = scan.nextInt();

        for (int i = 1; i < rows+1 ; i++) {

            for (int j = 1; j < columns+1; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

        /*
        6.Example: Type code to get the output line
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
         */

        int numOfRows = 10;

        for (int i = 1; i < numOfRows+1; i++) {

            for (int j = 1; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }
}
