# Expense Tracker

A simple console-based expense tracker application written in Java. This application allows users to add expenses, list expenses, and calculate the total expenses.

## Features

- Add an expense with description, amount, and date
- List all expenses
- Calculate the total amount of all expenses

## Usage

Run the `ExpenseTracker` class in your favorite Java IDE or from the command line. The application will prompt you to enter commands to interact with the system.

Available commands:

- `add`: Add a new expense by entering its description, amount, and date (in yyyy-mm-dd format)
- `list`: List all the expenses added
- `total`: Display the total amount of all expenses
- `exit`: Exit the application

## Example

```
Enter a command (add/list/total/exit):
add
Enter expense description:
Groceries
Enter expense amount:
45.20
Enter expense date (yyyy-mm-dd):
2023-03-15
```


## Limitations

- The expenses are stored in memory and not persisted to any external storage. The data will be lost when the application is closed.
- The date format is not validated; users must enter dates in the `yyyy-mm-dd` format.

## Future Improvements

- Save expenses to a file or database for persistence
- Add expense categories
- Provide summary reports based on date ranges and categories
- Implement a graphical user interface (GUI) for easier interaction

