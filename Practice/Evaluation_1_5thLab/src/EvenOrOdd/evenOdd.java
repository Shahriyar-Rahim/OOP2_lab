package EvenOrOdd;

import java.util.Scanner;

public class evenOdd {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        if(a % 2 == 0 )
            System.out.print("Even");
        else
            System.out.println("\n Odd");
    }
}
