package budgetWise;

public class AnnualBudget extends Budget implements IAnalyzable {

    public AnnualBudget(double income, double limit, String[] categories) {
        super(income, limit, categories);
    }

    @Override
    public void generateReport() {
        System.out.println("  --  Annual Financial Report --");
        System.out.println("Yearly Income: " + income);
        System.out.println("Yearly Expenses: " + getTotalExpenses());
        System.out.println("Net Savings: " + calculateSavings());
    }

    @Override
    public void detectOverspend() {
        if (getTotalExpenses() > limit) {
            System.out.println("Alert: Annual budget exceeded!");
        } else {
            System.out.println("Annual budget is safe.");
        }
    }
}
