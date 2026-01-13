package budgetWise;

public class BudgetWiseApp {
    public static void main(String[] args) {

        String[] categories = {"Food", "Rent", "Travel", "Shopping"};
        MonthlyBudget mb = new MonthlyBudget(50000, 40000, categories);

        mb.addTransaction(new Transaction(8000, "expense", "Food"));
        mb.addTransaction(new Transaction(15000, "expense", "Rent"));
        mb.addTransaction(new Transaction(3000, "expense", "Travel"));

      mb.generateReport();
      mb.detectOverspend();

      System.out.println();

        AnnualBudget ab = new AnnualBudget(600000, 480000, categories);
        
      ab.addTransaction(new Transaction(120000, "expense", "Rent"));
      ab.addTransaction(new Transaction(50000, "expense", "Travel"));
        ab.generateReport();
        ab.detectOverspend();
    }
}

