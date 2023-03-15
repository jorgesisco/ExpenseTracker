import java.util.ArrayList;
import java.util.Scanner;

/**
 * A simple expense tracker that allows users to add, list, and view the total of their expenses.
 */
public class ExpenseTracker {

    /**
     * An ArrayList to store the Expense objects.
     */
    private final ArrayList<Expense> expenses;

    /**
     * Constructs an ExpenseTracker object with an empty list of expenses.
     */
    public ExpenseTracker() {
        expenses = new ArrayList<>();
    }

    /**
     * Adds an expense to the list of expenses.
     *
     * @param expense the Expense object to add
     */
    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    /**
     * Calculates the total amount of all expenses in the list.
     *
     * @return the total amount of all expenses
     */
    public double getTotalExpenses() {
        double total = 0;
        for (Expense expense : expenses) {
            total += expense.getAmount();
        }
        return total;
    }

    /**
     * Prints the list of expenses to the console.
     */
    public void listExpenses() {
        for (Expense expense : expenses) {
            System.out.println(expense);
        }
    }

    /**
     * The main method that runs the expense tracker application.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        ExpenseTracker tracker = new ExpenseTracker();
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.println("Enter a command (add/list/total/exit): ");
            command = scanner.nextLine();

            if (command.equalsIgnoreCase("add")) {
                System.out.println("Enter expense description: ");
                String description = scanner.nextLine();
                System.out.println("Enter expense amount: ");
                double amount = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                System.out.println("Enter expense date (yyyy-mm-dd): ");
                String date = scanner.nextLine();

                tracker.addExpense(new Expense(description, amount, date));
            } else if (command.equalsIgnoreCase("list")) {
                tracker.listExpenses();
            } else if (command.equalsIgnoreCase("total")) {
                System.out.printf("Total expenses: $%.2f%n", tracker.getTotalExpenses());
            } else if (command.equalsIgnoreCase("exit")) {
                break;
            } else {
                System.out.println("Unknown command. Please try again.");
            }
        }

        scanner.close();
    }
}
