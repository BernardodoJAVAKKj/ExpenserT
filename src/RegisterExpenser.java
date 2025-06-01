import java.util.Scanner;

public class RegisterExpenser {

    public static Expenser run() {
        Scanner sc = new Scanner(System.in);

        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        System.out.print("Enter expense name: ");
        String name = sc.nextLine();

        System.out.print("Enter expense value: $");
        double value = sc.nextDouble();

        System.out.print("Enter day (1-31): ");
        int day = sc.nextInt();

        System.out.println("Select month number:");
        for (int i = 0; i < months.length; i++) {
            System.out.println((i + 1) + " - " + months[i]);
        }
        int month = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter description: ");
        String description = sc.nextLine();

        System.out.print("Is this expense mandatory? (yes/no): ");
        String mandatoryStr = sc.nextLine();

        boolean mandatory = mandatoryStr.equalsIgnoreCase("yes");

        if (mandatory) {
            return new Mandatory(day, month, name, value, description);
        } else {
            return new OptionalExpenser(day, month, name, value, description);
        }
    }
}
