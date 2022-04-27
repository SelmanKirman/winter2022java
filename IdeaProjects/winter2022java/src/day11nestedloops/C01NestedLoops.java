package day11nestedloops;

import java.util.Scanner;

public class C01NestedLoops {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please type a number");
        int number = scan.nextInt();

        for (int i = 1; i <= number; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j);

            }
            System.out.println();

        }
    }
}
