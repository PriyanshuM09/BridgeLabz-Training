import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];


        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

       
        for (int i = 0; i < 10; i++) {
            double sal = sc.nextDouble();
            double years = sc.nextDouble();

          
            if (sal <= 0 || years < 0) {
                System.out.println("Invalid input");
                i--; 
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = years;
        }

      
        for (int i = 0; i < 10; i++) {

            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;  // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02;  // 2% bonus
            }

            newSalary[i] = salary[i] + bonus[i];

          
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

     
        System.out.println(" Employee Bonus Details ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) +
             " | Old Salary: " + salary[i] +" | Bonus: " + bonus[i] +" | New Salary: " + newSalary[i]);
        }

        System.out.println(" Company Summary");
        System.out.println("Total Old Salary" + totalOldSalary);
        System.out.println("Total Bonus Payout" + totalBonus);
        System.out.println("Total New Salary" + totalNewSalary);
    }
}
