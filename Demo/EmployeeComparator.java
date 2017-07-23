import java.util.Comparator;

/**
 * Created by upadhyad on 7/22/2017.
 */
public class EmployeeComparator implements Comparator<Employee> {


    public int compare(Employee e1, Employee e2) {

        int v = e1.getCity().compareTo(e2.getCity());

        if (v != 0) {
            return v;

        }
        v = e1.getDeptName().compareTo(e2.getDeptName());

        if (v != 0) {
            return v;
        }

        v = e1.getfName().compareTo(e2.getfName());

        if (v != 0) {
            return v;
        }

        v = e1.getlName().compareTo(e2.getlName());

        if (v != 0) {
            return v;
        }

        v = e1.getEmpId() - e2.getEmpId();


        return v;


    }

}



