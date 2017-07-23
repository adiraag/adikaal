import java.util.Comparator;

/**
 * Created by upadhyad on 7/22/2017.
 */

    public class CompareEmployeeId implements Comparator<Employee> {

        public int compare(Employee e1, Employee e2) {

            return (e1.getEmpId() - e2.getEmpId());


        }
    }



