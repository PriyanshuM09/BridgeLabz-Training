package budgetWise;
import java.util.ArrayList;

public class Budget {
protected double income;
protected double limit;
protected String[] categoryLimits;
protected ArrayList<Transaction> transactions= new ArrayList<>();

public Budget(double income, double limit, String[] categories) {
	this.income=income;
	this.limit= limit;
	this.categoryLimits= categories;
}

public void addTransaction(Transaction t) {
	transactions.add(t);
}
protected double getTotalExpenses() {
    double total = 0;
    for (Transaction t : transactions) {
        if (t.getType().equalsIgnoreCase("expense")) {
            total += t.getAmount();
        }
    }
    return total;
}
public double calculateSavings() {
    return income - getTotalExpenses();
}
}
