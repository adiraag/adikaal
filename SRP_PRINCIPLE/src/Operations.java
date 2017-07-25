/**
 * Created by upadhyad on 7/25/2017.
 */
public class Operations {
    public static void main(String[] args) {

        EmployeeServices emp = new EmployeeServices(1,"AJAY",34000.00,"8959317903","MT");
        emp.eligibleForPromotion(5);
        ManagerServices.changeDesignation(2);
        ManagerServices.changeProject(4);
        AccountServices.calculateTDS(40000);
        AccountServices.updateSalary(25000);
    }
}

