package loanbuddy;

public class AutoLoan extends LoanApplication{
    public AutoLoan(int term) {
        super("Auto Loan", term, 10.0);
    }

    public boolean approveLoan(Applicant applicant) {
        if (applicant.getCreditScore() >= 650 &&
            applicant.getIncome() >= 30000) {
            setApproved(true);
        }
        return isApproved();
    }
    public double calculateEMI() {
        return calculateBaseEMI(300000);
    }
}

