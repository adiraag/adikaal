import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * Created by upadhyad on 7/25/2017.
 */
public class RevisedSalary {

    public static void main(String[] args) {

        List<EmpSalary> salary = new ArrayList<>(10);

        EmpSalary e1 = new EmpSalary(25000.00);
        EmpSalary e2 = new EmpSalary(35000.00);
        EmpSalary e3 = new EmpSalary(15000.00);
        EmpSalary e4 = new EmpSalary(5000.00);
        EmpSalary e5 = new EmpSalary(6500.00);
        EmpSalary e6 = new EmpSalary(7500.00);
        EmpSalary e7 = new EmpSalary(85000.00);
        EmpSalary e8 = new EmpSalary(95000.00);
        EmpSalary e9 = new EmpSalary(125000.00);
        EmpSalary e10 = new EmpSalary(225000.00);

        salary.add(e1);
        salary.add(e2);
        salary.add(e3);
        salary.add(e4);
        salary.add(e5);
        salary.add(e6);
        salary.add(e7);
        salary.add(e8);
        salary.add(e9);
        salary.add(e10);


        Iterator<EmpSalary> itr = salary.iterator();

        while (itr.hasNext()) {

            EmpSalary val = itr.next();
            if (val.getSalary() < 20000) {
                val.setSalary(val.getSalary() + (val.getSalary() * (0.2)));
            }
           
        }
        Iterator<EmpSalary> itr1 = salary.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next().getSalary());
        }
    }
}
//Empsalary val = itr.next();
//  if(val.getsalary < 20000) {
//val.setSalary + (val.get