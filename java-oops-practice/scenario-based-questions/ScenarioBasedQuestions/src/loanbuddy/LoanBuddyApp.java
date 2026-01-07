package loanbuddy;

public class LoanBuddyApp {

    public static void main(String[] args) {

        Applicant applicant = new Applicant(
                "Rahul Sharma",
                720,
                60000,
                500000
        );

        LoanApplication loan = new HomeLoan(240);

        if (loan.approveLoan(applicant)) {
            System.out.println("Loan Approved ");
            System.out.println("Monthly EMI: " + loan.calculateEMI());
            } 
        else{
            System.out.println("Loan Rejected ");
        }
    }
}

