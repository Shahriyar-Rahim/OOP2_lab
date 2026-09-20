package sumOfTwoNum;

import java.util.Scanner;

public class sumTwNm {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter another number: ");
        int b = sc.nextInt();

        System.out.print("Sum of " + a + " and " + b +" is " + (a+b));

        sc.close();
    }
}
