import java.util.Scanner;

public class NameCheck {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String name = "";

        while (true) {
            System.out.print("Enter the name of Mantasa: ");
            name = myScanner.nextLine();

            if (name.equals("Lokkhi")) {
                System.out.println("Correct! Her name is Lokkhi.");
                break;
            } else {
                System.out.println("Her name is Lokkhi, you given wrong name, write again, DUMBBBBBB!!!!!!\n");
            }
        }

        myScanner.close();
    }
}
