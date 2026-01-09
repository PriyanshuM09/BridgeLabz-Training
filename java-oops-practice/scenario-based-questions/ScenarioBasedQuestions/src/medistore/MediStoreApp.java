package medistore;

import java.time.LocalDate;

public class MediStoreApp {
    public static void main(String[] args) {

        Medicine t1 = new Tablet("Paracetamol", 5.0, LocalDate.of(2026, 5, 20));
        Medicine s1 = new Syrup("Cough Syrup", 120.0, LocalDate.of(2025, 3, 10));
        Medicine i1 = new Injection("Insulin", 350.0, LocalDate.of(2025, 1, 15));

        t1.sell(10);
        s1.sell(5);

        t1.checkExpiry();
        s1.checkExpiry();
        i1.checkExpiry();

        System.out.println("Remaining stock: " + t1.getQuantity());
    }
}
