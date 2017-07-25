/**
 * Created by upadhyad on 7/25/2017.
 */
public class AccountServices {
    public static void updateSalary(int salary) {
        if (salary < 30000) {
            System.out.println("Salary updated to " + (salary + 10000));
        }
    }

    public static void calculateTDS(int salary) {
        int tds = salary / 10;
    }
}

