import java.util.Scanner;

public class TakeName {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);

        int id = ms.nextInt();
        System.out.println("Id: " + id);

        ms.nextLine();

        System.out.print("Enter a name: ");
        String name = ms.nextLine();

        System.out.println("You entered: " + name);

        ms.close();
    }
}