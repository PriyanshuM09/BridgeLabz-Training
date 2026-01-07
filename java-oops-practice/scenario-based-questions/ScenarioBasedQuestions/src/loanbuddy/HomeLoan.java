package loanbuddy;

public class HomeLoan extends LoanApplication {

    public HomeLoan(int term) {
        super("Home Loan", term, 8.5);
    }

    @Override
    public boolean approveLoan(Applicant applicant) {
        if (applicant.getCreditScore() >= 700 &&
            applicant.getIncome() >= 50000) {
            setApproved(true);
        }
        return isApproved();
    }

    @Override
    public double calculateEMI() {
        return calculateBaseEMI(500000);
    }
}

