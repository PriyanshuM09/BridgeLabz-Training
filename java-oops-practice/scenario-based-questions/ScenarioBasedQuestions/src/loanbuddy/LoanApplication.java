package loanbuddy;

public abstract class LoanApplication implements IApprovable {

    protected String loanType;
    protected int term; // months
    protected double interestRate;

    private boolean approved; // internal control

    public LoanApplication(String loanType, int term, double interestRate) {
        this.loanType = loanType;
        this.term = term;
        this.interestRate = interestRate;
        this.approved = false;
    }

    protected void setApproved(boolean status) {
        this.approved = status;
    }

    public boolean isApproved() {
        return approved;
    }

    protected double calculateBaseEMI(double principal) {
        double R = interestRate / (12 * 100);
        int N = term;

        return (principal * R * Math.pow(1 + R, N)) /
               (Math.pow(1 + R, N) - 1);
    }
}

