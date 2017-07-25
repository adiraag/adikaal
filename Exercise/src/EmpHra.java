import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by upadhyad on 7/25/2017.
 */
public class EmpHra {

    public static void main(String[] args) {


        List<EmpSalary> sal = new ArrayList<>(10);

        EmpSalary e1 = new EmpSalary(25000.00);
        EmpSalary e2 = new EmpSalary(35000.00);
        EmpSalary e3 = new EmpSalary(45000.00);
        EmpSalary e4 = new EmpSalary(55000.00);
        EmpSalary e5 = new EmpSalary(65000.00);
        EmpSalary e6 = new EmpSalary(75000.00);
        EmpSalary e7 = new EmpSalary(85000.00);
        EmpSalary e8 = new EmpSalary(95000.00);
        EmpSalary e9 = new EmpSalary(125000.00);
        EmpSalary e10 = new EmpSalary(225000.00);

        sal.add(e1);
        sal.add(e2);
        sal.add(e3);
        sal.add(e4);
        sal.add(e5);
        sal.add(e6);
        sal.add(e7);
        sal.add(e8);
        sal.add(e9);
        sal.add(e10);


        Iterator<EmpSalary> itr = sal.iterator();
        while (itr.hasNext()) {
            System.out.println("HRA" + itr.next().getSalary() * (.3));



        }}}

//list.add(new EmpSalary(500000));