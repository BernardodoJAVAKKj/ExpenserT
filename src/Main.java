import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your monthly budget: $");
        double budget = sc.nextDouble();
        sc.nextLine();

        ExpenserManager manager = new ExpenserManager(budget);

        int choice;

        do {
            System.out.println("\n Menu:");
            System.out.println("1 - Add expense");
            System.out.println("2 - Update expense");
            System.out.println("3 - Remove expense");
            System.out.println("4 - List expenses");
            System.out.println("5 - Export for Excel");
            System.out.println("6 - Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    Expenser expense = RegisterExpenser.run();
                    manager.addExpenser(expense);
                    System.out.println("Expense added!");
                }
                case 2 -> {
                    System.out.print("Enter the index of the expense to update: ");
                    int index = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter new expense data:");
                    Expenser newExpense = RegisterExpenser.run();
                    manager.updateExpenser(index, newExpense);
                    System.out.println("Expense updated!");
                }
                case 3 -> {
                    System.out.print("Enter the index of the expense to remove: ");
                    int index = sc.nextInt();
                    sc.nextLine();

                    manager.removeExpenser(index);
                    System.out.println("Expense removed!");
                }
                case 4 -> {
                    System.out.println("Your expenses:");
                    for (int i = 0; i < manager.getExpensers().size(); i++) {
                        System.out.println((i + 1) + ": " + manager.getExpensers().get(i));
                    }

                }
                case 5 -> {
                    csv.exportExpensesToCSV(manager.getExpensers(), "expenses.csv");
                }

                case 6 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid option. Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
