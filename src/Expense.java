public class Expense {

    private final String description;

    private final double amount;

    private final String date;

    public Expense(String description, double amount, String date) {
        this.description = description;
        this.amount = amount;
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "description='" + description + '\'' +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                '}';
    }
}