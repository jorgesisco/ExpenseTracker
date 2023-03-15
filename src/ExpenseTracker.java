import java.util.ArrayList;
import java.util.Scanner;
public class ExpenseTracker {
    private final ArrayList<Expense> expenses;

    public ExpenseTracker() {
        expenses = new ArrayList<>();
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }
}
