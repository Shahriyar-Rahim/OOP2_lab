import java.util.Scanner;

enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    public static Day fromInt(int dayNum) {
        if(dayNum < 1 || dayNum > 7){
            throw new IllegalArgumentException("Day number must be between 1 and 7.");
        }

        return values()[dayNum - 1];
    }
}
public class ModernSwitchWithEnum {
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
                int dayNum = Integer.parseInt(input);

                Day day = Day.fromInt(dayNum);

                String result = switch (day){
                    case MONDAY -> "Monday";
                    case TUESDAY -> "Tuesday";
                    case WEDNESDAY -> "Wednesday";
                    case THURSDAY -> "Thursday";
                    case FRIDAY -> "Friday";
                    case SATURDAY, SUNDAY -> "Weekend";
                };

                System.out.println("Result: " + result + "\n");
            } catch (NumberFormatException e) {
                System.out.println("Error: Input must be a valid integer or 'exit'.\n");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage() + "\n");
            }
        }
        sc.close();
    }
}
