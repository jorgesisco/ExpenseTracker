/**
 * Represents an expense with a description, amount, and date.
 */
public class Expense {

    /**
     * The description of the expense.
     */
    private final String description;

    /**
     * The amount of the expense.
     */
    private final double amount;

    /**
     * The date of the expense in the format "yyyy-MM-dd".
     */
    private final String date;

    /**
     * Constructs an Expense object with the given description, amount, and date.
     *
     * @param description the description of the expense
     * @param amount the amount of the expense
     * @param date the date of the expense in the format "yyyy-MM-dd"
     */
    public Expense(String description, double amount, String date) {
        this.description = description;
        this.amount = amount;
        this.date = date;
    }

    /**
     * Returns the description of this expense.
     *
     * @return the description of this expense
     */
    public String getDescription() {
        return description;
    }

    /**
     * Returns the amount of this expense.
     *
     * @return the amount of this expense
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Returns the date of this expense in the format "yyyy-MM-dd".
     *
     * @return the date of this expense in the format "yyyy-MM-dd"
     */
    public String getDate() {
        return date;
    }

    /**
     * Returns a string representation of this expense, containing its description, amount, and date.
     *
     * @return a string representation of this expense
     */
    @Override
    public String toString() {
        return "Expense{" +
                "description='" + description + '\'' +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                '}';
    }
}