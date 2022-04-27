package day10forloopwhileloop;

import java.util.Scanner;

public class ForLoop01 {
    public static void main(String[] args) {

        // Type code to find the sum of the integers from 12 to 231

        int sum = 0;
        for (int i = 12; i <= 231; i++) {

            sum += i;

        }
        // Note : If you put System.out.println() inside the loop you will see sum value for every loop
        // If you expect the sum value for every loop put it inside the loop , if you want to see the final value put it outside
        System.out.println(sum);

        // Type code to find the multiplication of the integers from 3 to 5
        int product = 1;
        for (int i = 3; i <= 5; i++) {
            product *= i;

        }
        System.out.println(product);

        // Example Type code to check if a given String is Polindrome
        // String : anna Reversed String: anna
        // Integer: 12321 Reversed Integer : 12321

        String str = "123321";
        String reversedStr = "";
        boolean polindrome = false;


        for (int i = str.length()-1; i >= 0;  i--) {

            reversedStr = reversedStr + str.charAt(i);

        }

        if (str.equalsIgnoreCase(reversedStr)) {
            System.out.println("Polindrome");
        } else {
            System.out.println("Not polindrome");
        }

        // Example Type code to check if a given String is Polindrome
        // String : anna Reversed String: anna
        // Integer: 12321 Reversed Integer : 12321

        int num = 12321;

        String stringFromNum = String.valueOf(num);
        String reversedNum = "";

        for (int i = stringFromNum.length()-1; i >= 0; i--) {
            reversedNum += stringFromNum.charAt(i);

        }

        if (stringFromNum.equalsIgnoreCase(reversedNum)) {
            System.out.println("Polindrome");
        } else {
            System.out.println("Not polindrome");
        }

        // Type code to find the sum of the digits of an integer

        int n = 111;
        int sumOfDigits = 0;
        int lastdigit = 0;

        for (int i = n; i > 0 ; i=i/10) {

            sumOfDigits = sumOfDigits + i%10;
        }

        System.out.println(sumOfDigits);

        //6.Example: Type code to find the sum of the unique digits of an integer
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");

        int p = scan.nextInt();
        String pS = String.valueOf(p);
        int sumOfUniqueDigits = 0;

        for (int i = 0; i < pS.length() ; i++) {

            String c = pS.substring(i,i+1);

            if (pS.lastIndexOf(c)==pS.indexOf(c)) {
                sumOfUniqueDigits = sumOfUniqueDigits + Integer.valueOf(c); // If you put char inside the valueOf() you will get ASCII value

            }

        }
        System.out.println(sumOfUniqueDigits);





    }

}
