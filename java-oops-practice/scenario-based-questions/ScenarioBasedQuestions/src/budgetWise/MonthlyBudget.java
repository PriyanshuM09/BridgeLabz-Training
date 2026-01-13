package budgetWise;

public class MonthlyBudget extends Budget implements IAnalyzable {

    public MonthlyBudget(double income, double limit, String[] categories) {
        super(income, limit, categories);
    }

    @Override
    public void generateReport() {
        System.out.println("----- Monthly Report -----");
        System.out.println("Income: " + income);
        System.out.println("Expenses: " + getTotalExpenses());
        System.out.println("Savings: " + calculateSavings());
    }
    @Override
    public void detectOverspend() {
        if (getTotalExpenses() > limit) {
            System.out.println("Warning: Monthly budget exceeded!");
        } else {
            System.out.println("Monthly budget under control.");
        }
    }
}

