package factorial;

import java.util.Scanner;

public class factorial {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        if(a < 0)
            System.out.println("Factorial can not be calculated in negative numbers!!!!!");
        else {
            long factorial = 1;
            for(int i = 1; i <= a; i++)
                factorial *=i;

            System.out.println("The factorial of " + a + " is: " + factorial);
        }
    }
}
