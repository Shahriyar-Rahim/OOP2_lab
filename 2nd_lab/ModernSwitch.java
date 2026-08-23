import java.util.Scanner;

public class ModernSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the day number (1-7) or 'Exit' to stop the program: ");
            String input = sc.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Programmed shut down gracefully");
                break;
            }

            try {
                int day = Integer.parseInt(input);
                String result = switch (day) {
                    case 1 -> "Sunday";
                    case 2 -> "Monday";
                    case 3 -> "Tuesday";
                    case 4 -> "Wendessday";
                    case 5 -> "Thursday";
                    case 6, 7 -> "Weekend";
                    default -> "Invalid day number! Please enter 1-7.";
                };

                System.out.println("Result: " + result + "\n");
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid integer or 'exit'.\n");
            }
        }
        sc.close();
    }
}